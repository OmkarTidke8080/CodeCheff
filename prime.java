// write a program to check whether the given number is prime of not

import java.util.*;
public class prime 
{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number : ");
        int n = sc.nextInt();

        System.out.println(isPrime(n));
    }
    public static boolean isPrime(int n)
    {
        if(( n == 0) || (n == 1))
        {
            return false;
        }
        if(n == 2)
        {
            return true;
        }
        for(int i = 2 ; i <= n / 2; i++)
        {
            if(n % i == 0)
            {
                return false;
            }
        }
        return true;
    }
}
