package hackerrank.warmup;

import java.util.Scanner;

public class SherlockandSquares {
    static int a,b,Count;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int test=in.nextInt();
	for(int i=0;i<test;i++)
		{ 
		int a=in.nextInt();
		int b=in.nextInt();
		Count=0;
		check( a, b);
		System.out.println(Count);
	}
	}

	private static  int check(int a, int b) {
		// TODO Auto-generated method stub
		for(int i=a;i<=b;i++)
		{
			double value=   Math.sqrt(i);
			if(value == (int) value)
				Count++;
		}
	return Count;
	}

}
//partially solved 