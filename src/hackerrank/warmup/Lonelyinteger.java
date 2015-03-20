package hackerrank.warmup;

import java.util.Scanner;

public class Lonelyinteger {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int lonelynumber=0;
		 int Size;
		
		Scanner in = new Scanner(System.in);
        Size = Integer.parseInt(in.nextLine());
        int [] a = new int[Size];
    for(int i=0;i<Size;i++)
        {
        	a[i]= in.nextInt();
        }
    for(int i=0;i<Size;i++)
    {
    	for (int j=i+1;j<Size;j++)
    	{
         if(!(a[i]==a[j]))
         {
        	 lonelynumber=a[i];
         }
        	 
    	}
    }

       
    System.out.println(lonelynumber);
		
	}

}
