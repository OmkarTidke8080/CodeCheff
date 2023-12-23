// Write a program which accept number from user and return the count of odd digits.

import java.util.*;

public class coun_odd_digits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number : ");
        int num = sc.nextInt();

        odd_digits od = new odd_digits();
        od.Count_Digits(num);

    }
}

class odd_digits
{
    void Count_Digits(int num)
    {
        int iCnt = 0;

        while(num != 0)
        {
            int digit = num % 10;

            if(digit % 2 != 0)
            {
                iCnt++;
            }

            num = num / 10;
        }

        System.out.println("The odd digits are : "+iCnt);
    }
}