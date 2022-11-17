package week3.recursiveprime;
import java.util.Scanner;

public class RecursivePrimeNumbers {
    public static void main(String[] args) {
       readInput();
    }

    /**
     * Finds if the value is prime or not.
     * @param n is a value that will be checked its prime condition.
     * @param i iterator that will be increased until n.
     * @return true if the n is prime number. Otherwise, false.
     */
    public static boolean isPrime(int n, int i)
    {
        if (n <= 2)
            return n == 2;
        if (n % i == 0)
            return false;
        if (i * i > n)
            return true;

        return isPrime(n, i + 1);
    }

    /**
     * readInput() method gets number input and calls isPrime() method.
     * Prints "is a prime number" if the number is prime. Otherwise, prints "is not a prime number"
     */
    public static void readInput(){
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Please enter a number to see if it is Prime: ");
        int number = keyboard.nextInt();
        int i=2;

        System.out.println(isPrime(number,i) ? number+" is a prime number." : number + " is not a Prime number.");
    }
}