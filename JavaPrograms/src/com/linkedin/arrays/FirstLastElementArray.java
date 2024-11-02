/**
 * 
 */
package com.linkedin.arrays;

import java.util.ArrayList;

/**
 * 2.) Find first and last element of Arraylist
 */
public class FirstLastElementArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("Apple");
		arrayList.add("Banana");
		arrayList.add("Cherry");
		arrayList.add("Date");
		arrayList.add("Elderberry");
		if (!arrayList.isEmpty()) {
			String firstElement = arrayList.get(0);
			String lastElement = arrayList.get(arrayList.size() - 1);
			System.out.println("First element: " + firstElement);
			System.out.println("Last element: " + lastElement);
		} else {
			System.out.println("The ArrayList is empty.");
		}
	}

}
