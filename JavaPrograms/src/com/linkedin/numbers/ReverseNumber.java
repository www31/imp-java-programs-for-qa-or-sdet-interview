/**
 * 
 */
package com.linkedin.numbers;

import java.util.Scanner;

/**
 * 6.) Java program to Reverse Number
 */
public class ReverseNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no, rev = 0, r, a;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any number : ");
		no = scanner.nextInt();
		a = no;
		while (no > 0) {
			r = no % 10;
			rev = rev * 10 + r;
			no = no / 10;
		}
		System.out.println("Reverse : " + rev);
	}

}
