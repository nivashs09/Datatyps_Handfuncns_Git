package Handling_funcn_overlad;
public class Handl_Func {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main prog");
		//int z= dologin(10,40);
		//int i = z + 21;
		//System.out.println(i);
		//System.out.println(z);
		//dologin(23,40);
		//doprocess(20, 200, 20);
		//dologout("nivash", "s");
		String sa = dologout("abc","def");
		System.out.println(sa);
		}
	public static int dologin (int x,int y){   //parameters, 
		//public static void dologin(){
		//doprocess(5,5,5);
		int z=x+y;
		return z;
		//System.out.println(z);
		}
	public static void doprocess(int i, int j, int k){
		int l=i+j+k;
		System.out.println(l);
	}
	//public static void dologout(String firstname, String lastname){
	public static String dologout(String firstname, String lastname){
	String fullname = firstname+lastname;
	return fullname;
	//System.out.println(fullname);
	//System.out.println("logout func");
	}	
}