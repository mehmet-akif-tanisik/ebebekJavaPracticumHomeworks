package week2.chinesezodiac;
import java.util.Scanner;

public class ChineseZodiacSignFinder {

    public static void main(String[] args) {
        showZodiacSign();
    }

    /**
     * showZodiacSign() method gets birth year input from user and calls chineseZodiacFinder() method.
     * outputs the chinese zodiac sign as a String on the screen.
     */
    public static void showZodiacSign() {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a birth year: ");
        int year = input.nextInt();

        System.out.println("Your chinese zodiac sign is " + chineseZodiacFinder(year));
    }

    /**
     * This method takes a mod of a birthyear and returns the chinese zodiac sign according to the remaning number.
     * @param birthYear a person's birthyear
     * @return a chinese zodiac sign as String.
     */
    public static String chineseZodiacFinder(int birthYear) {

        String zodiacSign = "";

        switch (birthYear % 12) {
            case 0:
                zodiacSign = "Monkey";
                break;
            case 1:
                zodiacSign = "Rooster";
                break;
            case 2:
                zodiacSign = "Dog";
                break;
            case 3:
                zodiacSign = "Pig";
                break;
            case 4:
                zodiacSign = "Rat";
                break;
            case 5:
                zodiacSign = "Ox";
                break;
            case 6:
                zodiacSign = "Tiger";
                break;
            case 7:
                zodiacSign = "Rabbit";
                break;
            case 8:
                zodiacSign = "Dragon";
                break;
            case 9:
                zodiacSign = "Snake";
                break;
            case 10:
                zodiacSign = "Horse";
                break;
            case 11:
                zodiacSign = "Sheep";
                break;
        }
        return zodiacSign;
    }
}