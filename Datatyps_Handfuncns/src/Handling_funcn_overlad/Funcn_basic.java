//NIVASH OVERALL FUNCTION OVERLOADING PRACTICE IN DIFF WAY
package Handling_funcn_overlad;

/* public class Funcn_basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main pgm");
	}
	public static void dologin() {
		System.out.println("enter");
	}
	public static void doproc() {
		System.out.println("something");
	}
	public static void dologout() {
		System.out.println("exit");
	}
}

Output:
Main pgm
*******************************
package Handling_funcn_overlad;

public class Funcn_basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main pgm");
		dologin();
		doproc();
		dologout();
	}
	public static void dologin() {
		System.out.println("enter");
	}
	public static void doproc() {
		System.out.println("something");
	}
	public static void dologout() {
		System.out.println("exit");
	}

}

Output:
Main pgm
enter
something
exit
*******************************
package Handling_funcn_overlad;

public class Funcn_basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main pgm");
		dologin();
		doproc();	
	}
	public static void dologin() {
		int x=2;
		int y=3;
		int z=x+y;
		System.out.println(z);
	}
	public static void doproc() {
		String a="abc";
		String b="def";
		String c=a+b;
		System.out.println(c);
	}
	public static void dologout() {
		System.out.println("exit");
	}

}
OUTPUT:
Main pgm
5
abcdef
********************************
public class Funcn_basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main pgm");
		dologin(2,5);
		doproc();	
	}
	public static void dologin(int x,int y) {
		int z=x+y;
		System.out.println(z);
	}
	public static void doproc() {
		String a="abc";
		String b="def";
		String c=a+b;
		System.out.println(c);
	}
	public static void dologout() {
		System.out.println("exit");
	}

}
OUTPUT:
Main pgm
7
abcdef
************************************ */ 
public class Funcn_basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main pgm");
		int z = dologin(2,6);
		int i=z+1;
		System.out.println(i);
		doproc();	
	}
	public static int dologin(int x,int y) {
		int z=x+y;
		return z;
		//System.out.println(z);
	}
	public static void doproc() {
		String a="abc";
		String b="def";
		String c=a+b;
		System.out.println(c);
	}
	public static void dologout() {
		System.out.println("exit");
	}

}
