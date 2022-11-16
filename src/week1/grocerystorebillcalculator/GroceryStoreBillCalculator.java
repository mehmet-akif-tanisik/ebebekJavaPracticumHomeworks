package week1.grocerystorebillcalculator;
import java.util.Scanner;

public class GroceryStoreBillCalculator {

    public static void main(String[] args) {
        showBill();
    }

    /**
     * calculateBill() method takes five parameters and calculates the total amount of bill as double.
     * @params apple,pear,tomato,eggplant,banana in kilograms
     * @return total amount of bill as double.
     */
    public static double calculateBill(double apple, double pear, double tomato, double eggplant, double banana){
        double appleCost=3.67, pearCost=2.14, tomatoCost=1.11, eggplantCost=5, bananaCost=0.95;

        return (apple * appleCost) + (pear * pearCost) + (tomato * tomatoCost) + (eggplant * eggplantCost) + (banana * bananaCost);
    }

    /**
     * showBill() method gets apple,pear,tomato,eggplant,banana inputs from user and calls calculateBill() method.
     * outputs the total amount of bill as a String on the screen.
     */
    public static void showBill(){
        double apple, pear, tomato, eggplant, banana;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Apple kg: ");
        apple = keyboard.nextDouble();

        System.out.print("Pear kg: ");
        pear = keyboard.nextDouble();

        System.out.print("Tomato kg: ");
        tomato = keyboard.nextDouble();

        System.out.print("Eggplant kg: ");
        eggplant = keyboard.nextDouble();

        System.out.print("Banana kg: ");
        banana = keyboard.nextDouble();

        System.out.printf("Total bill amount: %.2f", calculateBill(apple,pear,tomato,eggplant,banana));
    }
}