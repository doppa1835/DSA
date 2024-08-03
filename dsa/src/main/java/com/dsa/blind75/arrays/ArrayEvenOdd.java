package com.dsa.blind75.arrays;

/**
 * 
 * @author PriyaCherry
 * 
 *         This will arrange array elements even first followed by odd
 *         input=[2,7,8,9,4,6,20] output =[2,8,4,6,20,7,9]
 */
public class ArrayEvenOdd {
	public static void main(String[] args) {
		// Sample input array
		int[] numbers = { 12, 7, 5, 8, 9, 10, 15, 6, 21 };

		// Print the original array
		System.out.println("Original array: ");
		printArray(numbers);

		// Arrange even numbers first, followed by odd numbers
		arrangeEvenOddInPlace(numbers);

		// Print the arranged array
		System.out.println("Arranged array: ");
		printArray(numbers);
	}

	public static void arrangeEvenOddInPlace(int[] array) {
		int left = 0; // Pointer for the next position of an even number
		int right = array.length - 1; // Pointer for the next position of an odd number

		while (left <= right) {
			if (array[left] % 2 == 0) {
				// Move left pointer if the current number is even
				left++;
			} else {
				// Swap odd number at left pointer with the number at right pointer
				// and move the right pointer
				swap(array, left, right);
				right--;
			}
			printArray(array);
		}
	}

	// Helper method to swap two elements in the array
	private static void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

	// Helper method to print the array
	private static void printArray(int[] array) {
		for (int num : array) {
			System.out.print(num + " ");
		}
		System.out.println();
	}
}
