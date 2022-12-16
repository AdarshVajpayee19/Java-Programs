package com.multithread;

class Callme
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

class Caller implements Runnable
{
	String msg;
	Callme target;
	Thread t;
	public Caller(Callme targ,String s)
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

public class NotSynchronized {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Callme target=new Callme();
		Caller ob1=new Caller(target,"Hello");
		Caller ob2=new Caller(target,"Synchronized");
		Caller  ob3=new Caller(target,"World");
		
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
OUTPUT:

[Hello[Synchronized[World]]]


This results in the mixed-up Output of the three message Strings.
in this program from calling the same method,on the same object, at the 
same time.This is known as Race Condition,Becoz
the Three Threads are racing each other to complete the method.
*/
