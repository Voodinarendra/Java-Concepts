package com.phackage.Thread;

class BathRoom {
	
	synchronized void bathRoom() {
		try {
		System.out.println(Thread.currentThread().getName() + " is entered inside the BathRoom.");
		Thread.sleep(3000);
		System.out.println(Thread.currentThread().getName() + " is uses the BathRoom.");
		Thread.sleep(3000);
		System.out.println(Thread.currentThread().getName() + " is exits from the BathRoom.");
		Thread.sleep(3000);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}

class Boy extends Thread {
	BathRoom bathRoom;
	@Override
	public void run() {
		bathRoom.bathRoom();
	}
	public Boy(BathRoom bathRoom) {
		this.bathRoom = bathRoom;
	}
}

class Girl extends Thread {
	BathRoom bathRoom;
	@Override
	public void run() {
		bathRoom.bathRoom();
	}
	Girl(BathRoom bathRoom) {
		this.bathRoom = bathRoom;
	}
}

class Others extends Thread {
	BathRoom bathRoom;
	@Override
	public void run() {
		bathRoom.bathRoom();
	}
	Others(BathRoom bathRoom) {
		this.bathRoom = bathRoom;
	}
}
public class Sync {
	public static void main(String[] args) {
		
		BathRoom bathRoom = new BathRoom();
		Boy boy = new Boy(bathRoom);
		Girl girl = new Girl(bathRoom);
		Others others = new Others(bathRoom);
		
		boy.setName("Boy");
		girl.setName("Girl");
		others.setName("Others");
		
		boy.start();
		girl.start();
		others.start();
		
		
	}
}
