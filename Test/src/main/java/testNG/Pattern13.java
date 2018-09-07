package testNG;

public class Pattern13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*1
		10
		101
		1010
		10101
		101010
		1010101
		 */


		for(int i = 1 ; i <=7 ; i ++){


			for (int j = 1; j < i ; j++ ){


				if(j%2 == 0 ){

					System.out.print("0");
				}

				else {

					System.out.print("1");
				}

			}

			System.out.println();

		}

		System.out.println("PATTERN14PATTERN14PATTERN14PATTERN14PATTERN14PATTERN14PATTERN14PATTERN14PATTERN14");		

		/*1010101
0101010
1010101
0101010
1010101
0101010
1010101
		 */




		for(int i = 1 ; i <=7 ; i ++){


			for (int j = 1; j <=7 ; j++ ){


				if(j%2 == 0 ){

					System.out.print("0");
				}

				else {

					System.out.print("1");
				}

			}

			System.out.println();

		}
		System.out.println("PATTERN14PATTERN14PATTERN14PATTERN14PATTERN14PATTERN14PATTERN14PATTERN14PATTERN14");	

		/*1111111
		1111122
		1111333
		1114444
		1155555
		1666666
		7777777*/

		for(int i = 1 ; i <=7 ; i ++){


			for ( int j = 1 ; j <=7-i ;j++ ){

				System.out.print("1");


			}

			for (int j = 1 ; j <= i ; j++){

				System.out.print(i);
			}
			System.out.println();
		}

	}}
