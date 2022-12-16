package com.collectionsandgenerics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Students> studs=new ArrayList<Students>();
		studs.add(new Students(1,40));
		studs.add(new Students(2,35));
		studs.add(new Students(3,40));
		studs.add(new Students(4,37));
		studs.add(new Students(5,38));
		studs.add(new Students(6,39));
		
		//To Sort on the basis of Marks.
		Collections.sort(studs);//Here Collection Responsibilty is to sort it.what if student class knows how to sort this.
		
		for(Students s:studs)
		{
			System.out.println(s);
		}
	}

}

class Students implements Comparable<Students>
{
	int rollno;
	int marks;
	
	public Students(int rollno, int marks) {
		this.rollno = rollno;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", marks=" + marks + "]";

	}
	
	//one object is an instance which called this compareTo and the other which is passed.
	public int compareTo(Students s)
	{
		return this.marks>s.marks?-1:this.marks<s.marks?1:0;
	}
}
/*
OUTPUT:

Student [rollno=1, marks=40]
Student [rollno=3, marks=40]
Student [rollno=6, marks=39]
Student [rollno=5, marks=38]
Student [rollno=4, marks=37]
Student [rollno=2, marks=35]

Which one is Better Comparator Or Comparable Depends on situation.
 */