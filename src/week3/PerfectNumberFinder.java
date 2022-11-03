package week3;

import java.util.Scanner;

public class PerfectNumberFinder {

    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        int val = keyboard.nextInt();

        int sum = 0;

        for (int i = 1; i <= val / 2; ++i) {
            if (val % i == 0)
                sum += i;
        }
        System.out.println(sum == val ? "Perfect Number!" : "Not a Perfect Number!");
    }
}
