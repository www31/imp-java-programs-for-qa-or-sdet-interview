/**
 * 
 */
package com.linkedin.numbers;

import java.util.Scanner;

/**
 * 3.) Java program to find Fibonacci series upto a given number range
 */
public class Fibonacci {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number of terms");
		int number = 6;
		int first = 0, second = 1, next;
		System.out.println("Fibonacci series is ");
		for (int i = 0; i <= number; i++) {
			System.out.println(first + "");
			next = second + first;
			first = second;
			second = next;
		}
	}

}
