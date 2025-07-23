package com.oops;

interface Calculator1 {
	void add();
	void sub();
}

interface Calculator2 {
	void mul();
	void div();
}

class MyCalculator implements Calculator1,Calculator2 {
	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("Adding");
	}
	@Override
	public void sub() {
		// TODO Auto-generated method stub
		System.out.println("Subtracting");
	}
	@Override
	public void mul() {
		// TODO Auto-generated method stub
		System.out.println("Multiplication");
	}
	@Override
	public void div() {
		// TODO Auto-generated method stub
		System.out.println("Division");
	}
}
public class MultipleInheritence {
	public static void main(String[] args) {
		MyCalculator mc = new MyCalculator();
		mc.add();
		mc.sub();
		mc.mul();
		mc.div();
	}
}
