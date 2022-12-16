/*
                                           ....ExceptionHandling....
 Any abnormal condition 
 Two types of exception :
 Five keywords : try ,catch,throw,throws,finally.

 // java.lang.ArithmeticException : / by zero at ExceptionHandling.main (Stack)
*/

/*
import java.io.*;
import java.util.Scanner;

public class ExceptionHandling 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the values for a and b:");
        int a,b,res;
        a=sc.nextInt();
        b=sc.nextInt();
        try{
            res=a/b;
            System.out.println("Value = "+res);
        }
        catch(Exception e)
        {
            System.err.println("Exception : "+e.getMessage());
            System.err.println("Exception : "+e);
        }
        System.out.println("After catch statement");
    }
}

 */


// class ExceptionHandling
// {
//     static void subroutine()
//     {
//         int d=0;
//         int a=10/d;
//     }
//     public static void main(String args[])
//     {
//         ExceptionHandling.subroutine();
//     }
// }

//                                              Nested Try

// import java.io.*;
// class ExceptionHandling
// {
//     public static void main(String[] args) 
//     {
//         Try
//         {
//         int a=args.length;
//         int b=42/a;
//         System.out.println("a: "+a);
//         try{
//             if((a==1))
//                 a=a/(a-a);//Division by zero.
//             if(a==2)
//             {
//                 int c[]={1};
//                 c[42]=99;//
//             }
//         }
//         catch(ArrayIndexOutOfBoundsException e)
//         {
//             System.out.println("Array index out of bounds : "+e);
//         }
//     }
//         catch(ArithmeticException e){
//             System.out.println("Divide by 0: "+e);
//         }
//     }
// }

//                            Throw :Throws exception Explicitly using throw statement

// throw ThrowableInstance;

// there are two ways you can obtain a throwable objects:
//1.using parameter.
//2.using new operator.

// class ExceptionHandling
// {
//     static void demoproc()
//     {
//         try{
//             throw new NullPointerException();
//         }
//         catch( NullPointerException e )
//         {
//             System.out.println("Caught inside Demoproc");
//             throw e;//re-throw the exception.
//         }
//     }
//     public static void main(String[] args) {
//         try{
//             demoproc();
//         }
//         catch(NullPointerException e )
//         {
//             System.out.println("Recaught : "+e);
//         }
//     }
// }


//                                  THROWS
// class ExceptionHandling 
// {
//     static void throwOne() throws IllegalAccessException
//     {
//         System.out.println("Inside throwOne");
//         throw new IllegalAccessException("Demo");
//     }
//     public static void main(String args[])
//     {
//         try{
//             throwOne();
//         }
//         catch(IllegalAccessException e)
//         {
//             System.out.println("Caught: " + e.getMessage());
//         }
//     }
// }

//                                             Finally 
// class ExceptionHandling
// {
//     static void procA()
//     {
//         try{
//             System.out.println("Inside ProcA");
//             throw new RuntimeException("Demo");
//         }
//         finally{
//             System.out.println("ProcA Finally");
//         }
//     }
//     static void procB()
//     {
//         try{
//             System.out.println("Inside ProcB");
//             return;
//         }
//         finally{
//             System.out.println("ProcC Finally");
//         }
//     }
//     static void procC()
//     {
//         try{
//             System.out.println("Inside ProcC");
//             return;
//         }
//         finally{
//             System.out.println("ProcC Finally");
//         }
//     }
//    public static void main(String[] args) {
    
//        try{
//            procA();
//        }
//        catch(Exception e)
//        {
//            System.out.println("Exception Caught");
//        }
//    procB();
//    procC();
//    }
// }


//                                                    Creating our own Exception
// class OwnException extends Exception
// {
//     private int detail;
//     OwnException(int a)
//     {
//         detail=a;
//     }
//     public String toString()
//     {
//         return "Exception handling[" + detail + "]";
//     }
// }
// class ExceptionHandling
// {
//     static void compute(int a) throws OwnException
//     {
//         System.out.println("Called compute(" + a + ")");
//         if(a>10)
//         {
//             throw new OwnException(a);
//         }
//         System.out.println("Normal Exit");
//     }
//     public static void main(String[] args) {
//         try{
//             compute(1);
//             compute(20);
//         }catch(OwnException e)
//         {
//             System.out.println("Caught : "+e);
//         }
//     }
// }

//Creating the owm method for exception
class ExceptionHandling
{
    static void demoproc(){
        NullPointerException e = new NullPointerException("Top layer");
        e.initCause(new ArithmeticException("Cause"));
        throw e;
    }
    public static void main(String[] args) {
        try{
            demoproc();
        }
        catch(NullPointerException e)
        {
            System.out.println("Caught : "+e);
            System.out.println("Original cause :  "+e.getCause());
        }
    }
}