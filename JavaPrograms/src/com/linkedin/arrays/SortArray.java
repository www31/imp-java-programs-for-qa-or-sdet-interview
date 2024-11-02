/**
 * 
 */
package com.linkedin.arrays;

/**
 * 3.) Sort an array without using in-built method
 */
public class SortArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 5, 2, 9, 1, 6 };
		selectionSort(array);
		System.out.println("Sorted array:");
		for (int num : array) {
			System.out.print(num + " ");
		}
	}

	public static void selectionSort(int[] array) {
		int n = array.length;
		for (int i = 0; i < n - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < n; j++) {
				if (array[j] < array[minIndex]) {
					minIndex = j;
				}
			}
			// Swap array[i] and array[minIndex]
			int temp = array[i];
			array[i] = array[minIndex];
			array[minIndex] = temp;
		}
	}
}
