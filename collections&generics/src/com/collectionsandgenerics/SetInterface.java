package com.collectionsandgenerics;

import java.util.Set;
import java.util.TreeSet;

public class SetInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Using HashSet: it will not give the values in Sequence.
		
//		Set<Integer> values=new HashSet<>();//In Set We will get Unique Elements.(No Duplication)
		
		//For Output 1;
//		System.out.println(values.add(5));
//		System.out.println(values.add(6));
//		System.out.println(values.add(9));
//		System.out.println(values.add(6));//this will not get printed.
		
//		In Hashing we know that nearest Value it will fetch using some Algorithms.so sequence is not getting maintained.
		
//		System.out.println(values.add(87));
//		System.out.println(values.add(97));
//		System.out.println(values.add(34));
//		System.out.println(values.add(92));
		
		
		//Using TreeSet:
		
		Set<Integer> values=new TreeSet<>();
		
		System.out.println(values.add(87));
		System.out.println(values.add(97));
		System.out.println(values.add(34));
		System.out.println(values.add(92));
		
		for(int i:values)
		{
			System.out.println(i);
		}
		
	}

}
/*
OUTPUT 1:Using HashSet.

true
true
true
false (means 6 is Already Added.)
5
6
9

OUTPUT 2:Using HashSet.

true
true
true
true
97
34
87
92

OUTPUT 3:Using TreeSet

true
true
true
true
34
87
92
97

TreeSet will give Sequence in Ascending Order.

*/