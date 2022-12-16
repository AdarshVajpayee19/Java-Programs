package com.collectionsandgenerics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ListInterfaceToSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> c=new ArrayList<Integer>();
		Random r=new Random();
		
		for(int i=1;i<=10;i++)
		{
			c.add(r.nextInt(1000));
		}
		
		Collections.sort(c,(i1,i2)->{
			return i1%10>i2%10?1:i1%10<i2%10?-1:0;
		});
		int count=0;
		for(int j:c)
		{
			System.out.println(j+"\t");
			count++;
		}
		System.out.println("No of Random Number Generated: "+count);
	}

}
/*
OUTPUT:

890	
700	
932	
172	
372	
85	
327	
817	
517	
328	
No of Random Number Generated: 10
 */
