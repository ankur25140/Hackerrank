package hackerrank.warmup;

import java.util.Arrays;
import java.util.Scanner;

public class CuttheStick {
	static int size;
	static int smallest=0;
	static int[] a;
	static int[] b;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner in = new Scanner(System.in);   
   int size=in.nextInt();
   int[] a=new int[size];
   int[] b=new int[size];
   for(int i=0;i<size;i++)
   {
	   a[i]=in.nextInt();
   }
    Smallest(a);
    subtract(smallest);
    System.out.println(Arrays.toString(b));
	}

	private static int[] subtract(int smallest2) {
		// TODO Auto-generated method stub
		for(int i=0;i<size;i++)
		{
			int random=(a[i]-smallest2);
			if(random>0)
			{
				b[i]=random;
			}
		}
		return b;
	}

	private static  int Smallest(int[] a) {
		// TODO Auto-generated method stub
		
	    for(int i=0;i<=size;i++)
	    {
	    	if (a[i] > smallest) {
                smallest = a[i];
            }
	    }
	return smallest;
	}

}
