package com.basics;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n = scan.nextInt();
		add(n);
	}
	static void add(int n) {
		int sum=0;
		while(n>0) {
			int r = n % 10;
			sum = sum + r;
			n = n/10;
		}
		System.out.println(sum);
	}
}
