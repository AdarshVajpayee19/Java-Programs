// Fibonacci numbers with Recursion.
import java.io.*;
import java.util.Scanner;

class FiboRecursive 
{
    static int n1=0,n2=1,n3;
    static void PrintFibonacci(int count)
    {
        if(count>0)
        {
            n3=n1+n2;
            n1=n2;
            n2=n3;
            System.out.print(" "+n3);
            PrintFibonacci(count-1);
        }
    } 
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int count;
        System.out.print("Enter the Number of Fibo Numbers u want: ");
        count=sc.nextInt();
        System.out.print(n1+" "+n2);
        PrintFibonacci(count-2);
    }
}

/*
Output:

Enter the Number of Fibo Numbers u want: 8 
0 1 1 2 3 5 8 13
 */