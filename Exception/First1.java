package com.exceptions;

import java.util.Scanner;
class gamma{
	void alpha() throws Exception{
		System.out.println("Connection Established 2.......");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num1 : ");
		int n = sc.nextInt();
		System.out.println("Enter the num2 : ");
		int m = sc.nextInt();
		int c = n/m;
		System.out.println(c);
		
		System.out.println("Connection Terminated 2.........");
	}
}
public class First1 {
	public static void main(String[] args) {
			System.out.println("Connection Established 1.......");
			gamma g = new gamma();
			try {
				g.alpha();
			} catch (Exception e) {
				System.out.println("Caught");
			}
			System.out.println("Connection Terminated 1.......");
	}
}
