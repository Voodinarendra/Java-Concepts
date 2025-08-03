package com.basics;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n = sc.nextInt();
		
		num(n);
	}
	
	static void num(int n) {
		int factorial=1;
		for(int i=1;i<=n;i++) {
			factorial*=i;
		}
		System.out.println(factorial);
	}
}
