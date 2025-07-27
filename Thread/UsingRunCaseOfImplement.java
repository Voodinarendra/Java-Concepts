package com.phackage.Thread;

import java.util.Scanner;

class Demo1 implements Runnable {
	
	public void run() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int a = sc.nextInt();
		System.out.println("Enter second number: ");
		int b = sc.nextInt();
		
		System.out.println(a/b);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			System.out.println(e);
		}
	}
}

class Demo2 implements Runnable{
	public void run() {
		for(int i=65;i<70;i++) {
			try {
			System.out.println((char)i);
			Thread.sleep(3000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Demo3 implements Runnable{
	public void run() {
		for(int i=1;i<11;i++) {
			System.out.println(i);
			try {
			Thread.sleep(3000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class UsingRunCaseOfImplement {
	public static void main(String[] args) {
		
		Demo1 d1 = new Demo1();
		Demo2 d2 = new Demo2();
		Demo3 d3 = new Demo3();
		
		
		Thread t1 = new Thread(d1);
		Thread t2 = new Thread(d2);
		Thread t3 = new Thread(d3);
		
		t1.start();
		t2.start();
		t3.start();
		
		
	}
}
