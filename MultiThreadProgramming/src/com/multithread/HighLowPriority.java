package com.multithread;

//1.Thread priorities are used by the thread scheduler to decide when 
//each thread should be allowed to run.

//(MIN_PRIORITY , MAX_PRIORITY, NORM_PRIORITY)(1, 10, 5)​

class Clicker implements Runnable
{
	long click=0;
	Thread t;
	private volatile boolean running = true;
	
	public Clicker(int p)
	{
		t=new Thread(this);
		t.setPriority(p);
	}
	
	public void run()
	{
		while(running)
		{
			click++;
		}
	}
	
	public void stop()
	{
		running =false;
	}
	public void start()
	{
		t.start();
	}
}

public class HighLowPriority {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
		Clicker hi=new Clicker(Thread.NORM_PRIORITY+2);
		Clicker lo=new Clicker(Thread.NORM_PRIORITY-2);
		
		lo.start();
		hi.start();
		try {
			Thread.sleep(10000);
		}
		catch(InterruptedException e)
		{
			System.out.println("Main Thread Interrupted");
		}
		lo.stop();
		hi.stop();
		
		try
		{
			hi.t.join();
			lo.t.join();
		}
		catch(InterruptedException e)
		{
			System.out.println("InterruptedException Caught");
		}
		System.out.println("Low-priority Thread: "+lo.click);
		System.out.println("High-priority Thread: "+hi.click);
	}

}
/*
 OUTPUT:
 
Low-priority Thread: 6959163
High-priority Thread: 2377569602
 
 */
