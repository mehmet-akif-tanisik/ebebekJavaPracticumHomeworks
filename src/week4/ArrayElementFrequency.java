package week4;

import java.util.Arrays;

public class ArrayElementFrequency {


    public static void countElementFrequencies(int[] arr)
    {
        boolean[] visited = new boolean[arr.length];
        Arrays.fill(visited, false);

        for (int i = 0; i < arr.length; i++) {
            if (visited[i])
                continue;

            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            System.out.printf("[  %-4d] --> %4d%n",arr[i],count);
        }
    }

    // Driver code
    public static void main(String []args)
    {
        int[] arr = { 3, 3, 1, 1, 1, 1, 2, 2, 6, 7 };
        System.out.println("Array --> " + Arrays.toString(arr)+"\n");
        System.out.println("Element\t\t Frequency");
        System.out.println("---------------------");
        countElementFrequencies(arr);
    }
}
