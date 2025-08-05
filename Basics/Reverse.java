package com.basics;

import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {
		Scanner c = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = c.nextInt();
		
		int rev=0;
		
		while(n!=0) {
		int m = n%10;
		rev = rev*10 + m;		
		n = n/10;	
}
	System.out.println(rev);
	}
}
