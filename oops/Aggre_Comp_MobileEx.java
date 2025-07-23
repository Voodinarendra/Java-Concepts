package com.oops;

class Charger {
	private String brand;
	private float voltage;
	
	public Charger(String brand,float voltage) {
		this.brand = brand;
		this.voltage = voltage;
	}
	public String getBrand() {
		return brand;
	}
	public float getVoltage(){
		return voltage;
	}
}

class OS {
	private String name;
	private int size;
	
	public OS(String name,int size) {
		this.name = name;
		this.size = size;
	}
	
	public String getName() {
		return name;
	}
	
	public int getSize() {
		return size;
	}
}

class Mobile {
	OS os = new OS("Samsung",4);
	public void hasA(Charger c) {
		System.out.println(c.getBrand());
		System.out.println(c.getVoltage());
	}
}
public class Aggre_Comp_MobileEx {
	public static void main(String[] args) {
		Charger c = new Charger("Android",2.14f);
		
		Mobile m = new Mobile();
		
		System.out.println(m.os.getName());
		System.out.println(m.os.getSize());
		m.hasA(c);
	}
	
	
	
}
