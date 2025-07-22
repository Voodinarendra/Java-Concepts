package com.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UDE_Multiple_try_catch {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	try {
		System.out.println("Enter Array Size: ");
		int arr[] = new int[scan.nextInt()];
		
		System.out.println("Enter the data to Inserted: ");
		int data = scan.nextInt();
		
		System.out.println("Enter the index for data: ");
		int index = scan.nextInt();
		
		
		arr[index]=data;
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	catch(ArithmeticException d) {
		System.out.println(d);
	}
	catch(InputMismatchException j) {
		System.out.println(j);
	}
	catch(ArrayIndexOutOfBoundsException k) {
		System.out.println(k);
	}
	catch(Exception e) {
		System.out.println(e);
	}
	}
}
