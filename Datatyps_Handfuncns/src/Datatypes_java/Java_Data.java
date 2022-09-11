package Datatypes_java;

public class Java_Data {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int babuSalary = 90; //Precondition (variable)  
		System.out.println(babuSalary); 
	    /* DAta types: prim - non prim - ref
		prim have 8 types:
		byte
		short
		int
		long
		float
		double
		char
		boolean
		
		Non prim: 
		string
		array
		
		DATA MGMT MECH IN JAVA */
	
		byte x= 2;  // 1 byte of data (8bit)
		short y=4;  // 2 byte of data (16bit)
		int z=10;   // 4 byte of data (32bit)
		long a=98;  // 8 byte of data (64bit)
		float b=21.3f;  // 4 byte of data (32bit)
		float c=21;   // we can use int also
		double d=878; // 8 byte of data (64bit) both int n decimal
		char e='2'; // 2 byte of data (16bit)
		char f='w';
		boolean g=true; // 1 byte of data(8bit)
		boolean h=false;
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		int cup = 45;
		cup = 50;  // LIFO Mechanism 
		System.out.println(cup);
		
		
	}

}
