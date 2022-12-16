package com.collectionsandgenerics;

import java.util.ArrayList;

@SuppressWarnings("unused")
class Containers<T extends Number>
{
	T value;

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	public void show()
	{
		System.out.println(value.getClass().getName());
	}
	/*
	1.
	public void demo(ArrayList<? extends T> obj)//Integer extends Number.
	{
		
	}
	2.
	public void demo(ArrayList<? super T> obj)//Number is a Super Class of Integer.
	{
		
	}
	*/
}
public class AnotherSyntax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
	Syntax TYPE 1:
		Containers<Number> obj=new Containers<>();
		obj.show();
		obj.demo(new ArrayList<Integer>());
		
	Syntax TYPE2:
		Containers<Integer> obj=new Containers<>();
		obj.show();
		obj.demo(new ArrayList<Number>());
		
		 */
	}

}
