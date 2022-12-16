package Interfaces;

@java.lang.FunctionalInterface
interface Demo
{
	void subs();
	default void show() {
		System.out.println("In Show");
	}
}

class DemoImp implements Demo
{
	public void subs() {
		// TODO Auto-generated method stub
		System.out.println("Subs Method");
	}
}

public class FunctionalInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo obj=new DemoImp();
		obj.subs();
		obj.show();
	}
}
