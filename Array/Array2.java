package com.Array;

import java.util.Scanner;

public class Array2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Array Size: ");
		int[] arr = new int[scan.nextInt()];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		//evenIndex(arr);
		//oddIndex(arr);
		//evenElements(arr);
		//oddElements(arr);
		//maxElement(arr);
		//minElement(arr);
		//arrSum(arr);
		arrMul(arr);
	}
	
	static void evenIndex(int[] arr) {
		System.out.println("Elements presents in even index: ");
		for(int i=0;i<arr.length;i++) {
			if(i%2==0) {
				System.out.println(arr[i]);
			}
		}
	}
	static void oddIndex(int[] arr) {
		System.out.println("Elements presents in odd index: ");
		for(int i=0;i<arr.length;i++) {
			if(i%2!=0) {
				System.out.println(arr[i]);
			}
		}
	}
	static void evenElements(int[] arr) {
		System.out.println("Even elements in the array: ");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]%2==0) {
				System.out.println(arr[i]);
			}
		}
	}
	static void oddElements(int[] arr) {
		System.out.println("Odd elements in the array: ");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]%2!=0) {
				System.out.println(arr[i]);
			}
		}
	}
	static void maxElement(int[] arr) {
		System.out.println("Maximum number in the Array: ");
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		System.out.println(max);
	}
	static void minElement(int[] arr) {
		System.out.println("Minimum number in the Array: ");
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		System.out.println(min);
	}
	static void arrSum(int[] arr) {
		int sum =0;
		System.out.println("Array Sum: ");
		for(int i=0;i<arr.length;i++) {
			sum +=arr[i];
		}
		System.out.println(sum);
	}
	static void arrMul(int[] arr) {
		int prod =1;
		System.out.println("Array Mul: ");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				prod *=arr[i];
			}
		}
		System.out.println(prod);
	}
}