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
		
		while(t-->0)
		{
		    	int s1 = 0;
	        	int s2 = 0;
		    int n = sc.nextInt();
		    while(n-->0)
		    {
		     String str = sc.next();
		    
		    if(str.equals("START38"))
		    {
		        s1++;
		    }
		    else 
		    {
		        s2++;
		    }

		    }
		       System.out.println(s1+" "+s2);

		}

	}
}
