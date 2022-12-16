package com.multithread;


class CallDemo
{
    void call(String msg)
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

class Calling implements Runnable
{
	String msg;
	CallDemo target;
	Thread t;
	public Calling(CallDemo targ,String s)
	{
		target=targ;
		msg=s;
		t=new Thread(this);
		t.start();
	}
	public void run()
	{
		synchronized(target)
		{
			target.call(msg);
		}
	}
}
public class synchronizedBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CallDemo target=new CallDemo();
		Calling ob1=new Calling(target,"Hello");
		Calling ob2=new Calling(target,"Synchronized");
		Calling  ob3=new Calling(target,"World");
		
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
