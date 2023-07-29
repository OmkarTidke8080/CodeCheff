/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sobj = new Scanner(System.in);
		
		int t = sobj.nextInt();
		
	
		
		while(t-->0)
		{
		   	int x = sobj.nextInt(); // 
		    int m = sobj.nextInt();  //
	    	int d = sobj.nextInt();  // max delay time
	    	
	    	
	    	    System.out.println(Math.min(m*x,x+d));
	    	
		}
		
	}
}
