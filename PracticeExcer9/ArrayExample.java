package PracticeExcer9;

import java.util.Arrays;

public class ArrayExample {

	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 5 };

        // Print out the contents of the array
        System.out.println("The contents of the array are:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        // Calculate the sum of the elements in the array
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("The sum of the elements in the array is: " + sum);

        // Find the maximum element in the array
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("The maximum element in the array is: " + max);

        // Sort the array in ascending order
        Arrays.sort(numbers);
        System.out.println("The sorted array is:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

	}

}
