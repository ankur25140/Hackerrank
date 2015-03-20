package hackerrank.Strings;

import java.util.*;

public class palindrome {
	static String s;
	 public static void main(String[] args) {
	 
	 Scanner in = new Scanner(System.in);
	 int i=in.nextInt();
	 
	 s=in.nextLine();
	 if (chkpalindrom(s)==false)
	 {
		 
	 }
	 else 
		 System.out.println("-1");	 
	 }
	private static boolean chkpalindrom(String s) {
		// TODO Auto-generated method stub
		
		String S=s.reverse();
		System.out.println(“Given String is:”+s2);
		System.out.println(“Reverse String is”+s1);
		if(String.valueOf(s1).compareTo(String.valueOf(s2))==0)
		return false;
	}	 
}