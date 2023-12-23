// Write a program wich accept a number from user and display its multiple Factors

import java.util.*;

public class multiple_Factors
{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number to check factors : ");
        int num = sc.nextInt();

        Factors fc = new Factors();
        fc.Display_Factors(num);


    }
}

class Factors
{
   void Display_Factors(int num)
   {
       for(int i = 1; i <= num; i++)
       {
         if( num % i == 0)
         {
            System.out.println(i);
         }
       }
   }
}