/**
 * 
 */
package com.linkedin.numbers;

import java.util.Scanner;

/**
 * 4.) Java program to swap two numbers without using third variable
 */
public class SwapNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		int a = 5;
		System.out.print("Enter the second number: ");
		int b = 10;
		System.out.println("Before swapping: a = " + a + ", b = " + b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After swapping: a = " + a + ", b = " + b);
	}

}
