package week3.fibonacci;

import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Please enter element number:");
        int count = keyboard.nextInt();

        int n1 = 0, n2 = 1, sum;

        System.out.print(n1 + " " + n2);

        for (int i = 2; i < count; ++i)
        {
            sum = n1 + n2;
            System.out.print(" " + sum);
            n1 = n2;
            n2 = sum;
        }

    }
}
