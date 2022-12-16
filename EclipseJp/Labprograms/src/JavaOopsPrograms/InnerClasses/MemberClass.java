package JavaOopsPrograms.InnerClasses;


/*

Inner Classes Are of 4 types :
1.Members Class.
2.Nested Class.
3.Anonymous Class.
4.Lambda Class.

 */

//Example For: 1.Members Class.
public class MemberClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		B obj=new B();//here InnerDemo Knows About only a it doesnt know about B Class.
//		obj.show();
		
		//if we run the code by commenting the about to statements and see in file directory or workspace where u create this javafiles,
		//U will get to there A$B.class is created which means B class is bounded by the A class.
		A a=new A();
		A.B obj=a.new B();
		obj.show();
	}
}
class A
{
	int rollno;//Member Variables.
	String sname;
	
	
	class B
	{
		public void show()
		{
			System.out.println("Hello");
		}
	}
	
}
