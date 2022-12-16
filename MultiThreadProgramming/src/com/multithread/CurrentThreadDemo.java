//Program 1.

package com.multithread;

public class CurrentThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t=Thread.currentThread();
		System.out.println("Current thread: "+t);
		t.setName("My Thread");
		System.out.println("After name Changed: "+t);
		try {
			for(int n=5;n>0;n--)
			{
				System.out.println(n);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("Main Thread Interrupted");
		}
	}

}

/*
OUTPUT:

Current thread: Thread[main,5,main]
After name Changed: Thread[My Thread,5,main]
5
4
3
2
1
*/

