package com.exception;
//Anywhere in the program(method),we give try_catch block for our under standing purpose. 
//But its good to mention the blocks on the top of the method or where the main program exists.
import java.util.Scanner;

class Dollar1 {
	void alpha() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Connection Established4");
		System.out.println("Enter the Number1: ");
		int a = scan.nextInt();
		System.out.println("Enter the Number2: ");
		int b = scan.nextInt();
		int c = a/b;
		System.out.println("Connection Terminated4");
	}
}

class Dollar2 {
	void beta() {
		System.out.println("Connection Established3");
		Dollar1 d1 = new Dollar1();
		d1.alpha();
		System.out.println("Connection Terminated3");
	}
}

class Dollar3 {
	void gamma() {
		System.out.println("Connection Established2");
		try {
			Dollar2 d2 = new Dollar2();
			d2.beta();
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("Handled in gamma");
		}
		System.out.println("Connection Terminated2");
	}
}
public class ExceptionPropagation {
	public static void main(String[] args) {
		System.out.println("Connection Established1");
	Dollar3 d3= new Dollar3();
	d3.gamma();
	System.out.println("Connection Terminated1");
	}
}
