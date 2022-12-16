//LeapYear: A year,if it is divisible by 4 and 400.But not divisible by 100.

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The Year: ");
        int year=sc.nextInt();
        if((year%4==0)&&(year%100!=0)||(year%400==0))
        {
            System.out.println("LEAP YEAR");
        }
        else
        {
            System.out.println("COMMON YEAR");
        }
    }
}

/*
Output:

Enter The Year: 2020
LEAP YEAR
*/