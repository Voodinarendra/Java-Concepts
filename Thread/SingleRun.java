package com.phackage.Thread;

import java.util.Scanner;

class Demo extends Thread {
	@Override
	public void run() {
		Thread t = Thread.currentThread();
		String name = t.getName();
		
		if(name.equals("ADD")) {
			adding();
		}
		else if(name.equals("CHAR")) {
			printChar();
		}
		else {
			printNum();
		}
	}
	
	void adding() {
		//System.out.println("Connection Established......");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number: ");
		int a = sc.nextInt();
		System.out.println("Enter Second Number: ");
		int b = sc.nextInt();
		
		System.out.println(a+b);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	void printChar() {
		for(int i =65;i<70;i++) {
			try {
			System.out.println((char)i+" ");
			Thread.sleep(3000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	void printNum() {
		for(int i=1;i<5;i++) {
			try {
			System.out.println( i+" ");
			Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class SingleRun {
	public static void main(String[] args) {
		Demo d1 = new Demo();
		Demo d2 = new Demo();
		Demo d3 = new Demo();
		
		d1.setName("ADD");
		d2.setName("CHAR");
		d3.setName("NUM");
		
		d1.start();
		d2.start();
		d3.start();
	}
}
