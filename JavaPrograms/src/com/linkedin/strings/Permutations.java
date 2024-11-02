/**
 * 
 */
package com.linkedin.strings;

/**
 * 6.) Java program to find all permutations of a given string
 */
public class Permutations {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abc";
		permute(str, "");
	}

	static void permute(String str, String prefix) {
		if (str.length() == 0) {
			System.out.println(prefix);
		} else {
			for (int i = 0; i < str.length(); i++) {
				String rem = str.substring(0, i) + str.substring(i + 1);
				permute(rem, prefix + str.charAt(i));
			}
		}
	}
}
