package com.basics;

import java.util.Scanner;

public class ArmStrongNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n = sc.nextInt();
		
		num(n);
	}
	
	static void num(int n) {
		int sum = 0;
		int m = n;
		while(n!=0) {
			int r = n%10;
			sum+=Math.pow(r,3);
			n=n/10;
		}
		System.out.println(m==sum);
	}
}
