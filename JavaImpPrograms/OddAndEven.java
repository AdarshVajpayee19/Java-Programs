import java.util.Scanner;

public class OddAndEven {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int number;
        System.out.print("Enter The Number : ");
        number=sc.nextInt();
        if(number%2==0)
        {
            System.out.println("Even Number");
        }
        else
        {
            System.out.println("Odd Number");
        }
    }
}

/*
 Output:

Enter The Number : 35
Odd Number

Enter The Number : 20
Even Number
 */
