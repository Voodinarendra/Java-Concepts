package com.oops;

class Human {
	void changing() {
		System.out.println("Firstly Innocent");
	}
}
class Stage1 extends Human {
	@Override
	void changing() {
		System.out.println("Secondly became cold_hearted");
	}
}
class Stage2 extends Human {
	@Override
	void changing() {
		System.out.println("Thirdly became Emotion_less");
	}
}
class Stage3 extends Human {
	@Override
	void changing() {
		System.out.println("Finally became Dangerous");
	}
}
public class MethodOverriding {
	public static void main(String[] args) {
		Human h;
		
		h = new Human();
		h.changing();
		
		h = new Stage1();
		h.changing();
		
		h = new Stage2();
		h.changing();
		
		h = new Stage3();
		h.changing();
		
	}
}
