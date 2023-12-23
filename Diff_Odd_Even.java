import java.util.*;


public class Diff_Odd_Even {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number : ");
        int num = sc.nextInt();

        odd_even_diff ov = new odd_even_diff();

        ov.difference(num);
    }
}

class odd_even_diff
{
   void difference(int num)
   {
       int even_Count = 0;
       int odd_Count = 0;
       int Difference = 0;

       while(num != 0)
       {
         int digit = num % 10;

         if(digit % 2 == 0)
         {
            even_Count++;
         }
         else
         {
           odd_Count++;
         }

         num = num / 10;
       }

       System.out.println("Number of even digits : "+even_Count);
       System.out.println("Number of odd digits : "+odd_Count);

       Difference = even_Count - odd_Count;

       System.out.println("The difference is : "+Difference);

   }
}