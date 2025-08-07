package com.basics;

import java.util.Scanner;

public class PalindromeWords {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Word: ");
		String s = sc.nextLine();
		String s1 = s;
		String r = " ";
		char ch = ' ';
		String rev = " ";
		palindrome(s1,s,r,ch,rev);
	}
	static void rev(String s,char ch,String r) {
		
		for(int i=0;i<s.length();i++) {
			ch = s.charAt(i);
			r = ch+r;
		}
		System.out.println("Reverse Word is: " +r);
	}
	static void palindrome(String s1,String s,String r,char ch,String rev) {
		rev(s,ch,r);
		if(s1.equals(rev)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Is not Palindrome");
		}
	}
}
