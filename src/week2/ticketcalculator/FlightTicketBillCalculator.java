package week2.ticketcalculator;
import java.util.Scanner;

public class FlightTicketBillCalculator {
    public static void main(String[] args)
    {
        readInput();
    }

    /**
     * If the passenger age is lower than 12, %50 discount will be applied to the bill
     * If the passenger age is between 12 and 24, %10 discount will be applied to the bill
     * If the passenger age is greater than 65, %30 discount will be applied to the bill
     * If the ticket is return-ticket, %20 discount will be applied to the bill
     * @param distance through the flight that will take
     * @param age is a passenger age (can't be lower than 0)
     * @param flightType 1 is one-way, 2 is return (can't be other than 1-2)
     * @return total amount of bill as double
     */
    public static double calculateBillAmount(int distance, int age, int flightType){

        double billAmount = distance * 0.10;

        if ((age <= 0) || (flightType < 1) || (flightType > 2) || (distance <= 0)) {
            System.out.println("You have entered invalid information!");
            System.exit(0);
            return 0;
        } else {
            if (age < 12){
                billAmount -= billAmount*0.5;
            }
            else if (age <= 24) {
                billAmount -= billAmount*0.1;
            } else {
                if (age>=65){
                    billAmount -= billAmount*0.3;
                }
            }
            if (flightType == 2){
                billAmount -= billAmount*0.2;
                billAmount*=2;
            }
            return billAmount;
        }
    }

    /**
     * readInput() method gets distance, age and flightType inputs from user and calls calculateBillAmount() method.
     * outputs total amount of bill as a String on the screen.
     */
    public static void readInput(){
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Please enter flight distance(km): ");
        int distance = keyboard.nextInt();

        System.out.print("Please enter your age: ");
        int age = keyboard.nextInt();

        System.out.print("Please enter your flight type." +
                "(1 => One way , 2 => Return): ");
        int flightType = keyboard.nextInt();

        System.out.println("Total ticket bill amount: " + calculateBillAmount(distance,age,flightType));
    }
}