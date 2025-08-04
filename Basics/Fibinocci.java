package com.basics;

import java.util.Scanner;

public class Fibinocci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();		
		series(n);
	}
	
	static void series(int n) {
		int n1 = 0, n2 = 1;
		
		System.out.print(n1 + " " + n2+" ");
		
		for(int i=2;i<=n;i++) {
			
		int n3 = n1+n2;
		System.out.print(n3 +" ");
		n1 = n2;
		n2 = n3;
	}
	}
}