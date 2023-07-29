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
	   
	   int t = sc.nextInt();
	   
	   while(t--> 0)
	   {
	       int n = sc.nextInt(); // number of items
	       int x = sc.nextInt(); // minimum freshness value
	       int total = 0;
	       
	       // Array of freshness value;
	       int A[] = new int[n];
	       
	       // Array of cost of each item
	       int B[] = new int[n];
	       
	       for(int i = 0; i < n; i++)
	       {
	           A[i] = sc.nextInt();
	       }
	       
	       for(int j = 0; j < n; j++)
	       {
	           B[j] = sc.nextInt();
	       }
	       
	         for(int k=0; k<n; k++)
		    {
		        if(A[k]>=x)
		        
		            total += B[k];
		    }
		    System.out.println(total);
	       
	       
	       
	       
	   }
	}
}
