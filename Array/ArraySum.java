package com.ArraySum;

import java.util.Scanner;

public class ArraySum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int s = scan.nextInt();
		int[] arr = new int[s];
		for(int i=0;i<arr.length;i++) {
			arr[i] = scan.nextInt();
		}
		arrayPair(arr);
	}
	public static void arrayPair(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				System.out.println(arr[i] + " "+ arr[j]);
			}
		}
	}
}
