//package com.prowings.arraysmethods;
//
//import java.util.*;
//import com.prowings.util.*;
//
//public class ArrayMethods {
//	public final static int findIndexofValueInArray(int[] arr, int a) {
//		int indexOfValue = 0;
//		if (arr.length < 2)
//			System.out.println("array is length is less than 2");
//
//		if (MyUtilClass.isSorted(arr)) {
//
//			indexOfValue = Arrays.binarySearch(arr, a);
//		}
//		return indexOfValue;
//	}
//
////	Compares two arrays passed as parameters lexicographically.
////	public static boolean compareTwoArray(char[] arr1, char[] arr2) {
//		
////		boolean b = Arrays.compare(arr1, arr2);
//		
//	}
//
//	public static void main(String[] args) {
//
////		int[] arr1 = { 10, 20, 30, 40 };
////		int value = 10;
////		int result = findIndexofValueInArray(arr1, value);
//		char[] grab = { 'g', 'r', 'a', 'b' };
//		char[] brag = { 'b', 'r', 'a', 'g' };
//
//		System.out.println("value find in array index : " + result);
//	}
//}
