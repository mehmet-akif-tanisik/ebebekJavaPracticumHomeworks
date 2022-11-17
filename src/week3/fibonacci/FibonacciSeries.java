package week3.fibonacci;
import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args)
    {
        readInput();
    }

    /**
     * This method prints n element of Fibonacci series. (0-count)
     * @param count total element of a Fibonacci series
     */
    public static void printFibonacciSeries(int count){
        int n1 = 0, n2 = 1, sum;

        System.out.print(n1 + " " + n2);

        for (int i = 2; i <= count; ++i)
        {
            sum = n1 + n2;
            System.out.print(" " + sum);
            n1 = n2;
            n2 = sum;
        }
    }

    /**
     * readInput() method gets count input which is a total element number of a Fibonacci series from user
     * and calls printFibonacciSeries() method. Outputs fibonacci numbers 0-count as a String on the screen.
     */
    public static void readInput(){
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Please enter element number:");
        int count = keyboard.nextInt();

        printFibonacciSeries(count);
    }
}
