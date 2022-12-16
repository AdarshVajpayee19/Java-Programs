package com.collectionsandgenerics;

/*

At a time when we want to create an object of Container.
For now we create an Container of Integer.
say we in future wants to create a container of Strings.
So we can that Strings by using" <T> " which represents Type of Value.

 */
class Container<T extends Number>//It will work for Integer as well as for Double,Float but it wont work for UserDefined Class EX:Student.
{
//	Integer value;
	T value;
	// we can see that we get getters and setters of type T.
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
}
public class OwnGenerics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Container<Integer> obj=new Container<>();
		/*
		 When we working with generics we cannot use Container<int> obj=new Container<>();//error
		 you need to use wrapper classes OR classes.
		 All Integer,Double,Float,etc....Extends Number Class
		 */
//		Container<?> obj=new Container<>(); //(Raw Type)
		obj.value=10;
		obj.show();
	}

}
/*
OUTPUT:

java.lang.Integer

*/