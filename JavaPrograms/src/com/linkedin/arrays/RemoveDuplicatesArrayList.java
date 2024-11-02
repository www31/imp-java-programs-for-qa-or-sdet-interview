/**
 * 
 */
package com.linkedin.arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * 5.) Remove duplicates from an ArrayList
 */
public class RemoveDuplicatesArrayList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(5);
		arrayList.add(2);
		arrayList.add(9);
		arrayList.add(1);
		arrayList.add(6);
		arrayList.add(2);
		arrayList.add(5);
		ArrayList<Integer> uniqueList = removeDuplicates(arrayList);
		System.out.println("ArrayList with duplicates removed:");
		for (int num : uniqueList) {
			System.out.print(num + " ");
		}
	}

	public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> list) {
		Set<Integer> set = new HashSet<>(list);
		return new ArrayList<>(set);
	}
}
