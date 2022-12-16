package com.collectionsandgenerics;

import java.util.Vector;

/*
Vectors : Dynamic Array in which u will increase the size of array.
Vectors Came in java 1.0 more before List i.e. 1.2
 */
public class VectorsInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Vector<Integer> v=new Vector<Integer>();
			v.add(10);
			v.add(9);
			v.add(23);
			v.add(12);
			v.add(30);
			v.add(10);
			v.add(9);
			v.add(23);
			v.add(12);
			v.add(30);
			v.add(10);
			v.add(9);
			v.add(23);
			v.add(12);
			v.add(30);
			v.add(10);
			v.add(9);
			v.add(23);
			v.add(12);
			v.add(30);
			System.out.println(v.capacity());
			
			v.remove(19);
			
			for(int i:v)
			{
				System.out.println(i);
			}
	}

}
/*

The Difference Between Vector and ArrayList is :

* Vectors Increase the Capacity By 100%.
** Where As ArrayList Increase the Capacity By 50% so it Very useful when it comes to memory management.

*** Vectors Wastes lots of memory where ArrayList Saves memory.
**** Theortically Vectors are ThreadSafe Since There Methods are Sychronized.where as Arraylist Are Not ThreadSafe.
***** ArrayList is Fast,Vector is slow.
*/
