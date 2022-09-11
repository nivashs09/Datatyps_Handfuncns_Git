package Handling_funcn_overlad;

/*
 INTEGER CALL
  public class Handling_Try {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main prog");
	}
	public static void dologin() {
		System.out.println("login prog");

	}
	public static void doproc() {
		System.out.println("work to do");
		dologin();
	}
	public static void dologout() {
	}
	
} */
//STRING METHOD
 public class Handling_Try {
 	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main prog");
		dologin();
		dologout("ab","cd");
	}
	public static void dologin() {
				int x=2;
		int y=3;
		int z=x+y;
		System.out.println(z);
	}
	public static void doproc() {
		System.out.println("work to do");
		dologin();
	}
	public static void dologout(String ab, String cd) {
		String fullname = ab+cd;
		System.out.println(fullname);
	}
}   

/*  INTEGER IN DIFFERENT METHOD
  public class Handling_Try {
 	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main prog");
		int z = dologin(2,9);
		System.out.println(z);
		dologout("cd","ef");
	}
	public static int dologin(int x, int y) {
			int z=x+y;
			return z;
		//System.out.println(z);
	}
	public static void doproc() {
		System.out.println("work to do");
		dologin(2,3);
	}
	public static void dologout(String ab, String cd) {
		String fullname = ab+cd;
		System.out.println(fullname);
	}
  }
*/
 /*public class Handling_Try {
 	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main prog");
		int z = dologin(2,9);
		int i = z+1;
		System.out.println(i);
		dologout("gg","dff");
		
	}
	public static int dologin(int x, int y) {
			int z=x+y;
			return z;
		//System.out.println(z);
	}
	public static void doproc() {
		System.out.println("work to do");
		dologin(2,3);
	}
	public static void dologout(String ab, String cd) {
		String fullname = "ab"+"ede";
		System.out.println(fullname);
	}
  } */