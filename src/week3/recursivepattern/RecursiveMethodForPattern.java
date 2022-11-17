package week3.recursivepattern;
import java.util.Scanner;

public class RecursiveMethodForPattern {


    public static void main(String[] args) {
        readInput();
    }

    /**
     * Recursive method to start with initial number n. Decreases the number by 5.
     * If the number will be zero or negative, then increases the number till starting number again.
     * Prints each numbers in the pattern to the screen.
     * @param n is a starting number to create pattern
     */
    public static void printNum(int n){
        System.out.print(n + " ");
        if (n<=0){
            return;
        }
        printNum(n-5);
        System.out.print(n + " ");
    }

    /**
     * readInput() method gets starting number input and calls printNum() method.
     * Prints special number pattern on the screen.
     */
    public static void readInput(){
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Please enter starting number: ");
        int startingNumber = keyboard.nextInt();

        printNum(startingNumber);
    }
}