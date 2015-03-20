package hackerrank.Strings;

import java.util.Scanner;

public class panagrams {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner in = new Scanner(System.in);
	String str= in.nextLine();
	boolean a=isPangram(str);
	if(a==true)
	{
		System.out.println("panagram");
	}
	
	}
	public static boolean isPangram(String test){
        for (char a = 'A'; a <= 'Z'; a++)
            if ((test.indexOf(a) < 0) && (test.indexOf((char)(a + 32)) < 0))
                return false;
        return true;
    }
}