// Write a java program to check if vowel is present in string ot not

import java.util.*;

public class vowel
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String : ");
        String str = sc.nextLine();

        System.out.println(checkVowel(str));

    }

    public static boolean checkVowel(String str)
    {
       return str.toLowerCase().matches(".*[aeiou].*");
    }
}
