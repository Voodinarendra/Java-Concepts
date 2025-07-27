package com.phackage.Thread;

class Dem extends Thread {
	public void run() {
		Thread t  = new Thread();
		t.setName("BABA");
		t.setPriority(7);
		System.out.println(t);
	}
}




public class ThreadCur {
	public static void main(String[] args) {
		Dem d = new Dem();
		d.start();
	}
}
