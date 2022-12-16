package com.exceptionhandling;

public class ThrowDemo {
	static void demoProc()
	{
		try
		{
			throw new NullPointerException("Demo");
		}
		catch(NullPointerException e)
		{
			System.out.println("Caught Inside Demoproc");
			throw e;//Re-throw the Exception.
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			demoProc();
		}
		catch(NullPointerException e)
		{
			System.out.println("Recaught : "+e);
		}
	}

}
/*
OUTPUT:

Caught Inside Demoproc
Recaught : java.lang.NullPointerException: Demo

 */
