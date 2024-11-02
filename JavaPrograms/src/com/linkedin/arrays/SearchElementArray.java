/**
 * 
 */
package com.linkedin.arrays;

/**
 * 8.) Search element in an Array
 */
public class SearchElementArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 5, 2, 9, 1, 6, 3 };
		int target = 6;
		int index = linearSearch(array, target);
		if (index != -1) {
			System.out.println("Element " + target + " found at index: " + index);
		} else {
			System.out.println("Element " + target + " not found in thearray.");
		}
	}

	public static int linearSearch(int[] array, int target) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == target) {
				return i; // Element found, return index
			}
		}
		return -1; // Element not found
	}

}
