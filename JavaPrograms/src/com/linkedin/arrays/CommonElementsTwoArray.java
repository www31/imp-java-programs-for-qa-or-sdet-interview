/**
 * 
 */
package com.linkedin.arrays;

import java.util.HashSet;
import java.util.Set;

/**
 * 1.) Find common elements between two arrays
 */
public class CommonElementsTwoArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1 = { 1, 2, 3, 4, 5 };
		int[] array2 = { 4, 5, 6, 7, 8 };
		Set<Integer> commonElements = findCommonElements(array1, array2);
		System.out.println("Common elements: " + commonElements);
	}

	public static Set<Integer> findCommonElements(int[] array1, int[] array2) {
		Set<Integer> set1 = new HashSet<>();
		Set<Integer> commonSet = new HashSet<>();
		// Add elements of the first array to the set
		for (int num : array1) {
			set1.add(num);
		}
		// Check for common elements in the second array
		for (int num : array2) {
			if (set1.contains(num)) {
				commonSet.add(num);
			}
		}
		return commonSet;
	}
}
