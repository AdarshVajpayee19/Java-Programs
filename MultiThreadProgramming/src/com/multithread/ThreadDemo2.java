package com.multithread;


class Hi implements Runnable
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("HI");
			try {Thread.sleep(1000);}catch(Exception e) {}
		}
	}
}

class Hello implements Runnable
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("HELLO");
			try {Thread.sleep(1000);}catch(Exception e) {}
		}
	}
}
public class ThreadDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable obj1=new Hi();//Here we r taking an reference of an interface to an object of class.
		Runnable obj2=new Hello();
		
		Thread t1=new Thread(obj1);
		Thread t2=new Thread(obj2);

		t1.start();
		try {Thread.sleep(10);}catch(Exception e) {}
		t2.start();
		
	}

}
/*
OUTPUT:

HI
HELLO
HI
HELLO
HI
HELLO
HI
HELLO
HI
HELLO

 */
