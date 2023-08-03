/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner read =new Scanner(System.in);
		int t=read.nextInt();
		for(int i=0;i<t;i++)
		{
		    int n=read.nextInt();
		    String s=read.next();
		    int c=0;
		    for(int j=0;j<n-1;j++)
		    {
		        if(s.charAt(j)==s.charAt(j+1))
		        c++;
		    }
		    System.out.println(c);
		}
	}
}
