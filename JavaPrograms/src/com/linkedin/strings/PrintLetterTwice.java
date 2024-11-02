/**
 * 
 */
package com.linkedin.strings;

import java.util.Scanner;

/**
 * 13.) Java program to print each letter twice from a given string
 */
public class PrintLetterTwice {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String input = scanner.nextLine();
		String doubledString = doubleCharacters(input);
		System.out.println("Doubled characters: " + doubledString);
	}

	public static String doubleCharacters(String str) {
		StringBuilder doubled = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			doubled.append(ch).append(ch); // Append each character twice
		}
		return doubled.toString();
	}

}
