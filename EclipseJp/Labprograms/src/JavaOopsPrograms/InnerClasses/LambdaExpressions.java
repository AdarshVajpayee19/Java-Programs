package JavaOopsPrograms.InnerClasses;

//1.By creating an XYZ Instance 
/*
public class LambdaExpressions {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		B obj=new XYZ();
		obj.show();
	}
}

//In interface we cannot Define a method Only We declare a method.All methods in interface are abstract And public.
interface B
{
	void show();
}

class XYZ implements B
{
	public void show()
	{
		
	}
}
*/
//2.By Using an Inner class.
/*
public class LambdaExpressions {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		C obj=new C() {
			public void show()
			{
				System.out.println("Hello Everyone");
			}
		};
		obj.show();
	}
}
*/

//Interface which has only one method is called as SAM(Single Abstract Method Interface). this is only seen till java 1.7
/*

interface C
{
	void show();
}

*/
//but in java 8 interface which has only one method is called as Functional interface.

@FunctionalInterface
interface C
{
	void show();
//	void Add(); if u add more than one method it will show error.Since Functional Interface can have only one method.
}

//Lambda Expressions:Shown below
public class LambdaExpressions {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		C obj=()->{								//Lambda Expression//JVM Doesnot create Anonymous Class For the this since JVM knows That it is kind of anonymous Class 
			System.out.println("Hello Adarsh Vajpayee");
			};
		obj.show();
	}
}
//Lambda Expressions only Works with funtional Interface.
//Advantages of funtional Interface is it works with Stream API.

