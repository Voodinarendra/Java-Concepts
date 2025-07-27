package com.phackage.Thread;

import java.util.Scanner;

class Demo11 extends Thread {
	public void run() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Number: ");
		int a  = sc.nextInt();
		System.out.println("Enter the Second Number: ");
		int b  = sc.nextInt();
		
		System.out.println(a/b);
		try {
		Thread.sleep(3000);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		}
}

class Demo12 extends Thread {
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


public class UsingRunCaseOfExtends {
	public static void main(String[] args) {
		Demo11 d1 = new Demo11();
		Demo12 d2 = new Demo12();
		
		d1.run();
		d2.run();
	}
}
