package com.collectionsandgenerics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionAndGenerics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection values=new ArrayList();
		values.add(3);
		values.add("Adarsh");
		values.add(8.5f);
		/*
		Two Ways to Fetch the value from Collection is that By using 
		1.Iterator.
		2.Enhanced ForLoop. (Normal Forloop Won't Work).
		 */
		
		/* 1.Old Technique:
		Iterator i=values.iterator();//this iterator methods returns an Object of Iterator.
		
		while(i.hasNext())
		{
			//hasNext() methods check is there any next element present in Collection
			System.out.println(i.next());
		}
		*/
		/*2.Enhanced ForLoop. Advance Technique
		for(Object i:values)
		{
			System.out.println(i);
		}
		 */
		values.remove("Adarsh");
		for(Object i:values)
		{
			System.out.println(i);
		}
	}

}
/*
3
Adarsh
8.5

3
8.5
 */

