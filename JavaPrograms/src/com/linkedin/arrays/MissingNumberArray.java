/**
 * 
 */
package com.linkedin.arrays;

/**
 * 6.) Find the missing number in an Array
 */
public class MissingNumberArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 1, 2, 4, 5, 6 }; // Missing number is 3
		int missingNumber = findMissingNumber(array);
		System.out.println("The missing number is: " + missingNumber);
	}

	public static int findMissingNumber(int[] array) {
		int n = array.length + 1; // Since one number is missing, the length should be n+1
		int totalSum = n * (n + 1) / 2; // Sum of first n natural numbers
		int arraySum = 0;
		for (int num : array) {
			arraySum += num;
		}
		return totalSum - arraySum;
	}
}
