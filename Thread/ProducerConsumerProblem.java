package com.phackage.Thread;

class Queue1 {
	private int data;
	boolean isDataPresent = false;
	
	synchronized public void setData(int data) {
		if(isDataPresent==false) {
			this.data = data;
			System.out.println("Producer produces "+data);
			isDataPresent=true;
			notify();
		}
		else {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	synchronized public void getData() {
		if(isDataPresent==true) {
			System.out.println("Consumer consumes "+data);
			isDataPresent=false;
			notify();
		}
		else {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class Producer1 extends Thread {
	Queue1 q;
	public Producer1(Queue1 q) {
		this.q = q;
	}
	@Override
	public void run() {
		int i=1;
		for(; ;) {
			q.setData(i++);
		}
	}
}

class Consumer1 extends Thread {
	Queue1 q;
	public Consumer1(Queue1 q) {
		this.q = q;
	}
	@Override
	public void run() {
		for(; ;) {
			q.getData();
		}
	}
}
public class ProducerConsumerProblem {
	public static void main(String[] args) {
	Queue1 q = new Queue1();
	Producer1 p = new Producer1(q);
	Consumer1 c = new Consumer1(q);
	
	p.setName("Producer");
	c.setName("Consumer");
	
	p.start();
	c.start();
	}
}

