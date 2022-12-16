package Interfaces;

interface Abcd
{
	void show();
}
public class InterfaceProgram2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Abcd obj=new Abcd(); Since we cannot Create An Object of interface.
		
		Abcd obj=new AbcDemo();//this AbcDemo Class is defined in same package or u can ddefine in this program as well.
		obj.show();
	}
}

