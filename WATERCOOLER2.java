/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		

		int T = sc.nextInt();
		while(T-->0){
		 
		 long X = sc.nextLong();
		 long Y = sc.nextLong();
		 
		 if(Y%X!=0){
		     System.out.println(Y/X);
		 }
		 else{
		     System.out.println((Y/X)-1);
		 }
		    
		}
	}
}
