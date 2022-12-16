// Fibonacci number without  using  Recursion.
import java.io.*;
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number of Fibo Numbers u want: ");
        int n1=0,n2=1,count;
        count=sc.nextInt();
        System.out.print(n1+" "+n2);
    
        for(int i=2;i<count;i++)
        {
            int  n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }   
    }
}
/*
Enter the Number of Fibo Numbers u want: 10
0 1 1 2 3 5 8 13 21 34
*/
