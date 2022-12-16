package JavaOopsPrograms.InnerClasses;

//one way to get output has "Hi" Assume There is predefined class which prints "Hello".
//1.Polymorphism.
/*
public class AnonymousClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B obj=new C();
		obj.show();
	}
}

class B
{
	public void show()
	{
		System.out.println("Hello");
	}
}
class C extends B
{
	public void show()
	{
		System.out.println("Hi");
	}
}

*/
//Instead of extended the previous class we can do this :which is defined in below Code.

public class AnonymousClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		B obj=new B();//Here we are creating an instance And when we are creating the class for this object,then it will jump to that code.
//		obj.show();
		
		B obj=new B() {
			public void show() {
				System.out.println("Hi");
			}
		};
		//If u go to your Workspace and find out the file named "AnonymousClass$1.class" it is an Anonymous Class. 
		obj.show();
	}
}

class B
{
	public void show()
	{
		System.out.println("Hello");
	}
}
