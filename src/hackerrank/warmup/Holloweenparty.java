package hackerrank.warmup;

import java.util.Scanner;

public class Holloweenparty {
	static int peice;
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int test= in.nextInt();
		for(int i=0;i<test;i++)
		{
			int a=in.nextInt();
			check(a);
			System.out.println(peice);
		}
            
      

	}

	private static  int check(int a) {
		// TODO Auto-generated method stub
int peice;
		if((a%2) == 0)//even
		{
		  peice = (a/2)*(a/2) ;
		}
		else
		{
			int b=a-1;
			peice =a*b;
		}
		return peice ;
	}

}
