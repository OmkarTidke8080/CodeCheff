// Write a java program to print a fibonacci sequence without using recursion

import java.util.Scanner;

public class fibonacci 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printFibonacci(n);
    }
    public static void printFibonacci(int n)
    {
        int a = 0;
        int b = 1;
        int c = 1;

        for(int i = 1; i <= n ; i++)
        {
            System.out.println(a);
            a = b;
            b = c;
            c = a + b;
        }
    }
}
