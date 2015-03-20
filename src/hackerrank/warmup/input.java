package hackerrank.warmup;

import java.util.Scanner ;
abstract class  input {
  static int test;
int a;
int b;
static Scanner in;
/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		test();
   singleinput(test);
   twoinput(test);
	}

	protected static void twoinput(int test) {
		// TODO Auto-generated method stub
		for(int i=0;i<test;i++)
		{ 
			
		
		int a=in.nextInt();
		int b=in.nextInt();
		
		}
	}

	protected static void singleinput(int test) {
		// TODO Auto-generated method stub
		int a=in.nextInt();
	}

	protected static  int test() {
		// TODO Auto-generated method stub

		int test=in.nextInt();
		return test;
	}

}
