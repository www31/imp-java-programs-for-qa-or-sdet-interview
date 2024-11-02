/**
 * 
 */
package com.linkedin.numbers;

/**
 * 10.) Java program to calculate the sum of digits of a number
 */
public class SumOfDigits {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 12345;
		int sumOfDigits = calculateSumOfDigits(number);
		System.out.println("Sum of digits of " + number + " is: " + sumOfDigits);
	}

	public static int calculateSumOfDigits(int number) {
		int sum = 0;
		while (number > 0) {
			int digit = number % 10; // Extract the last digit
			sum = sum + digit; // Add the digit to sum
			number = number / 10; // Remove the last digit from number
		}
		return sum;
	}
}
