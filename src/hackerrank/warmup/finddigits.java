package hackerrank.warmup;

import java.util.Scanner;

public class finddigits {
static int count=0;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner in=new Scanner(System.in);
     int test= in.nextInt();
     for(int i=0;i<test;i++)
     {
    	 int a=in.nextInt();
    	 compute(a);
    			 
     }
	}

	private static void compute(int a1) {
		// TODO Auto-generated method stub
	  	int temp =0;
	  	temp=a1%10;
	  	if(a1/temp==0)
	  	{
	  		count++;
	  	}
	  	
	}

}
