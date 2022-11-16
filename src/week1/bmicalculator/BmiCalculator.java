package week1.bmicalculator;



import java.util.Scanner;

public class BmiCalculator {
    public static void main(String[] args) {
        showBmi();
    }

    /**
     * Takes two parameters(weight and height) and calculates the basal metabolic rate.
     * @param weight person weight in kilograms
     * @param height person height in meters
     * @return basal metabolic rate as double
     */
    public static double calculateBmi(double weight, double height){
        return weight / (height*height);
    }

    /**
     * readInput() method gets height and weight inputs from user and calls calculateBmi() method.
     * Outputs the basal metabolic rate as a String on the screen.
     */
    public static void showBmi(){

        double weight, height;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Please enter your height(as meter e.q: 1,72): ");
        height = keyboard.nextDouble();
        System.out.print("Please enter your weight(as kilogram e.q: 76): ");
        weight = keyboard.nextDouble();

        System.out.printf("Your BMI is: %.2f", calculateBmi(weight,height));
    }
}