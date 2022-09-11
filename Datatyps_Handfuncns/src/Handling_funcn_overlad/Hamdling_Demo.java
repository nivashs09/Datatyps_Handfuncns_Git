package Handling_funcn_overlad;

public class Hamdling_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main prog");
		int z = dologin(10,50);
		int i = z + 21;
		System.out.println(i);
		//doprocess();
		dologout();
		}
	public static int dologin(	int x, int y){
		int z=x+y;
		return z;
		//System.out.println(z);
		}
	public static void dologin( ){
		System.out.println("some work");
		dologout();
	}
	public static void dologout( ){
		System.out.println("logout func");
		
	}

}
	