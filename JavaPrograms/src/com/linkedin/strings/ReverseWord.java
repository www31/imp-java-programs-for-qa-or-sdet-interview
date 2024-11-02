/**
 * 
 */
package com.linkedin.strings;

/**
 * 2.) Java program to reverse each word of a given string
 */
public class ReverseWord {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverseEachWordOfString("Java is good programming langauges");
	}

	static void reverseEachWordOfString(String inputString) {
		String[] words = inputString.split(" ");
		String reverseString = "";
		for (int i = 0; i < words.length; i++) {
			String word = words[i];
			String nstr = "";
			char ch;
			for (int j = 0; j < word.length(); j++) {
				ch = word.charAt(j);
				nstr = ch + nstr;
			}
			reverseString = reverseString + nstr + " ";
		}
		System.out.println(inputString);
		System.out.println(reverseString);
	}
}
