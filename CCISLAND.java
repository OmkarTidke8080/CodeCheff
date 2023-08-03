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
		    int x = sc.nextInt();  // units of food supply
		    int y = sc.nextInt();  // units of water supply
		    int x1 = sc.nextInt();  // required food units
		    int y1 = sc.nextInt();  // reauired water
		    int D = sc.nextInt();  // no. of days
		    
		    double a = x/x1;
		    double b = y/y1;
		    
		    double c = Math.min(a,b);
		    
		    if(c >= D)
		    {
		        System.out.println("YES");
		    }
		    else
		    {
		        System.out.println("NO");
		    }
		}
	}
}
