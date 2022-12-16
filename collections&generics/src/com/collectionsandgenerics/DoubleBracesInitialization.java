package com.collectionsandgenerics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DoubleBracesInitialization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		ONE WAY:
		
		List<Integer> values=new ArrayList<Integer>();
		
		values.add(56);
		values.add(45);
		values.add(876);
		*/
		/*
		SECOND WAY:
		
		List<Integer> values=Arrays.asList(82,90,92);
		
		 */
		
		//Third Way : Double Braces Initialization with (Outer bracket)Anonymous Inner Class and (Inner bracket)Instantation initializer.
		List<Integer> values=new ArrayList<Integer>()
		{{
				add(90);
				add(92);
				add(82);
		}};
		
		for(int i:values)
		{
			System.out.println(i);
		}
	}

}
