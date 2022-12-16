package com.collectionsandgenerics;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class MapInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Key-Value Pairing.
		
		//In HashSet and HashMap follow the concept of hashcode.so it might print Anyhow not in proper Format.
		
		//1.By Using HashMap:

		Map<String,String> map=new HashMap<>();
		map.put("MyName","Adarsh");
		map.put("Actor","Shahid");
		map.put("Ceo","Mari");
		map.put("Actor","Amir");//what happens is that it will replace Shahid kapoor since it has same Key.
		//Also Since We are using Set Interface.
       
		Set<String> keyz=map.keySet();
		
		for(String key:keyz)
		{
			System.out.println(key+"  "+map.get(key));
		}
		
//		System.out.println(map.get("MyName"));//Adarsh Vajpayee.
//		System.out.println(map.get("Actor1"));//null.because there is no key named as Actor1.
		
		
		//2.By Using Hashtable:
		
		Map<String,String> mapp=new Hashtable<>();
		mapp.put("MyName","Adarsh Vajpayee");
		mapp.put("Actor","Shahid Kapoor");
		mapp.put("Ceo","Marisha");
		mapp.put("Actor","Amir Khan");
		
		Set<String> keys=mapp.keySet();
		
		for(String key:keys)
		{
			System.out.println(key+"  "+mapp.get(key));
		}
		
	}

}
/*
The Difference Between Hashtable And HashMap is : 
* Hashtable is Synchronized,and also if you want ThreadSafety then go with Hashtable.
** HashMap is not Synchronized,and also if you don't want ThreadSafety then go with HashMap.


OUTPUT :

MyName  Adarsh
Actor  Amir
Ceo  Mari
Actor  Amir Khan
MyName  Adarsh Vajpayee
Ceo  Marisha
*/
