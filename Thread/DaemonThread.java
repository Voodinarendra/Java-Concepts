package com.phackage.Thread;

class Captain extends Thread {
	@Override
	public void run() {
		try {
			BattingCoach abhishek = new BattingCoach();
			BowlingCoach morne = new BowlingCoach();
			abhishek.setDaemon(true);
			morne.setDaemon(true);
			abhishek.start();
			morne.start();
			System.out.println("Captain is Arrived on Playground......");
			Thread.sleep(3000);
			System.out.println("Captain Observes the pitch....");
			Thread.sleep(3000);
			System.out.println("Captain Padup to practice....");
			Thread.sleep(3000);
			System.out.println("Captain Done his Practice........");
			Thread.sleep(3000);
			System.out.println("Captain will go to the Hotel....");
			
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}

class BattingCoach extends Thread {
	@Override
	public void run() {
		for(; ; ) {
			System.out.println("Batting Coaching is with the Captain to Practice him well....");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class BowlingCoach extends Thread {
	@Override
	public void run() {
		for(; ; ) {
			System.out.println("Bowling Coaching is with the Captain to Practice him well....");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class DaemonThread {
	public static void main(String[] args) {
		
		Captain rohit = new Captain();
		
		rohit.start();
		
	}
}
