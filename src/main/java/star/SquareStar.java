package star;

import java.util.Scanner;

public class SquareStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        getSquareStar(length);
    }

    //kvadrat ulduzun sadece capa verilmesi
    static void getSquareStar(int lengthOfStar) {
        if (lengthOfStar < 3) {
            System.out.println("Uzunluq 3 den cox olmalidir");
            return;
        }

        if (lengthOfStar % 2 == 0) {
            System.out.println("Uzunluq tek reqem olmalidir");
            return;
        }

        String[][] ulduz = new String[lengthOfStar][lengthOfStar];
        int numberOfSpaces = lengthOfStar / 2;  //probellerin sayi

        for (int x = 0; x < lengthOfStar; x++) {
            for (int y = 0; y < lengthOfStar; y++) {

                int numberOfStars = lengthOfStar - Math.abs(numberOfSpaces); //ulduzun bitdiyi indeks
                if (y >= Math.abs(numberOfSpaces) && y < numberOfStars)
                    System.out.print(ulduz[x][y] = " * ");
                else
                    System.out.print(ulduz[x][y] = "   ");
            }
            numberOfSpaces--;
            System.out.println();
        }
    }

}

