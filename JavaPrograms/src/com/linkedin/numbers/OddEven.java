/**
 * 
 */
package com.linkedin.numbers;

import java.util.Scanner;

/**
 * 1.) Java program to Find Odd or Even number
 */
public class OddEven {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter any number: ");
		int number = scanner.nextInt();
		if (number % 2 == 0) {
			System.out.println(number + " is even.");
		} else {
			System.out.println(number + " is odd.");
		}
	}

}
