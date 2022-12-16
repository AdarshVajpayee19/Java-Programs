package Interfaces;
/*

**Abstract  class : In Abstract  class we can Define and Declare methods.
**In interfaces We can declare ,but we cannot define the methods till (java 1.7)
**But later in (java 1.8) in interface we can declare and define the methods in interface.
By using 
	(i.) Default methods.
	(ii.)Static methods.
in interface u can any number of default methods but there should be only one abstract method.
**By default in interface previously we used to say that it has public abstract by default if we not explicitly define also
it will consider as public abstract .
**But know u may got to know that we got the same problem like we used to get to implement Multiple inheritance in java.
say two interfaces are have same methods,and now we want to call that method this leads to ambiguity.................

 */

interface I
{
	void add();//one abstract method.
	default void show() 
	{
		System.out.println("In interface I");
	}
}

interface J
{
	default void show() 
	{
		System.out.println("In interface J");
	}
}

class A 
{
	public void add() {
		
	}
	public void show() 
	{
		System.out.println("In Class A");
	}
}

public class DefaultMethodsInInterface extends A implements I
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		A obj=new A();
//		obj.show();
		DefaultMethodsInInterface obj=new DefaultMethodsInInterface(); 
		obj.show();
	}
}

/*
Output :

In Class A

Here you Can Understand that Class A gets more Priority than interface I.


Other than That in interfaces you cannot Create a methods which are Already Defined in some predefined Classes.
Example : Object Class.

Example Program :

Interface I
{
	default boolean equals(Object o)
	{
		return true;
	}
}


//Static Methods.
it is implemented after (java 1.8) not there before (java 1.7).
interface I
{
	static void show()
   {
		System.out.println("HI");
   }
}
you can see code in StaticMethodsInInterface

 */