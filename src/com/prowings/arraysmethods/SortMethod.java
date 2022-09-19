package com.prowings.arraysmethods;

import java.util.Arrays;

public class SortMethod {
	
	public static void main(String[] args) {
			
		byte[] a = {20, 30, 10, 50};
		Arrays.sort(a);
		
		for(int i : a) {
			System.out.println(i);
		}
	}
}
