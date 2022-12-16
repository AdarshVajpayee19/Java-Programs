package com.collectionsandgenerics;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//												Map Interface
/*									
 1.HashMap			2.HashTable			3.TreeHashMap		4.LinkedHashMap 												
 */
public class MapEntryNestedInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Map<String,String> phonebook=new HashMap<>();
			phonebook.put("Gopal", "7171727187");
			phonebook.put("Adarsh", "7676780636");
			phonebook.put("Shabri", "8143267788");
			phonebook.put("Gnanesh", "6361670421");
			phonebook.put("manoj", "9132315929");
			
			
			//to get all keys.
			
			//1.One way
			/*
			 
			Set<String> keys=phonebook.keySet();
			
			for(String i:keys)
			{
				System.out.println(i+" : "+phonebook.get(i));
			}
			*/
		    
			//2.Second Way By Using MapEntry-Nested-Interface.Here Entry is also an Interface.
			
			Set<Map.Entry<String,String>> values=phonebook.entrySet();
			
			for(Map.Entry<String, String> e:values)
			{
				System.out.println(e.getKey()+" : "+e.getValue());
				e.setValue("III");
			}
	}

}

//NOTE : HashMap Allows one null key,where as HashTable Doesn't Allow Null Key. 

/*
OUTPUT:

Adarsh : 7676780636
Shabri : 8143267788
manoj : 9132315929
Gopal : 7171727187
Gnanesh : 6361670421

 */
