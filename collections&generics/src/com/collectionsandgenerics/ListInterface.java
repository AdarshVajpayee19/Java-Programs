package com.collectionsandgenerics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> values=new ArrayList<>();
		values.add(99);
		values.add(999);
		values.add(9);
		values.add(9999);
		values.add(999999);
		System.out.println("Before Sorting:");
//		for(int i:values)
//		{
//			System.out.print(i+"\t");
//		}
//		Instead of  using Enhanced ForLoop and 

		values.forEach(System.out::println);//Stream API ......Which Uses Lambda Expressions.In java 1.8
		
		Collections.sort(values);
		System.out.println();
		System.out.println("After Sorting:");
//		for(int i:values)
//		{
//			System.out.print(i+"\t");
//		}
		
		values.forEach(System.out::println);
		
		System.out.println("\nSorting Done!!!!!");
	}

}
/*
OUTPUT:

Before Sorting:
99	999	9	9999	999999	
After Sorting:
9	99	999	9999	999999	
Sorting Done!!!!!

 */