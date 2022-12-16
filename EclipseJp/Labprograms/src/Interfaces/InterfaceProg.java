package Interfaces;

interface Abc
{
	void show();
}
public class InterfaceProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abc obj=new Abc() {
			public void show() {
				System.out.println("In Show");
			}
		};
		obj.show();
	}
}
