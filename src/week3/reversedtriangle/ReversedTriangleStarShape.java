package week3.reversedtriangle;

import java.util.Scanner;

public class ReversedTriangleStarShape {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Total digit number: ");
        int number = keyboard.nextInt();

        for (int i = number; i >= 1; i--) {
            for (int j = number - i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int k = (2 * i - 1); k >= 1; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
