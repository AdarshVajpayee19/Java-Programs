/*
==========================================================================================================
                                        OVERLOADING MAIN METHOD
==========================================================================================================
We can also overload the main() method. We can define any number of main() method in the class, but the method signature must be different.

 */


class OverLoadMain  
{  
public static void main(int a)  //overloaded main method  
{  
System.out.println(a);  
}  
public static void main(String args[])  
{     
System.out.println("main method invoked");  
main(6);  
}  
}  
