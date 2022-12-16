package JavaOopsPrograms.ObjectCloning;


//Three Ways To copy an object in Java 
/*
1.Shallow Copy.
2.Deep Copy.
3.Object Clone.
*/
import java.io.*;
public class shallowCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj=new A();
		obj.i=5;
		obj.j=6;
		System.out.println("I="+obj.i+" J="+obj.j);
		A objC=obj;
		obj.j=8;
		System.out.println("I="+objC.i+" J="+objC.j);		
		
	}

}

class A
{
	int i;
	int j;
}