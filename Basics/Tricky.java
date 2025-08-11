package com.basics;

public class Tricky {
	public static void main(String[] args) {
		int x = 15;
		if(x++ > 15 && x++ == 17) {
			x++;
		}
		System.out.println(x);
	}
}
