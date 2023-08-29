// Write a program to swap two numbers without using third variable

import java.util.*;

public class Swap
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     
    System.out.println("ENter First number : ");
    int a = sc.nextInt();

    System.out.println("Enter Second number : ");
    int b = sc.nextInt();

    swapNumbers(a, b);
    }
    
    public static void swapNumbers(int a , int b)
    {
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Number after swapping are : a =  "+a+"\n b = "+b);
    }
}
