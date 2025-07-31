package com.Threads;

class Warrior extends Thread{
	
	String res1 = "Bramhastra";
	String res2 = "Pashupatastra";
	String res3 = "Sarpastra";
	
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
			Thread.sleep(5000);
			synchronized (res1) {
				System.out.println("Arjuna aquries :" +res1);
				Thread.sleep(5000);
				synchronized (res2) {
					System.out.println("Arjuna aquires :" +res2);
					Thread.sleep(5000);
					synchronized (res3) {
						System.out.println("Arjuna aquires :" +res3);
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
			Thread.sleep(5000);
			synchronized (res3) {
				System.out.println("Karna aquries :" +res3);
				Thread.sleep(5000);
				synchronized (res2) {
					System.out.println("Karna aquires :" +res2);
					Thread.sleep(5000);
					synchronized (res1) {
						System.out.println("Karna aquires :" +res1);
					}
				}
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}

public class DeadLock {
	public static void main(String[] args) {
		Warrior w1 = new Warrior();
		Warrior w2 = new Warrior();
		
		w1.setName("Arjuna");
		w2.setName("Karna");
		
		w1.start();
		w2.start();
	}
}
