package com.exceptionhandling;

public class TryAndCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int d,a;
		
		try//Monitor a block of code.
		{
			d=0;
			a=42/d;
			System.out.println("This will not be Printed.");
		}
		catch(ArithmeticException e)
		{
			System.out.println("Division by Zero.");
		}
		System.out.println("After Catch Statement.");
	}
}


/*
OUTPUT:

Division by Zero.
After Catch Statement.
*/
