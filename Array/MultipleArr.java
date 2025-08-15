package com.arr;

import java.util.Scanner;

public class MultipleArr {
	public static void main(String[] args) {
		System.out.println("Enter the Array Size: ");
		Scanner sc = new Scanner(System.in);
		int[] ar = new int[sc.nextInt()];
		
		for(int i=0;i<ar.length;i++) {
			ar[i] = sc.nextInt();
		}
		
		
		System.out.println("Enter Size: ");
		int size = sc.nextInt();
		ArrCombinations(ar,size);
	}
	
	static void ArrCombinations(int[] ar, int size) {

		for(int i=0;i<=ar.length-size;i++) {
			for(int j = i;j<i+size;j++) {
				
				System.out.print(ar[j]+" ");
				
				
			}
			System.out.println();
		}
	}
}
