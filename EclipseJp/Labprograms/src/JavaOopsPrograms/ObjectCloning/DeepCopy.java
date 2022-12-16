package JavaOopsPrograms.ObjectCloning;


//Disadvantages Of Deep Copy is :
//Copying each And Every value of an Object to Another object is Quite Tedous Proccess 
public class DeepCopy {
	public static void main(String args[])
	{
		DC obj1=new DC();
		obj1.i=10;
		obj1.j=20;
		
		DC obj2=new DC();
		obj2.i=obj1.i;
		obj2.j=obj1.j;
		
		obj2.j=8;
		System.out.println(obj1);
		System.out.println(obj2);
	}
}
class DC
{
	int i;
	int j;
	@Override
	public String toString() {
		return "DC [i=" + i + ", j=" + j + "]";
	}
}