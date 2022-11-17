package week3.minmax;
import java.util.Scanner;

public class MinMaxFinder {
    public static void main(String[] args)
    {
        readInput();
    }

    /**
     * Takes n numbers from user and prints out min and max of them.
     * @param n is total number that user will enter
     * @param keyboard object that will read user inputs
     */
    public static void findMinMax(int n, Scanner keyboard){

        int max = 0, min = 0;

        for (int i = 1; i <= n; ++i) {
            System.out.print(i + ". number: ");
            int number = keyboard.nextInt();

            max = Math.max(max, number);
            min = Math.min(min, number);
        }

        System.out.println("Max number: " + max);
        System.out.println("Min number: " + min);
    }

    /**
     * readInput() method gets total number input which is a total number of decimal from user
     * and calls findMinMax() method. Outputs min and max out of entered numbers as a String on the screen.
     */
    public static void readInput(){
        Scanner keyboard = new Scanner(System.in);

        System.out.print("How many numbers you want to enter: ");
        int n = keyboard.nextInt();

        findMinMax(n, keyboard);
    }
}