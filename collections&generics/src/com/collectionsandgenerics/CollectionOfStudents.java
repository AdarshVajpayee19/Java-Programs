package com.collectionsandgenerics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionOfStudents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> studs=new ArrayList<Student>();
		studs.add(new Student(1,40));
		studs.add(new Student(2,35));
		studs.add(new Student(3,40));
		studs.add(new Student(4,37));
		studs.add(new Student(5,38));
		studs.add(new Student(6,39));
		
		//To Sort on the basis of Marks.
		Collections.sort(studs,(s1,s2)->{
			return s1.marks>s2.marks?-1:s1.marks<s2.marks?1:0;//-1 and 1 because we want to print in descending order i.e highest marks first.
		});
		
		for(Student s:studs)
		{
			System.out.println(s);
		}
	}

}

class Student
{
	int rollno;
	int marks;
	
	public Student(int rollno, int marks) {
		this.rollno = rollno;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", marks=" + marks + "]";
	}
}
/*
OUTPUT:

Student [rollno=1, marks=40]
Student [rollno=2, marks=35]
Student [rollno=3, marks=40]
Student [rollno=4, marks=37]
Student [rollno=5, marks=38]
Student [rollno=6, marks=39]

Say now we want to Print the values in such way that highest value comes Fast And lowest Value comes last.
we use Collections.sort(,).

Student [rollno=1, marks=40]
Student [rollno=3, marks=40]
Student [rollno=6, marks=39]
Student [rollno=5, marks=38]
Student [rollno=4, marks=37]
Student [rollno=2, marks=35]

 */