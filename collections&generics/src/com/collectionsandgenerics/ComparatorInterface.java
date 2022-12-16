package com.collectionsandgenerics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> values=new ArrayList<Integer>();
		values.add(385);
		values.add(998);
		values.add(774);
		values.add(236);
		values.add(881);
		
		//1.Using userdefined class in the same package,which implements Comparator interface.
		/*
		 Comparator<Integer> com=new CompImpl();
		 Collections.sort(values, com);
		 */
		
		//2.Using Anonymous Class.
		/*
		Comparator<Integer> com=new Comparator<Integer>()
									{
										public int compare(Integer o1,Integer o2)
										{
											if(o1%10>o2%10)
												return 1;
											return -1;
										}
									};
		Collections.sort(values, com);
		*/
		
		//3.Using LambdaExpressions:
		/*
		Comparator<Integer> com=(o1,o2)->{
										if(o1%100>o2%100)
											return 1;
										return -1;
									};
		Collections.sort(values, com);
		*/
		
		/*4.
		Comparator<Integer> com=(o1,o2)->{
			return o1%10>o2%10? 1:-1;//using Ternary Operator.
		};
		Collections.sort(values, com);
		*/
		
		Collections.sort(values, (o1,o2)->{return o1%100>o2%100?1:-1;});
		for(int i:values)
		{
			System.out.println(i);
		}
		
	}

}
/*
Sorting on the basis of last digit.by using %10 in class defined in different program named CompImpl.

881
774
385
236
998

Sorting on the basis of last two digits.by changing to  %100 in class defined in different program named CompImpl.

236
774
881
385
998

 */
