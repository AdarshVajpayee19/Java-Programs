package JavaImpPrograms.PrimeNumber;

import java.util.Scanner;

class PrimeNumber
{
    public static void main(String[] args)
    {
        int i,n,flag=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        n=sc.nextInt();
        if(n==0 || n==1)
            System.out.println(n+" is not a prime number");
        else
        {
            for(i=2; i<=n/2; i++)
            {
                if(n%i==0)
                {
                    System.out.println(n+" is not a prime number");
                    flag=1;
                    break;
                }
            }
            if(flag==0)
            System.out.println(n+" is a prime number");      
        }   
    }
}
/*
Output:

Enter the Number : 7
7 is a prime number
*/