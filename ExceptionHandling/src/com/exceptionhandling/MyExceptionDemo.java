package com.exceptionhandling;

class MyException extends Exception
{
	private int detail;

	public MyException(int a) {
		detail = a;
	}
	public String toString()
	{
		return "MyException["+detail+"]";
	}
	
}
public class MyExceptionDemo {
	
	static void compute(int a)throws MyException
	{
		System.out.println("Called Compute("+a+")");
		if(a>10)
			throw new MyException(a);
		System.out.println("Normal Exit.");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			compute(1);
			compute(20);
		}
		catch(MyException e)
		{
			System.out.println("Caught : "+e);
		}
	}

}
/*
OUTPUT:

Called Compute(1)
Normal Exit.
Called Compute(20)
Caught : MyException[20]

 */