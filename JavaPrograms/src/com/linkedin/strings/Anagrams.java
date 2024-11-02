/**
 * 
 */
package com.linkedin.strings;

/**
 * 8.) Java program to determine if Two Strings are Anagrams
 */
public class Anagrams {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "listen";
		String str2 = "silent";
		System.out.println(areAnagrams(str1, str2));
	}

	static boolean areAnagrams(String str1, String str2) {
		if (str1.length() != str2.length()) {
			return false;
		}
		int[] charCount = new int[256];
		for (int i = 0; i < str1.length(); i++) {
			charCount[str1.charAt(i)]++;
			charCount[str2.charAt(i)]--;
		}
		for (int count : charCount) {
			if (count != 0) {
				return false;
			}
		}
		return true;
	}
}
