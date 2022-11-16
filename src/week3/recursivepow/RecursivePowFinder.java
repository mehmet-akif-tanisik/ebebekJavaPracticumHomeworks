package week3.recursivepow;

import java.util.Scanner;

public class RecursivePowFinder {

    public static int power(int base, int pow) {
        if (pow != 0) {
            return (base * power(base, pow - 1));
        }
        else {
            return 1;
        }
    }

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Please enter base: ");
        int base = keyboard.nextInt();
        System.out.print("Please enter pow: ");
        int pow = keyboard.nextInt();

        System.out.println(power(base,pow));
    }
}
