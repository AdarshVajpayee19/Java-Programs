package com.collectionsandgenerics;

import java.util.Comparator;

public class CompImpl implements Comparator<Integer> 
{

	@Override
	public int compare(Integer o1, Integer o2) {
		/*
		if(o1>o2)
			return 1;//Swap.
		return -1;//Don't Swap.this leads to print in ascending Order or increasing order.
		
		//if we change o1<o2 then we get in decreasing order.
		 */
		
		//But we need To sort on the basis of last Digit.
		if(o1%100>o2%100)//it will sort on the basis of last digit if we write %10. we want to sort on the basis of last two digits then we need to use %100.
			return 1;
		return -1;
	}

}
