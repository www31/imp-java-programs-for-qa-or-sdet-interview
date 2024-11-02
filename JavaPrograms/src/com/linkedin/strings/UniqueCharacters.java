/**
 * 
 */
package com.linkedin.strings;

import java.util.Scanner;

/**
 * 10.) Java program to print unqiue characters
 */
public class UniqueCharacters {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String input = scanner.nextLine();
		System.out.println("Unique characters in \"" + input + "\":");
		printUniqueCharacters(input);
	}

	public static void printUniqueCharacters(String str) {
		// Assume ASCII characters (0-127), use boolean array to track character
		// occurrences
		boolean[] unique = new boolean[128];
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (!unique[ch]) {
				unique[ch] = true;
				System.out.print(ch + " ");
			}
		}
	}
}
