package com.basics;

public class TrikyPattern {
	public static void main(String[] args) {
		int n =4;
		int a;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n ;j++) {
				a = ((i+j-1)*(i+j-2))/2;
				if((i+j)% 2 == 0) {
					a += j;
				}
				else {
					a += i;
				}
				System.out.print(a +" ");
			}
			System.out.println();
		}
	}
}
