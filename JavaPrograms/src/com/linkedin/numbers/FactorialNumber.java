/**
 * 
 */
package com.linkedin.numbers;

import java.util.Scanner;

/**
 * 5.) Java program to Find Factorial on given Number
 */
public class FactorialNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int factorial = 1;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter any number ");
		int number = 5;
		for (int i = 1; i <= number; i++) {
			factorial = factorial * i;
		}
		System.out.println("Factorial number is :" + factorial);
	}

}
