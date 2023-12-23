import java.util.*;

public class sum_of_NonFactors {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number for summation of factors : ");
        int num = sc.nextInt();

        sum_Factors sf = new sum_Factors();
        sf.Summation_Non_Factors(num);
    }
}

class sum_Factors
{
   void Summation_Non_Factors(int num)
   {
       int sum = 0;

      for(int i = 1; i <= num; i++)
      {
          if(num % i != 0)
          {
            sum = sum   + i;
          }
      }

      System.out.println("The sum is : "+sum);
   }
}