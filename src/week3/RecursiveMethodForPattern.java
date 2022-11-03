package week3;

import java.util.Scanner;

public class RecursiveMethodForPattern {
    public static void printNum(int n){
        System.out.print(n + " ");
        if (n<=0){
            return;
        }
        printNum(n-5);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Please enter starting number: ");
        int startingNumber = keyboard.nextInt();

        printNum(startingNumber);
    }
}