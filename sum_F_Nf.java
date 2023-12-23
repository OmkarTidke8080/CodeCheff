// Write a program which accept  number from user and display difference bwetween summation of factors and non factors


import java.util.*;

public class sum_F_Nf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number : ");
        int num = sc.nextInt();


        Factors fc = new Factors();
        fc.Diff_F_Nf(num);
    }
}

class Factors
{
    void Diff_F_Nf(int num)
    {
        int diff = 0;
        int sum_factors = 0;
        int sum_NonFactors = 0;

        for(int i = 1; i <= num; i++)
        {
            if(num % i == 0)
            {
                sum_factors = sum_factors + i;
            }
            else
            {
                sum_NonFactors = sum_NonFactors + i;
            }
        }

        diff = sum_NonFactors - sum_factors;

        System.out.println("The Difference is : "+diff);
        
    }
}