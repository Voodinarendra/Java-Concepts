package com.exceptions;

import java.util.Scanner;

class Ex1 {
	void alpha() throws Exception {
		try {
			System.out.println("Connection Established 2...........");
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter First Number: ");
			int a = sc.nextInt();
			System.out.println("Enter Second Number: ");
			int b = sc.nextInt();
			int c = a/b;
			System.out.println(c);
			
		}
		catch(Exception e) {
			System.out.println("Invalid Input " + e);
			throw e;
		}
		
		finally {
			System.out.println("Connection Terminated 2........");
		}
	}
}

public class DiffMethod_3 {
	public static void main(String[] args) {
		System.out.println("Connection Established 1.........");
		Ex1 d = new Ex1();
		try {
		d.alpha();
		}
		catch(Exception e) {
			System.out.println("Main Exception " + e);
		}
		System.out.println("Connection Terminated 1...........");
	}
}
