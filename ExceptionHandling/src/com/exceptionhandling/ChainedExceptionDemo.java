package com.exceptionhandling;

public class ChainedExceptionDemo {

	static void demoProc()
	{
		NullPointerException e=new NullPointerException("Top Layer");
		//Add a clause
		e.initCause(new ArithmeticException("Cause"));
		throw e;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			demoProc();
		}
		catch(NullPointerException e)
		{
			System.out.println("Caught: "+e);
			System.out.println("Original Cause: "+e.getCause());
		}
	}

}
/*
 OUPUT:
 
Caught: java.lang.NullPointerException: Top Layer
Original Cause: java.lang.ArithmeticException: Cause

 */
