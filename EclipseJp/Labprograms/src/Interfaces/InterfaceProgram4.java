package Interfaces;

@java.lang.FunctionalInterface
interface Demos
{
	void subs();
	default void show() {
		System.out.println("In Show");
	}
}

interface MyDemo
{
	default void show() {
		System.out.println("In MyDemo Show");
	}
}


class DemoImps implements Demos,MyDemo
{
	public void subs() {
		// TODO Auto-generated method stub
		System.out.println("Subs Method");
	}
	//Since in both the interfaces show Method is defined it leads to ambiguity problem and compiler gets confused which method to call.
	//so to avoid that one method is too write that show method Again in that class which implements both interfaces.
	//1.One way 
	/*
  
	public void show() {
		System.out.println("In DemoImps Show");
	}
	
	*/
	//2.Second method 

	/*
	@Override
	public void show() {
		// TODO Auto-generated method stub
		Demos.super.show();
	}
	*/
	@Override
	public void show() {
		// TODO Auto-generated method stub
		MyDemo.super.show();
	}
}

public class InterfaceProgram4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demos obj=new DemoImps();
		obj.subs();
		obj.show();
	}
}
