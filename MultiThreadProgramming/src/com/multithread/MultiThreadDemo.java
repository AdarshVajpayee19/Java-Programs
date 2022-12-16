package com.multithread;

class NewThread3 implements Runnable
{
	String name;
	Thread t;
	NewThread3(String threadname)
	{
		name=threadname;
		t=new Thread(this,name);
		System.out.println("New Thread: "+t);
		t.start();
	}
	public void run()
	{
		try {
			for(int i=5;i>0;i--)
			{
				System.out.println(name+":"+i);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println(name+ " Interrupted");
		}
		System.out.println(name+" exiting....");
	}
}
public class MultiThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new NewThread3("One");//start threads.
		new NewThread3("Two");
		new NewThread3("Three");
		try
		{
			//wait for other threads to end.
			Thread.sleep(10000);
		}
		catch(InterruptedException e)
		{
			System.out.println("Main Thread Interrupted.");
		}
	System.out.println("Main Thread Exiting....");
	}

}

/*
OUTPUT: Random Aa raha hai,every time i run i got different answers.

New Thread: Thread[One,5,main]
New Thread: Thread[Two,5,main]
New Thread: Thread[Three,5,main]
One:5
Two:5
Three:5
Three:4
One:4
Two:4
Three:3
One:3
Two:3
Three:2
One:2
Two:2
One:1
Three:1
Two:1
One exiting....
Three exiting....
Two exiting....
Main Thread Exiting....

 */
