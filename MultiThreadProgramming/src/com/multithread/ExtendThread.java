package com.multithread;

//Creating the second thread by extending Thread.
class NewThreads extends Thread
{
	NewThreads()
	{
		//create a new second thread.
		super("Demo ThreadClass");
		//super() this invokes the form of Thread Constructor.public Thread(String threadName)
		System.out.println("Child Thread: "+this);
		start();//start the thread.
	}
	//entry point for the second thread.
	public void run()
	{
		try {
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

public class ExtendThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new NewThreads();//create a new Thread.
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
		System.out.println("Main Thread Exiting.....");
	}

}

/*
 Output:
 
Child Thread: Thread[Demo ThreadClass,5,main]
Main Thread: 5
Child Thread: 5
Child Thread: 4
Child Thread: 3
Main Thread: 4
Child Thread: 2
Child Thread: 1
Main Thread: 3
Exciting Child Thread.
Main Thread: 2
Main Thread: 1
Main Thread Exiting.....

 */
