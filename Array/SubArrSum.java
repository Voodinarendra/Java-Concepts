package com.arr;

import java.util.Scanner;

public class SubArrSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] ar = new int[sc.nextInt()];
		
	for(int i =0;i<ar.length;i++) {
		ar[i] = sc.nextInt();
	}
	int size = sc.nextInt();
	
	SubArrSum1(ar,size);
	}
	static void SubArrSum1(int[] ar,int size) {
		for(int i=0;i<=ar.length-size;i++) {
			int sum = 0;
			for(int j=i;j<i+size;j++) {
				sum+=ar[j];
			}
			System.out.print(sum+" ");
		}
	}
}
