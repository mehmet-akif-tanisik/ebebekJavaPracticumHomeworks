package week2.leapyear;

import java.util.Scanner;

public class LeapYearFinder {
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Please enter a year: ");
        int year = keyboard.nextInt();

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
            System.out.println(year + " is a leap year!");
        else
            System.out.println(year + " is not a leap year!");
    }
}
