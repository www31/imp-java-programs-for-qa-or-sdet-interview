/**
 * 
 */
package com.linkedin.strings;

/**
 * 19.) Java program to gives Output:
 * 		“00003241212” for the Input
 * 		String Str = “32400121200”
 */
public class RearrangeDigitsString2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "32400121200";
		String formattedOutput = String.format("%011d",
		Long.parseLong(input));
		System.out.println("Formatted output: " + formattedOutput);
	}

}
