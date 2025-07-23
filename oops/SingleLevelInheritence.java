package com.oops;

class Animal {
	void eat() {
		System.out.println("Animal is Eating........");
	}
}
public class SingleLevelInheritence {
	public static void main(String[] args) {
		Animal a = new Animal();
		a.eat();
	}
}
