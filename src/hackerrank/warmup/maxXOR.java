package hackerrank.warmup;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class maxXOR {
/*
 * question Given two integers, L and R,
 *  find the maximal values of A xor B,
 *   where A and B satisfy the following condition:
     A and B is between or equal to L and R
 * Complete the function below.
 */

    static int Xor(int l, int r) {
    int max=0;
    	for(int i=l;i<=r;i++)
    	{
    		for(int j=l;j<=r;j++)
    		{
    		 int result =  (i ^ j);
    		 if(result>max)
    		 {
    			 max=result;
    		 }
    	}
    	}
		return  max;


    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res;
        int _l;
        _l = Integer.parseInt(in.nextLine());
        
        int _r;
        _r = Integer.parseInt(in.nextLine());
        
        res = Xor(_l, _r);
        System.out.println(res);
        
    }
}
//SOLVED