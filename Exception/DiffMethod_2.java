package com.exceptions;

import java.util.Scanner;

class Demo {
	void alpha() {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Connection Established 3..........");
			System.out.println("Enter First Number: ");
			int a = sc.nextInt();
			System.out.println("Enter Second Number: ");
			int b = sc.nextInt();
			int c = a/b;
			System.out.println(c);
			
			
		}
		catch(Exception e) {
			System.out.println("Handled on alpha" +e);
		}
		System.out.println("Connection Terminated 3........");
		}
	
}

class Demo1 {
	void beta() {
		System.out.println("Connection Established 2..........");
		Demo a = new Demo();
		a.alpha();
		System.out.println("Connection Terminated 2........");
	}
}

public class DiffMethod_2 {
	public static void main(String[] args) {
		System.out.println("Connection Established 1..........");
		Demo1 d = new Demo1();
		d.beta();
		System.out.println("Connection Terminated 1........");
	}
}
