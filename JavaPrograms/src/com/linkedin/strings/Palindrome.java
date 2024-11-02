/**
 * 
 */
package com.linkedin.strings;

/**
 * 7.) Java program to find if a string is Palindrome
 */
public class Palindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "madam";
		System.out.println(isPalindrome(str));
	}

	static boolean isPalindrome(String str) {
		int start = 0;
		int end = str.length() - 1;
		while (start < end) {
			if (str.charAt(start) != str.charAt(end)) {
				return false;
			}
			start++;
			end--;
		}
		return true;
	}
}
