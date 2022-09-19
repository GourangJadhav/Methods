package com.prowings.util;

public class MyUtilClass {

	public static boolean isSorted(int[] arr) {

		for (int j = 0; j < arr.length; j++) {				
			for (int i = j + 1; i < arr.length; i++) {
				if (arr[j] > arr[i]) {
					return false;
				}
			}
		}
		return true;
	}
}
