package hackerrank.warmup;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Utopiantree {
static int length=1;
	/**
	 * @param args
	 */
static int N;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		//System.out.println("enter the number of test cases between 1 to 10 ");
       int T=in.nextInt();
       int [] N = new int[T];
       for(int i=0;i<T;i++)
     {
            N[i]=in.nextInt();
     }
     for(int i=0;i<T;i++)
     {	 
        int x=N[i];
        length=1;
    	 while(x>0)
      {
    	  String a = chkforevenodd();
    	  if( a.equals("odd"))
    	  {length=2*length;
  		x--;
  	  
    	  }
    	  else
    	  {

   		   length=length+1;
   		   x--;
    		}
      }
           System.out.println(+length);
	}
	}
	private static String chkforevenodd() {
		// TODO Auto-generated method stub
		String r;
		if ( N % 2 == 0 )
		{
			 r="even";
		}else
		{   r="odd";
		}
		return r;
	}

}