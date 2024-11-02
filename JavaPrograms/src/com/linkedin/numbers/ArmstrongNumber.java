/**
 * 
 */
package com.linkedin.numbers;

import java.util.Scanner;

/**
 * 7.) Java program to find Armstrong Number
 */
public class ArmstrongNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arm = 0, a, b, c, d, no;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any number : ");
		no = scanner.nextInt();
		d = no;
		while (no > 0) {
			a = no % 10;
			no = no / 10;
			arm = arm + a * a * a;
		}
		if (arm == d) {
			System.out.println("Armstrong number");
		} else {
			System.out.println("Not Armstrong number");
		}
	}

}
