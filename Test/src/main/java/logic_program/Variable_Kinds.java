package logic_program;

//class level variable  , method level vriable

//Primitive Data types
//Boolean , int , long , short , byte - Integer , Floating- Point - double , float , Character - char  

public class Variable_Kinds {

	int a = 5; // Class Level Variable or Instance Variable

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Variable_Kinds v = new Variable_Kinds();

		//	v.add();

		//primitivesFloat();
		pimitiveChar();

	}

	public void add() {

		int b = 55; // method level variable or local variable

		byte by = -128; // 8 bits

		short sh = -32768; // 16 bits
		int i = 1_23_456; // (java 7 )

		System.out.println(i);

	}


	static void primitivesInteger() {

		int intHex = 0X0041 ;
		System.out.println(intHex);
		int intBinary = 0B00111 ;
		System.out.println(intBinary);


	}

	static void primitivesFloat() {

		//float = 32 
		//double = 64 


		float f = 1234.5F ; //Must end with F or f 

		double d = 1234568.9 ; 


	}
	
	
	static void pimitiveChar() {

		//16 bit 
		
		char c = 65 ;
		
		System.out.println(c);
		
		char d = 'A'  ; 
		
		System.out.println(d);
		
		



	}

}