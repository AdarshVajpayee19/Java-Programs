package com.multithread;

class Counter
{
	int count;
	public synchronized void increment()
	{
		count++;//Here u are doing two Operations Addition and Assignment Operation.So if u not use Synchorized Keyword while using Thread U get different answer. 
	}
}

public class SyncDemo {

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		Counter c=new Counter();
		Thread t1=new Thread(new Runnable()
				{
					public void run()
					{
						for(int i=1;i<=1000;i++)
						{
							c.increment();
						}
					}
				});
		
		Thread t2=new Thread(new Runnable()
				{
					public void run()
					{
						for(int i=1;i<=1000;i++)
						{
							c.increment();
						}
					}
				});
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println("Count "+c.count);
	}

}
/*
OUTPUT:

Count 2000
 */
