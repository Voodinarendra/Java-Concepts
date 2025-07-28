package com.phackage.Thread;


class Queue {
	
	private int data;
	boolean dataIsPresent = false;
	
	synchronized public void setData(int data) {
		if(dataIsPresent==false) {
			this.data = data;
			System.out.println("Producer produces the value : " +data);
			dataIsPresent = true;
			notify();
		}
		else {
			try {
				wait();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	synchronized public void getData() {
		if(dataIsPresent == true) {
			System.out.println("Consumer consumes the value: "+data);
			dataIsPresent=false;
			notify();
		}
		else {
			try {
				wait();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
class Producer extends Thread {
	Queue q;
	public Producer(Queue q) {
		this.q = q;
	}
	@Override
	public void run() {
		int i=1;
		for(; ; ) {
			q.setData(i++);
		}
	}
}
class Consumer extends Thread {
	Queue q;
	public Consumer(Queue q) {
		this.q = q;
	}
	@Override
	public void run() {
		for(; ; ) {
			q.getData();
		}
	}
}
public class ProducerProblem {
	public static void main(String[] args) {
		Queue q = new Queue();
		
		Producer p = new Producer(q);
		Consumer c = new Consumer(q);
		
		p.setName("Producer");
		c.setName("Consumer");
		
		p.start();
		c.start();
		
	}
}
