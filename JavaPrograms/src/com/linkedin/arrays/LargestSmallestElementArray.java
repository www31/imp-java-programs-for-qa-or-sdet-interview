/**
 * 
 */
package com.linkedin.arrays;

/**
 * 7.) Find the largest and smallest element in an Array
 */
public class LargestSmallestElementArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 5, 2, 9, 1, 6, 3 };
		int[] result = findLargestAndSmallest(array);
		System.out.println("Smallest element: " + result[0]);
		System.out.println("Largest element: " + result[1]);
	}

	public static int[] findLargestAndSmallest(int[] array) {
		if (array == null || array.length == 0) {
			throw new IllegalArgumentException("Array must not be null orempty");
		}
		int smallest = array[0];
		int largest = array[0];
		for (int num : array) {
			if (num < smallest) {
				smallest = num;
			}
			if (num > largest) {
				largest = num;
			}
		}
		return new int[] { smallest, largest };
	}
}
