package Interfaces;

/*
Marker Interface: Without any methods.
SAM(Single AbstractMethod Interface):->Functional Interface.
Normal-Interface
 */
interface XYZ
{
	void show();
}

class XYZDemo implements XYZ
{
	public void show() {
		System.out.println("By using class XYZDemo which implements XYZ or Second main.");
	}
}
public class InterfaceProgram3 {

	/*
////	 One way:
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		XYZ obj= ()->System.out.println("In InterfaceProgram3 show");
		obj.show();
	}
	*/
	
	public static void main(String[] args)
	{
		XYZ obj=new XYZDemo();
		obj.show();
	}

}
