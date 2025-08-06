package com.basics;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Number N value : ");
		int n = sc.nextInt();
		int m = n;
		
		palindrome(m,n);
	}
	static int reverse(int n) {
		int rev = 0;
		while(n!=0) {
			int rem = n%10;
			rev = rev*10+rem;
			n=n/10;
		}
		return rev;
	}
	static void palindrome(int m,int n) {
		System.out.println("Reverse Number is: "+reverse(n));
		System.out.print("Palindrome : ");
		if(m==(reverse(n))) {
			System.out.print("YES");
		}
		else {
			System.out.print("NO");
		}
	}
}
