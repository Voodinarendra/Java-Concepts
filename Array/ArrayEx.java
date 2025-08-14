package com.arr;

import java.util.Scanner;

public class ArrayEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Connection Established.........");
		try {
		System.out.println("Enter the Array Size: ");
		
		int size = sc.nextInt();
		int arr[] = new int[size];
		
		System.out.println("Enter an Element to Inserted: ");
		int data = sc.nextInt();

		System.out.println("Enter the index that the element is inserted: ");
		int index = sc.nextInt();
		
		arr[index] = data;
		System.out.println(arr[index]);

		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("Connection Terminated.........");
	}
}
