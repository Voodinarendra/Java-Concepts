package com.phackage.Thread;

import java.util.Scanner;

public class Thread1 {

	public static void main(String[] args) {
			System.out.println("Connection Established......");
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter First Number: ");
			int a = sc.nextInt();
			System.out.println("Enter Second Number: ");
			int b = sc.nextInt();
			
			System.out.println(a/b);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			
			for(int i =65;i<70;i++) {
				try {
				System.out.print((char)i+" ");
				Thread.sleep(3000);
				}
				catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println();
			for(int i=1;i<5;i++) {
				try {
				System.out.print( i+" ");
				Thread.sleep(1000);
				}
				catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println();
		System.out.println("Connection Closed.........");
	}

}
