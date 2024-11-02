/**
 * 
 */
package com.linkedin.arrays;

/**
 * 9.) Array consists of integers and special characters,sum only integers
 */
public class SumIntegersArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] array = { "5", "2", "9", "a", "1", "6", "#", "3" };
		int sum = sumIntegers(array);
		System.out.println("Sum of integers in the array: " + sum);
	}

	public static int sumIntegers(String[] array) {
		int sum = 0;
		for (String element : array) {
			try {
				int num = Integer.parseInt(element);
				sum += num;
			} catch (NumberFormatException e) {
				// Ignore non-integer elements
			}
		}
		return sum;
	}
}
