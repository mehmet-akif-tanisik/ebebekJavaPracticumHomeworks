package week4;



import java.util.Arrays;
import java.util.Scanner;

public class ArraySelectionSort {

    public static void sortArray(double[] array){

        for (int i=0; i<array.length; i++){
            int index= findMin(array,i);
            interchange(array,i,index);
        }
    }

    public static int findMin(double[] array,int startIndex){

        int index=startIndex;
        double min = array[index];

        for (int i=startIndex+1; i<array.length; i++){
            if (array[i]<min){
                min=array[i];
                index=i;
            }
        }
        return index;
    }

    public static void interchange(double[] array, int i1, int i2){

        double temp = array[i1];
        array[i1] = array[i2];
        array[i2] = temp;

    }

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.print("How many numbers you want to store in an array ?\n" +
                "Array size: " );
        int size = keyboard.nextInt();

        double[] array = new double[size];

        System.out.println("Please enter elements one by one below: ");
        for (int i=0 ; i<array.length; i++){
            System.out.print("-->  ");
            array[i] = keyboard.nextDouble();
        }

        System.out.println("Unsorted array -- > " + Arrays.toString(array));
        sortArray(array);
        System.out.println("Sorted array -- > " + Arrays.toString(array));

    }

}
