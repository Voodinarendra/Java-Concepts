package com.exception;

import java.util.Scanner;
class InvalidException extends Exception {
	
}
class Atm {
	int pin = 123456;
	int p;
	
	void acceptInput() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Pin: ");
		p = scan.nextInt();
	}
	void verify() throws Exception{
		if(pin==p) {
			System.out.println("Collect Money");
		}
		else {
			System.out.println("Invalid");
			 InvalidException ipe  = new InvalidException();
			 throw ipe;
		}
		
	}
}
class Bank {
	void init() {
		Atm a = new Atm();
		try {
			a.acceptInput();
			a.verify();
		}
		catch(Exception e) {
			try {
				a.acceptInput();
				a.verify();
			}
			catch(Exception f) {
				try {
					a.acceptInput();
					a.verify();
				}
				catch(Exception g) {
					System.out.println("Block the Card");
				}
			}
		}
	}
}
public class Rbi {
	public static void main(String[] args) {
		Bank b = new Bank();
		b.init();
	}
}
