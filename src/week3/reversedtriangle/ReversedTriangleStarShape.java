package week3.reversedtriangle;
import java.util.Scanner;

public class ReversedTriangleStarShape {

    public static void main(String[] args) {
        System.out.println();
        readInput();
    }

    /**
     * This method prints number n times stars and in every iteration stars number will be decreased one till zero.
     * @param number is a depth of a triangle
     */
    public static void printPattern(int number){
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

    /**
     * readInput() method gets number and calls printPattern() method.
     * Outputs the triangle shape made with stars.
     */
    public static void readInput(){
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Total digit number: ");
        int number = keyboard.nextInt();

        printPattern(number);
    }
}