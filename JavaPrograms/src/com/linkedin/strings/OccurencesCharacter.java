/**
 * 
 */
package com.linkedin.strings;

import java.util.HashMap;

/**
 * 4.) Java program to count Occurrences of Each Character in String
 */
public class OccurencesCharacter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CharacterCount("Test Automation Java Automation");
	}

	static void CharacterCount(String inputString) {
		HashMap<String, Integer> charCountMap = new HashMap<>();
		for (String s : inputString.split(" ")) {
			if (charCountMap.containsKey(s)) {
				charCountMap.put(s, charCountMap.get(s) + 1);
			} else {
				charCountMap.put(s, 1);
			}
		}
		System.out.println("Count of Characters in a given string : " + charCountMap);
	}
}
