package com.multithread;

//Same Code As ThreadDemo2 see we have reduced the number of lines of code. 
//Since Runnable is a Functional Interface We can use lambdaExpressions and some times Anonymous class as well.
public class ThreadDemo2UsingLambdaExpressions {

	public static void main(String[] args)  throws Exception
	{
		// TODO Auto-generated method stub
		Thread t1 = new Thread(() -> 
		{
			for (int i = 1; i <= 5; i++) {
				System.out.println("HI");
				try {Thread.sleep(1000);} catch (Exception e) {}
			}
		});
		Thread t2 = new Thread(() -> 
		{
			for (int i = 1; i <= 5; i++) {
				System.out.println("HELLO");
				try {Thread.sleep(1000);} catch (Exception e) {}
			}
		});

		t1.start();
		try {Thread.sleep(10);} catch (Exception e) {}
		t2.start();
		
		t1.join();
		t2.join();
		System.out.println("BYE.......");
	}

}
