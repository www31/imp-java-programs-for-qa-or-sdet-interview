/**
 * 
 */
package com.linkedin.numbers;

import java.util.Scanner;

/**
 * 9.) Java program to find Palindrome number
 */
public class Palindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = scanner.nextInt();
		if (isPalindrome(number)) {
			System.out.println(number + " is a palindrome.");
		} else {
			System.out.println(number + " is not a palindrome.");
		}	
	}

	public static boolean isPalindrome(int num) {
		int originalNumber = num;
		int reversedNumber = 0;
		while (num != 0) {
			int digit = num % 10;
			reversedNumber = reversedNumber * 10 + digit;
			num = num / 10;
		}
		return originalNumber == reversedNumber;
	}
}
