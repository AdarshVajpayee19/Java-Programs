package Interfaces;

interface Person
{
	void write();
}

class pens implements Person
{
	public void write() {
		System.out.println("I hate to use black pen");
	}
}

class pencils implements Person
{
	public void write() {
		System.out.println("I love to use pencil while drawing");
	}
}
class Kits
{
	public void Dosomething(Person p) {
		p.write();
	}
}
public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Kits k=new Kits();
		Person p=new pens();
		Person pc=new pencils();
		k.Dosomething(p);
		k.Dosomething(pc);
	}

}
