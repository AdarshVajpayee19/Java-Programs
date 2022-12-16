package com.exceptionhandling;

public class FinallyDemo {
	//Through an exception out of Method.
	static void procA()
	{
		try
		{
			System.out.println("Inside ProcA");
			throw new RuntimeException("demo");
		}
		finally
		{
			System.out.println("ProcA's Finally.");
		}
	}
	
	static void procB()
	{
		try
		{
			System.out.println("Inside ProcB");
			return;
		}
		finally
		{
			System.out.println("ProcB's Finally.");
		}
	}
	
	static void procC()
	{
		try
		{
			System.out.println("Inside ProcC");
		}
		finally
		{
			System.out.println("ProcC's Finally.");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			procA();
		}
		catch(Exception e)
		{
			System.out.println("Exception Caught.");
		}
		procB();
		procC();
	}

}
