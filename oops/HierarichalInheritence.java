package com.oops;

class Animal2 {
	void eat() {
		System.out.println("Animal are Eating......");
	}
}
class Dog1 extends Animal2 {
	void bark() {
		// TODO Auto-generated method stub
		System.out.println("Dog is Barking........");
	}
}
class Cat extends Animal2 {
	void swept() {
		// TODO Auto-generated method stub
		System.out.println("Cat says meow......");
	}
}
public class HierarichalInheritence {
	public static void main(String[] args) {
		Cat c = new Cat();
		c.eat();
		c.swept();
		System.out.println("--------------------");
		Dog1 d = new Dog1();
		d.eat();
		d.bark();
	}
}
