package com.oops;

class Overloading {
	void operator(String str1 , String str2) {
		
		System.out.println(str1 +" " +str2);
		
	}
	void operator(int a,int b) {
		
		System.out.println(a+b);
		
	}
}
public class MethodOverloading {
	public static void main(String[] args) {
		Overloading o = new Overloading();
		o.operator("Narendra","Voodi");
		o.operator(10,20);
	}
}
