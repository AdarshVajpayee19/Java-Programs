package com.exceptionhandling;

public class MultiCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int a=args.length;
			System.out.println("a = "+a);
			int b=42/a;
			int c[]= {1};
			c[42]=99;
		}
		catch(ArithmeticException e)
		{
			System.err.println("Divide by 0: "+e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array index OOb: "+e);
		}
		System.out.println("After Try/catch Blocks.");
	}
}
/*
OUTPUT:

a = 0
Divide by 0: java.lang.ArithmeticException: / by zero
After Try/catch Blocks.

*/
