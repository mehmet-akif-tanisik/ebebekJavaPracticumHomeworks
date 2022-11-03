package week2;



import java.util.Scanner;

public class FlightTicketBillCalculator {
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Please enter flight distance(km): ");
        int distance = keyboard.nextInt();

        System.out.print("Please enter your age: ");
        int age = keyboard.nextInt();

        System.out.print("Please enter your flight type." +
                "(1 => One way , 2 => Return): ");
        int flightType = keyboard.nextInt();

        double billAmount = distance * 0.10;

        if ((age <= 0) || (flightType < 1) || (flightType > 2) || (distance <= 0)) {
            System.out.println("You have entered invalid information!");
            return;
        }

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

        System.out.println("Total ticket bill amount: " + billAmount);

    }
}
