package com.multithread;

//isAlive() Method returns True if the Thread up on which it is called is still running.Otherwise retirns False.
//join() Method waits until Thread on which it is called terminates.
class NewThread4 implements Runnable
{
	String name;
	Thread t;
	NewThread4(String threadname)
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

public class JoinDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NewThread4 obj1=new NewThread4("One");//start threads.
		NewThread4 obj2=new NewThread4("Two");
		NewThread4 obj3=new NewThread4("Three");
		try
		{
			System.out.println("wait for other threads to end.");
			obj1.t.join();
			obj2.t.join();
			obj3.t.join();
		}
		catch(InterruptedException e)
		{
			System.out.println("Main Thread Interrupted.");
		}
		System.out.println("Thread One is Alive : "+obj1.t.isAlive());
		System.out.println("Thread Two is Alive : "+obj2.t.isAlive());
		System.out.println("Thread Three is Alive : "+obj3.t.isAlive());
	System.out.println("Main Thread Exiting....");
	}

}
