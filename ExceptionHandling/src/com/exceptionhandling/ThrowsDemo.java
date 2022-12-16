package com.exceptionhandling;

public class ThrowsDemo {
	static void throwOne() throws IllegalAccessException 
	{
		System.out.println("Inside throwOne.");
		throw new IllegalAccessException("Demo.");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			throwOne();
		}
		catch(IllegalAccessException e)
		{
			System.out.println("Caught : "+e);
		}
	}

}
