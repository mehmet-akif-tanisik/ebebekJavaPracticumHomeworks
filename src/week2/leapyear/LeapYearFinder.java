package week2.leapyear;
import java.util.Scanner;

public class LeapYearFinder {
    public static void main(String[] args)
    {
        showLeapYear();
    }

    /**
     * If the year mod 4 is zero and year mod 100 is not zero or year mod 400 is zero.
     * if the year satisfies these expressions then it's a leap year.
     * @param year specific year to check if its leap year or not
     * @return true if the year is leap year, otherwise false.
     */
    public static boolean isLeapYear(int year){
        return (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);
    }

    /**
     * showLeapYear() method gets year input from user and calls isLeapYear() method.
     * outputs if the user entered input is a leap year or not as a String on the screen.
     */
    public static void showLeapYear(){
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Please enter a year: ");
        int year = keyboard.nextInt();

        if (isLeapYear(year))
            System.out.println(year + " is a leap year!");
        else
            System.out.println(year + " is not a leap year!");

    }
}