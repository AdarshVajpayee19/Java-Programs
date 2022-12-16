package com.multithread;

public class RunnableExample implements Runnable {
	
	public void run()
	{
		System.out.println("Thread is Running for Runnable Implementation.");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RunnableExample runnable=new RunnableExample();
		Thread t1=new Thread(runnable);
		t1.start();
	}

}
