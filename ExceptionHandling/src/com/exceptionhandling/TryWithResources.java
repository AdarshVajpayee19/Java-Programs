package com.exceptionhandling;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
							Throwable
						   / 		\
						  /			 \
				     Exception      Error
				        /			   \
				     Checked		Unchecked
				      /					 \
 				*IOException			*RuntimeException
 				*SQLException			

*In this program we BufferRreaderto give input and we will not use catch and also Finally block to deallocate resource,
   like br.close();in finally Block as we all know we use finally block to deallocate resource.
   
*/
public class TryWithResources {

	public static void main(String[] args) throws Exception//to handle exception at line 29.
	{
		// TODO Auto-generated method stub
		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in)))
		{
			String str="";
			str=br.readLine();		
		}
	}

}
