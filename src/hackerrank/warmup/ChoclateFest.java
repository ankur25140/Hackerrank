// Little Bob loves chocolate, and he goes to a store with $N in his pocket.
//The price of each chocolate is $C. The store offers a discount:
//	for every M wrappers he gives to the store, he gets one chocolate for free.
//	How many chocolates does Bob get to eat?
package hackerrank.warmup;

import java.util.Scanner;

public class ChoclateFest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner in =new Scanner(System.in);
      int T = in.nextInt();
      for(int i=0;i<T;i++)
      {
    	  System.out.println(Solve(in.nextInt(),in.nextInt(),in.nextInt()));
      }
	}


	private static long Solve(int N, int C, int M){
		int Choclate = 0 ;
	    int mod=N%C;int Count=0;
	    int tempChoclate = 0;
		if((mod)==0)
		{
			Choclate=N/C;
			if(M<=Choclate)    
			{  
                tempChoclate=Choclate / M ;
               int random=Choclate%M;
                if(random+tempChoclate>=M)
                    {
                    tempChoclate=tempChoclate+random ;
                }
				                
			}
			Choclate=Choclate+tempChoclate;
		}
			return Choclate;
        
        //Write code to solve each of the test over here
   }  
   
}

//SOLVED