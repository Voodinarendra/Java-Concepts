package com.phackage.Thread;

class Warrior extends Thread {
	String res1 = "Bramhastra";
	String res2 = "Phasupatastra";
	String res3 = "Sarpharastra";
	@Override
	public void run() {
		if(Thread.currentThread().getName().equals("Arjuna")) {
			arjuna();
		}
		else {
			karna();
		}
	}
	public void arjuna() {
		try {
			Thread.sleep(3000);
			synchronized (res1) {
				System.out.println("Arjuna acquries: "+res1);
			Thread.sleep(3000);
			synchronized (res2) {
				System.out.println("Arjuna acquires: "+res2);
			Thread.sleep(3000);
			synchronized (res3) {
				System.out.println("Arjuna acquires: "+res3);
			}
			}
			}
		}
			catch(Exception e) {
				e.printStackTrace();
			}
		
	}
	
	public void karna() {
		try {
			Thread.sleep(3000);
			synchronized (res3) {
				System.out.println("Karna acquries: "+res3);
			
			Thread.sleep(3000);
			synchronized (res2) {
				System.out.println("Karna acquries: "+res2);
			
			Thread.sleep(3000);
			synchronized (res1) {
				System.out.println("Karna acquries: "+res1);
			}
			}
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}

public class WarriorsWar {
	public static void main(String[] args) {
		Warrior w1 = new Warrior();
		Warrior w2 = new Warrior();
		
		w1.setName("Arjuna");
		w2.setName("Karna");
		
		w1.start();
		w2.start();
		
	}
}
