package week1;



import java.util.Scanner;

public class BmiCalculator {


    public static void main(String[] args) {

        // Declaration of weight(kg) and height(meters)
        double weight, height;
        // Declaration of basal metabolic rate(bmi)
        double bmi;

        //Initializing "keyboard" object from Scanner class that will read input from keyboard.
        Scanner keyboard = new Scanner(System.in);

        //Taking inputs height and weight from user using "keyboard" object.
        System.out.print("Please enter your height(as meter e.q: 1.72): ");
        height = keyboard.nextDouble();

        System.out.print("Please enter your weight(as kilogram e.q: 76): ");
        weight = keyboard.nextDouble();

        //Basal Metabolic Rate Formula ---- BMI = Weight / (Height * Height);
        bmi = weight / (height*height);

        //Screen output to show basal metabolic rate of user.
        System.out.printf("Your BMI is: %.2f", bmi);


    }

}
