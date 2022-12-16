package Interfaces;

abstract class Writer
{
	public abstract void write();
}

class Pen extends Writer
{
	public void write()
	{
		System.out.println("Hello I Love Use Black Pen while Writing Stories!!!!!");
	}
}

class Pencil extends Writer
{
	public void write()
	{
		System.out.println("Hello I Love Use Pencil When i usually do drawing!!!!!");
	}
}

class Kit
{
	public void DoSomething(Writer p)
	{
		p.write();
	}
}

public class AbstractExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Kit k=new Kit();
		Writer p=new Pen();
		Writer pc=new Pencil();
		k.DoSomething(pc);
		k.DoSomething(p);
	}
}
