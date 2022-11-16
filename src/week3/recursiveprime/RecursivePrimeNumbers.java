package week3.recursiveprime;

import java.util.Scanner;

public class RecursivePrimeNumbers {
    static boolean isPrime(int n, int i)
    {
        if (n <= 2)
            return n == 2;
        if (n % i == 0)
            return false;
        if (i * i > n)
            return true;

        return isPrime(n, i + 1);
    }

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Please enter a number to see if it is Prime: ");
        int number = keyboard.nextInt();

        System.out.println(isPrime(number,2));

    }
}
