
/*
================================================================================================================
                                                    "CLASS"
================================================================================================================
A class is a group of objects which have common properties. It is a template or blueprint from which objects are created. It is a logical entity. It can't be physical.

A class in Java can contain:

*Fields
*Methods
*Constructors
*Blocks
*Nested class and interface

*/

import java.util.Scanner;

class Rectangle
{  
    int length;  
    int width;  
    void insert(int l, int w)
    {  
     length=l;  
     width=w;  
    }  
    void calculateArea()
    {
        System.out.println(length*width);
    }  
}  

class ClassesInJava
   {
    public static void main(String args[])
    {  
     Rectangle r1=new Rectangle();  
     Rectangle r2=new Rectangle();  
     int length,width;
     Scanner sc=new Scanner(System.in);
     System.out.print("Enter the Length and width For First Rectangle : ");
     length=sc.nextInt();
     width=sc.nextInt();
     r1.insert(length,width);
     r1.calculateArea();
     System.out.print("Enter the Length and width For Second rectangle : ");
     length=sc.nextInt();
     width=sc.nextInt();
     r2.insert(length,width);
     r2.calculateArea();
   }  
}  
/*
OUTPUT :

Enter the Length and width For First Rectangle : 10 20
200
Enter the Length and width For Second rectangle : 13 25
325
 */