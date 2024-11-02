/**
 * 
 */
package com.linkedin.numbers;

import java.util.Scanner;

/**
 * 2.) Java program to find Prime number
 */
public class PrimeNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = scanner.nextInt();
		if (isPrime(number)) {
			System.out.println(number + " is a prime number.");
		} else {
			System.out.println(number + " is not a prime number.");
		}
	}

	public static boolean isPrime(int num) {
		for (int i = 2; i <= num / 2; i++) {
			// try each number by using %
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
}
