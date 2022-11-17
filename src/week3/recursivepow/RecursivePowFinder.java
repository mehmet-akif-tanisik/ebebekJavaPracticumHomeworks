package week3.recursivepow;
import java.util.Scanner;

public class RecursivePowFinder {
    public static void main(String[] args) {
        readInput();
    }

    /**
     * Returns the value of the first argument raised to the power of the second argument.
     * @param a the base
     * @param b the exponent
     * @return the value a to the power of b.
     */
    public static int power(int a, int b) {
        if (b != 0) {
            return (a * power(a, b - 1));
        }
        else {
            return 1;
        }
    }

    /**
     * readInput() method gets base and pow inputs from user
     * and calls power() method. Outputs base to the power of pow as a String on the screen.
     */
    public static void readInput(){
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Please enter base: ");
        int base = keyboard.nextInt();
        System.out.print("Please enter pow: ");
        int pow = keyboard.nextInt();

        System.out.println("Result: " + power(base,pow));
    }
}