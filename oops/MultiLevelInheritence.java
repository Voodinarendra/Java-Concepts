package com.oops;

class Animal1 {
	void eat() {
		System.out.println("Animals are Eating......");
	}
}
class Dog extends Animal1 {
	void bark() {
		System.out.println("Dog is Barking.......");
	}
}
class BabyDog extends Dog {
	void swept() {
		System.out.println("BabyDog is Sleeping......");
	}
}
public class MultiLevelInheritence {
	public static void main(String[] args) {
		BabyDog b = new  BabyDog();
		b.eat();
		b.bark();
		b.swept();
	}
}
