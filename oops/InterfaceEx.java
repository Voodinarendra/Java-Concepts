package com.oops;

import java.util.Scanner;

interface Calculator {
	public abstract void sum();
	public abstract void sub();
}

class MyCalculator1 implements Calculator {
	
	@Override
	public void sum() {
		System.out.println(200+100);
	}
	
	@Override
	public void sub() {
		System.out.println(200-100);
	}
}

class MyCalculator2 implements Calculator {
	
	@Override
	public void sum() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the First Number: ");
		int a = scan.nextInt();
		System.out.println("Enter the Second Number: ");
		int b = scan.nextInt();
		System.out.println(a+b);
	}
	
	@Override
	public void sub() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the First Number: ");
		int a = scan.nextInt();
		System.out.println("Enter the Second Number: ");
		int b = scan.nextInt();
		System.out.println(a-b);
	}
}
class MyCalculator3 implements Calculator {
	
	@Override
	public void sum() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the First Number: ");
		int a = scan.nextInt();
		System.out.println("Enter the Second Number: ");
		int b = scan.nextInt();
		
		if(a>b) {
			System.out.println(a+b);
		}
		
		else {
			System.out.println("Invalid Input");
		}
	}
	
	@Override
	public void sub() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the First Number: ");
		int a = scan.nextInt();
		System.out.println("Enter the Second Number: ");
		int b = scan.nextInt();
		
		if(b>a) {
			System.out.println(a-b);
		}
		
		else {
			System.out.println("Invalid Input");
		}
	}
}

class Casio {
	void calc(Calculator ref) {
		ref.sum();
		ref.sub();
	}
}

public class InterfaceEx {
	public static void main(String[] args) {
		MyCalculator1 mc1 = new MyCalculator1();
		MyCalculator2 mc2 = new MyCalculator2();
		MyCalculator3 mc3 = new MyCalculator3();
		
		Casio c = new Casio();
		
		c.calc(mc1);
		c.calc(mc2);
		c.calc(mc3);
		
	}
}
