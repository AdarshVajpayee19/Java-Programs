package com.exceptionhandling;

public class SuperSubCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int a=0;
			int b=42/a;
		}
		catch(Exception e)
		{
			System.out.println("Generic Exception Class.");
		}
		
		//ArithmeticException is a subclass of Exception.
		/*
		catch(ArithmeticException e)
		{
			System.out.println("This is never reached.");
		}
		
		Points to Remember.
		
		1.Exception Subclasses must come Before any of their Superclasses.
		2.This is because a catch Statemen that uses a superclass will catch 
		  Exceptions of that type plus any of its subclasses.
		3.Thus ,a subclass would never be reached if it came after its superclass.
		
		Important: In Java,Unreachble code is Error.
		*/
	}

}
