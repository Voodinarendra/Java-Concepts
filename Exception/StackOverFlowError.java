package com.exception;

public class StackOverFlowError {
	public static void main(String[] args) {
		disp();
	}
	static void disp() {
		try {
			disp();
		}
		catch(Throwable e) {
			System.out.println("Runtime Error Handled");
		}
	}
}
