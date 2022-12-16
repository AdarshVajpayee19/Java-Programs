package JavaOopsPrograms.ObjectCloning;

public class ObjectClone {

	public static void main(String[] args) throws CloneNotSupportedException
	{
		// TODO Auto-generated method stub
		OC obj1=new OC();
		obj1.i=5;
		obj1.j=6;
		
		OC obj2=(OC)obj1.clone();
		
		System.out.println(obj1);
		System.out.println(obj2);
	}
}

class OC implements Cloneable
{
	int i;
	int j;
	@Override
	public String toString() {
		return "OC [i=" + i + ", j=" + j + "]";
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}	
}
