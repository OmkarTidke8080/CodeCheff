// Write a program to reverse a string in java

import java.util.*;

public class reverseString
{
   public static void main(String[] args) {
    
    String str = "Omkar";


      System.out.println(reverse(str));
   }

   public static String reverse(String str)
   {
      if(str == null)
      {
         System.out.println("String not found exception...");
      }

      StringBuilder out = new StringBuilder();

      char[] chars = str.toCharArray();

      for(int i = chars.length - 1; i >= 0; i--)
      {
        out.append(chars[i]);
      }
      
      return out.toString();
   }
}