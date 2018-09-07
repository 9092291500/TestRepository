package test;

public class DivisionModulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		/*
		1
		10
		101
		1010
		10101
		101010
		1010101*/

		/*1111111
		1111122
		1111333
		1114444
		1155555
		1666666
		7777777*/




		/*0000000
		0100000
		0020000
		0003000
		0000400
		0000050
		0000006*/



		int row = 7 ;

		for (int i = 1 ; i<=row ; i++ ){


			for(int j = 1 ; j <= row-i ; j++ ){

				System.out.print(1);

			}

			for (int j = 1; j <= i; j++)
			{
				System.out.print(i);
			}

			System.out.println();

		}


	}

}
