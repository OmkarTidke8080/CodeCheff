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
		    int x = sc.nextInt();
		    
		    if(x % 4 == 1 )
		    {
		        System.out.println("east");
		    }
		    else if(x % 4 == 2 )
		    {
		        System.out.println("south");
		    }
		    else if( x%4 == 3 )
		    {
		        System.out.println("west");
		    }
		    else
		    {
		     System.out.println("north");
		    }
		}
	}
}
