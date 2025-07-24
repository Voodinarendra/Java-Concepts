package com.Array;

import java.util.Scanner;

public class ArrayElementOccurs {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Array Size: ");

		int arr[] = new int[scan.nextInt()];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]= scan.nextInt();
		}
		int k = scan.nextInt();
		int res = occur(arr, k);
		System.out.println(res);
	}
	static int occur(int[] arr,int k) {
		int count = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==k) {
				count++;	
			}
		}
		return count;
	}
}
