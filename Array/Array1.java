package com.Array;

import java.util.Scanner;

public class Array1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Array Size: ");
		int[] arr = new int[scan.nextInt()];
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println("Original Array: ");
		for (int i = 0; i < arr.length; i++) {
			
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		System.out.println("---------------");
		
		System.out.println("Reversed Array: ");
		for(int i=arr.length-1;i>=0;i--) {
			
			System.out.print(arr[i]+" ");
		}
	}
}
