package com.exception;

import java.util.Scanner;

class Demoo {
	void alpha() throws Exception{
		Scanner scan = new Scanner(System.in);
		System.out.println("Connection Establishe2");
		System.out.println("Enter the Num1: ");
		int a = scan.nextInt();
		System.out.println("Enter the Num2: ");
		int b = scan.nextInt();
		int c = a/b;
		System.out.println(c);
		System.out.println("Connection Terminated2");
	}
}
public class DuckingException {
	public static void main(String[] args) {
		System.out.println("Connection Established1");
		Demoo d = new Demoo();
		try {
			d.alpha();
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("Caught");
		}
		System.out.println("COnnection Terminated1");
	}
}