package week3.primenumbers;
import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        printPrimes();
    }

    /**
     * Finds if the value is prime or not.
     * @param val is a value that will be checked its prime condition.
     * @return  true if the val is prime number. Otherwise, false.
     */
    public static boolean isPrime(int val) {
        if (val <= 1)
            return false;
        if (val % 2 == 0)
            return val == 2;
        if (val % 3 == 0)
            return val == 3;
        if (val % 5 == 0)
            return val == 5;
        if (val % 7 == 0)
            return val == 7;
        for (int i = 11; i * i < val; i += 2)
            if (val % i == 0)
                return false;
        return true;
    }

    /**
     * printPrimes() method gets n as input and loop 0 through N to check
     * if the numbers are prime or not. Prints all prime numbers between 0-N.
     */
    public static void printPrimes(){

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Please enter limit to see prime numbers between 0-Limit: ");
        int n = keyboard.nextInt();

        for (int i = 0; i <= n; ++i)
            if (isPrime(i))
                System.out.printf("%d ", i);
    }
}