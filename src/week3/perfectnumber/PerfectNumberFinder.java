package week3.perfectnumber;
import java.util.Scanner;

public class PerfectNumberFinder {

    public static void main(String[] args)
    {
        readInput();
    }

    /**
     * This method checks if the number is Perfect Number or not.
     * @param val is user entered decimal value
     * @return true if the val is a Perfect number. Otherwise, false.
     */
    public static boolean isPerfectNumber(int val){

        int sum = 0;

        for (int i = 1; i <= val / 2; ++i) {
            if (val % i == 0)
                sum += i;
        }
        return sum==val;
    }

    /**
     * readInput() method gets val input and use it in isPerfectNumber() method to check
     * if the val is Perfect number or not. Outputs condition of being Perfect Number as a String on the screen.
     */
    public static void readInput(){
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        int val = keyboard.nextInt();

        System.out.println(isPerfectNumber(val) ? "Perfect Number!" : "Not a Perfect Number!");
    }
}