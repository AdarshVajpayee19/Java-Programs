package com.multithread;

//Create a second Thread.
class NewThread implements Runnable
{
	Thread t;
	NewThread()
	{
		//create a new ,Second Thread.
		t=new Thread(this,"Demo Thread");
		System.out.println("Child thread: "+t);
		t.start();
	}
	//This is the Entry point for the Second Program.
	public void run()
	{
		try
		{
			for(int i=5;i>0;i--)
			{
				System.out.println("Child Thread: "+i);
				Thread.sleep(500);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("Child Interrupted.");
		}
	System.out.println("Exciting Child Thread.");
	}
}

public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new NewThread();//create a new thread.
		try
		{
			for(int i=5;i>0;i--)
			{
				System.out.println("Main Thread: "+i);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("Main Thread Interrupted.");
		}
		System.out.println("Main Thread Exiting.......");
	}

}

/*
OUTPUT:

Child thread: Thread[Demo Thread,5,main]
Main Thread: 5
Child Thread: 5
Child Thread: 4
Main Thread: 4
Child Thread: 3
Child Thread: 2
Main Thread: 3
Child Thread: 1
Exciting Child Thread.
Main Thread: 2
Main Thread: 1
Main Thread Exiting.......

*/