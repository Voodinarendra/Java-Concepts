package com;

import java.util.Random;
import java.util.Scanner;

public class Operations {
public static void main(String[] args) {
	random();
	alphaNumeric();
	stringOperation();
}
static void random() {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter First Number: ");
	int a = sc.nextInt();
	System.out.println("Enter Second Number: ");
	int b = sc.nextInt();
	
	Random rand = new Random();
	int c = rand.nextInt(a,b);
	System.out.println(c);
	
}
static void alphaNumeric() {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the AlphaNumeric : ");
	String input = sc.nextLine();
	boolean isAlphaNumeric = input.matches("[a-zA-Z0-9]+");
	System.out.println(isAlphaNumeric);
	
}
static void stringOperation() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Word you Want: ");
	String in = sc.nextLine();
	
	System.out.println(in.length());
	
	String s = in.substring(0,6);
	System.out.println(s);
	
	Random ran = new Random();
	String s1 = ran.toString();
	System.out.println(s1);
			
}
}
