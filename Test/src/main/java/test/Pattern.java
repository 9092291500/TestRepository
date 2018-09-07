package test;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*1
		2 3 	 	 	 	
		3 4 5 
		4 5 6 7
		5 6 7 8 9*/

		for(int i = 1 ; i <= 5 ; i++){

			for (int j = 0 ; j <=i ; j++	 ){

				System.out.print(j+i);


			}

			System.out.println();
		}

		/*1
		1 2
		1 2 3
		1 2 3 4
		1 2 3 4 5
		1 2 3 4 5 6
		1 2 3 4 5 6 7


		 */

		System.out.println("************************************************************************");

		for(int i = 1 ; i <= 7 ; i++){

			for (int j = 1 ; j <=i ; j++	 ){

				System.out.print(j);


			}

			System.out.println();


		}

		System.out.println("********************************************************");


		/*1
		2 2
		3 3 3
		4 4 4 4
		5 5 5 5 5
		6 6 6 6 6 6
		7 7 7 7 7 7 7*/

		for(int i = 1 ; i <= 7 ; i++){

			for (int j = 1 ; j <=i ; j++	 ){

				System.out.print(i);


			}

			System.out.println();


		}


		/*1
		1 2
		1 2 3
		1 2 3 4
		1 2 3 4 5
		1 2 3 4 5 6
		1 2 3 4 5 6 7
		1 2 3 4 5 6
		1 2 3 4 5
		1 2 3 4
		1 2 3
		1 2
		1*/

		/*1 2 3 4 5 6
		1 2 3 4 5
		1 2 3 4
		1 2 3
		1 2
		1*/


		System.out.println("************************************************************************************");

		for(int i = 6 ; i >= 1 ; i--){

			for (int j = 1 ; j <=i ; j++	 ){

				System.out.print(j);


			}

			System.out.println();


		}
		System.out.println("************************************************************************************");

		/*7 6 5 4 3 2 1
		7 6 5 4 3 2
		7 6 5 4 3
		7 6 5 4
		7 6 5
		7 6
		7
		 */

		for(int i = 1 ; i <= 7 ; i++){

			for (int j = 7 ; j >=i ; j--	 ){

				System.out.print(j);


			}

			System.out.println();


		}

		System.out.println("???????????????????????????????????????????????????????????????????????");
		/*
		7
		7 6
		7 6 5
		7 6 5 4
		7 6 5 4 3
		7 6 5 4 3 2
		7 6 5 4 3 2 1*/




		/*1
		1 2 1
		1 2 3 2 1
		1 2 3 4 3 2 1
		1 2 3 4 5 4 3 2 1
		1 2 3 4 5 6 5 4 3 2 1
		1 2 3 4 5 6 7 6 5 4 3 2 1*/


		for(int i = 1 ; i <= 7 ; i++){

			for (int j = 1 ; j <=i ; j++	 ){

				System.out.print(j);


			}

			for (int j = i-1 ; j >=1 ; j--	 ){

				System.out.print(j);


			}

			System.out.println();


		}

		System.out.println("???????????????????????????????????????????????????????????????????????");


		/*1
		2 1
		3 2 1
		4 3 2 1
		5 4 3 2 1
		6 5 4 3 2 1
		7 6 5 4 3 2 1*/

		for(int i = 1 ; i <= 7 ; i++){

			for (int j = i ; j >=1 ; j--	 ){

				System.out.print(j);


			}

			System.out.println();


		}

		/*
		1
		2 2
		3 3 3
		4 4 4 4
		5 5 5 5 5
		6 6 6 6 6 6
		7 7 7 7 7 7 7*/

		for(int i = 1 ; i <= 7 ; i++){

			for (int j = i ; j >=1 ; j--	 ){

				System.out.print(i);


			}

			System.out.println();


		}

		System.out.println("<><><><><><><><>>>><><><><><><><><><><><><>");

		/*1234567
		 234567
		  34567
		   4567
		    567
		     67
		      7*/
		System.out.println("SPACESPACESPACESPACESPACESPACESPACESPACESPACESPACESPACESPACESPACE");

		for(int i = 1 ; i <= 7 ; i++){




			for (int j = 1 ; j <i ; j++	 ){

				System.out.print(" ");


			}

			for (int j = i ; j <= 7 ; j++	 ){

				System.out.print(j+" ");


			}

			System.out.println();

		}

		for(int i = 6 ; i >=1 ; i--){




			for (int j = 1 ; j <i ; j++	 ){

				System.out.print("S");


			}

			for (int j = i ; j <= 7 ; j++	 ){

				System.out.print(j+" ");


			}

			System.out.println();

		}



		/*1 2 3 4 5 6 7
		 2 3 4 5 6 7
		  3 4 5 6 7
		   4 5 6 7
		    5 6 7
		     6 7
		      7
		     6 7
		    5 6 7
		   4 5 6 7
		  3 4 5 6 7
		 2 3 4 5 6 7
		1 2 3 4 5 6 7
		 */


	}

}
