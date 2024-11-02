/**
 * 
 */
package com.linkedin.strings;

import java.util.Scanner;

/**
 * 11.) Java program to print even indexed characters
 */
public class EvenIndexedCharacters {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String input = scanner.nextLine();
		System.out.println("Even indexed characters in \"" + input + "\":");
		printEvenIndexedCharacters(input);
	}

	public static void printEvenIndexedCharacters(String str) {
		for (int i = 0; i < str.length(); i++) {
			if (i % 2 == 0) {
				System.out.print(str.charAt(i));
			}
		}
	}
}
