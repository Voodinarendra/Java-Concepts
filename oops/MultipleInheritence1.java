package com.oops;

interface Dog2 {
	void bark();
}
interface Cat2 {
	void meow();
}
class Animals implements Dog2,Cat2{
	public void bark() {
		System.out.println("Make Sound......");
	}
	public void meow() {
		System.out.println("Make Sounds ");
	}
}
public class MultipleInheritence1{
	public static void main(String[] args) {
		Animals a = new Animals();
		a.bark();
		a.meow();
	}
}
