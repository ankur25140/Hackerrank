package hackerrank.sort;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

@SuppressWarnings("serial")
public class insertionsort extends Exception {
    
    

    public static void insertIntoSorted(int[] ar) {
        // Fill up this function  
    	int temp=ar[ar.length-1];
    	
    for(int i=ar.length-1;i<=0;i--)
    {
    	if(ar[i]>temp)
    	{
    		ar[i+1]=ar[i];
    	}
    	else ar[i]=temp;
       printArray(ar);
    }
    }
    
    
/* Tail starts here */
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
         for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
         }
         insertIntoSorted(ar);
    }
    
    
    private static void printArray(int[] ar) {
    	
      for(int n: ar){
         System.out.print(n+" ");
      }
        System.out.println("");
   }
    
    
}
