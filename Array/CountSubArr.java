package com.arr;

import java.util.Scanner;

public class CountSubArr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] ar = new int[sc.nextInt()];
		
		for(int i=0;i<ar.length;i++) {
			ar[i] = sc.nextInt();
		}
		int size = sc.nextInt();
		int k = sc.nextInt();
		
		countSubArr(ar,size,k);
		sumSubArrElements(ar,size,k);
	}
	
	static void countSubArr(int[] ar,int size,int k) {
		int count=0;
		for(int i=0;i<=ar.length-size;i++) {		
			int sum=0;
			for(int j=i;j<i+size;j++) {
				
				//System.out.print(ar[j]+" ");
				sum+=ar[j];
			}
				if(sum == k) {
					count++;	
				}
			
		}
		System.out.println("Count is:"+count);
		}
	
	
	static void sumSubArrElements(int[] ar,int size,int k) {
		int count=0;
		for(int i=0;i<=ar.length-size;i++) {		
			int sum=0;
			for(int j=i;j<i+size;j++) {
				
				//System.out.print(ar[j]+" ");
				sum+=ar[j];
			}
				if(sum == k) {
					for(int j=i;j<i+size;j++) {
						
						System.out.print(ar[j]+" ");
						
				}
			System.out.println();
		}
		
		}
	}
}
