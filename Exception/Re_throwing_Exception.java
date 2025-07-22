package com.exception;

import java.util.Scanner;

class Demo {
	void alpha() throws Exception {
	Scanner scan = new Scanner(System.in);
	try {
		System.out.println("Connection Established2");
		System.out.println("Enter the Number 1: ");
		int a = scan.nextInt();
		System.out.println("Enter the Number 2: ");
		int b = scan.nextInt();
		int c = a/b;
		System.out.println(c);
		
	}
	catch (Exception e) {
		// TODO: handle exception
		System.out.println("Handled in alpha");
		throw e;
	}
	finally {
		System.out.println("Connection Terminated2");
	}
	}
}
public class Re_throwing_Exception {
	public static void main(String[] args) {
		System.out.println("Connection Established1");
		Demo d = new Demo();
		try {
			d.alpha();
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("Handleld in Main");
		}
		System.out.println("Connection Terminated1");
	}
}
