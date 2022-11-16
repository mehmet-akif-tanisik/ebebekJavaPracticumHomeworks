package week3.minmax;

import java.util.Scanner;

public class MinMaxFinder {
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("How many numbers you want to enter: ");
        int n = keyboard.nextInt();

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
}
