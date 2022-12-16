package JavaOopsPrograms.InnerClasses;

public class NestedClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ABC a=new ABC();
		ABC.Z obj=new ABC.Z();
		obj.show();
	}
}
class ABC
{
	int rollno;
	int sname;
	
	static class Z//When We use static keyword it basically means Nested class not much use.
	{
		public void show()
		{
			System.out.println("Adarsh Vajpayee");
		}
	}
}
