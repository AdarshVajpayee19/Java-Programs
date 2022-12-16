package com.multithread;


class CallMee
{
	synchronized void call(String msg)
	{
		System.out.print("["+msg);
	    try
	    {
	    	Thread.sleep(1000);
	    }
	    catch(InterruptedException e)
	    {
	    	System.out.println("Interrupted.");
	    }
	    System.out.print("]");
	}
}

class Callers implements Runnable
{
	String msg;
	CallMee target;
	Thread t;
	public Callers(CallMee targ,String s)
	{
		target=targ;
		msg=s;
		t=new Thread(this);
		t.start();
	}
	public void run()
	{
		target.call(msg);
	}
}

public class Synchronized {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CallMee target=new CallMee();
		Callers ob1=new Callers(target,"Hello");
		Callers ob2=new Callers(target,"Synchronized");
		Callers  ob3=new Callers(target,"World");
		
		//wait for threads to ends.
		try {
			ob1.t.join();
			ob2.t.join();
			ob3.t.join();
		}
		catch(InterruptedException e)
		{
			System.out.println("Interrupted.");
		}
	}

}

/*
This is not a good way to assign synchornized Keyword to a method
becoz there are methods which u cannot access or when u cannot
have access to source code Thus u cannot add synchornized to the 
appropriate methods within the class.

Instead u can use Synchronied block.
 
 */


