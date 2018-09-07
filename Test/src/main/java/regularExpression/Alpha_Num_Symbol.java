package regularExpression;

public class Alpha_Num_Symbol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int Lowerletter = 0;
		int Upperletter = 0;
		int space = 0;
		int num = 0;
		int special = 0 ; 


		String X = "i Am Bad      1!!!!!!!!!!!!!!!!1  ";

		char[] ch = X.toCharArray();


		for ( int i = 0 ;i< X.length() ; i++){

			if(Character.isLowerCase(ch[i]))


			{System.out.print(ch[i]);
			Lowerletter++ ;

			} else if (Character.isUpperCase(ch[i])){
				Upperletter++ ;

			}
			else if(Character.isSpaceChar(ch[i])){
				space ++ ;
			}			




			//System.out.println("other: " + other);

		}
		System.out.println("Lower: " + Lowerletter);
		System.out.println("Upper: " + Upperletter);

		System.out.println("space: " + space);
		System.out.println("number: " + num);
		System.out.println(special);
	}

}
