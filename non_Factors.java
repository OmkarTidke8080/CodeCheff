import java.util.*;


public class non_Factors {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("ENter number to display nin factors : ");
        int num = sc.nextInt();

        Non_Factors nfc = new Non_Factors();
        
        nfc.Factors(num);
    }
}

class Non_Factors
{
   void Factors(int num)
   {
      for(int i = 1; i <= num; i++)
      {
        if(num % i != 0)
        {
            System.out.println(i);
        }
      }
   }
}