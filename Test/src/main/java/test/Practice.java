package test;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		String str = "Student";

		int l = str.length();
		System.out.println(l);

		for(int i = 0 ; i < l ; i++){

			for (int j = 0 ; j < i+1 ; j++	 ){

				System.out.print(str.charAt(i));


			}

			System.out.println();
		}
		
		for(int i = l-1 ; i > 0 ; i--){

			for (int j = 1 ; j <= i+1 ; j++	 ){

				System.out.print(str.charAt(i));


			}

			System.out.println();
		}




		/*int x = 1;
        for(int y = 0, z = 4; x < 10 && y < 10; x++, y++) 
        {
            System.out.println(y + " ");
        }

        System.out.println(x);

        for( ; ; )
        {
            System.out.println("This is an infinite loop");
        }*/
	}

}
