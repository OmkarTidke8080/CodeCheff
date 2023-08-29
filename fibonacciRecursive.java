//// Write a java program to print a fibonacci sequence  using recursion

import java.util.*;

public class fibonacciRecursive 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number : ");
        int seqlength = sc.nextInt();

        System.out.println("A fibonacci sequence of "+seqlength+"number");

        for(int i = 0; i < seqlength; i++)
        {
            System.out.println(fibonacci(i) +" " );
        }
    }

    public static int fibonacci(int count)
    {
        if(count <= 1)
        {
            return count;
        }

        return fibonacci(count -1) + fibonacci( count - 2);
    }

}
