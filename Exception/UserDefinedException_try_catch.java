package com.exception;

import java.util.Scanner;

public class UserDefinedException_try_catch {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		try {
			System.out.println("Connection Established.......");
			System.out.println("Enter the Num1: ");
			int n = scan.nextInt();
			System.out.println("Enter the Num2: ");
			int m = scan.nextInt();
			int num = n/m;
			System.out.println(num);
			System.out.println("Connection Terminated.......");
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
}
