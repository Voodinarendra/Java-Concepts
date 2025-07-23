package com.oops;

abstract class Bird {
	abstract void fly();
	abstract void eat();
	
}
abstract class Eagle extends Bird {
	@Override
	void fly() {
		System.out.println("Eagles are flying.......");
		
	}
}
class SerpantEagle extends Eagle {
	@Override
	void eat() {
		System.out.println("SerpantEagle is Eating.....");
		
	}
}
class GoldenEagle extends Eagle {
	@Override
	void eat() {
		System.out.println("GoldenEagle is Eating......");
		
	}
}

// using Polymorphism for code flexibility
//Parent reference Child object
class BirdFamily {
	void family(Bird ref) {
		ref.fly();
		ref.eat();
		
	}
}
public class AbstractionEagleEx {
	public static void main(String[] args) {
		SerpantEagle se = new SerpantEagle();
		GoldenEagle ge = new GoldenEagle();
		
		BirdFamily b = new BirdFamily();
		b.family(se);
		System.out.println("-----------------");
		b.family(ge);
		
		
	}
	
}
