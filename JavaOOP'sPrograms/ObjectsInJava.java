import java.util.Scanner;

/*                 
================================================================================================================
                                                    "OBJECT"
================================================================================================================
An object is an instance of a class. A class is a template or blueprint from which objects are created. So, an object is the instance(result) of a class.

Object Definitions:

--> An object is a real-world entity.
--> An object is a runtime entity.
--> The object is an entity which has state and behavior.
--> The object is an instance of a class.

There are 3 ways to initialize object in Java.

1.By reference variable
2.By method
3.By constructor

There are many ways to create an object in java. They are:

--> By new keyword
--> By newInstance() method
--> By clone() method
--> By deserialization
--> By factory method etc.

                                     "ANONYMOUS OBJECT"

Anonymous simply means nameless. An object which has no reference is known as an anonymous object. It can be used at the time of object creation only.

If you have to use an object only once, an anonymous object is a good approach. 

Example : new Calculation();//anonymous object  

*/

class ObjectsInJava
{
    void factorial(int n)
    {
        int factorial=1;
        for(int i=1;i<=n;i++)
        {
            factorial=factorial*i;
        }
        System.out.println("Factorial is : "+factorial);
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the factorial of a number You want to Print : ");
        int n=sc.nextInt();
        new ObjectsInJava().factorial(n);//Calling method with anonymous object
    }
}



