package logic_program;

import java.util.Arrays;

public class Print_Matrix_Spiral_2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		String[][] mat = new String[4][5]; // yes it's valid

		mat[0][0] = "a" ;  mat[0][1] = "b" ; mat[0][2] = "c" ; mat[0][3] = "d" ;  mat[0][4] = "e" ; 

		mat[1][0] = "f" ;  mat[1][1] = "g" ; mat[1][2] = "h" ; mat[1][3] = "i" ;  mat[1][4] = "j" ; 

		mat[2][0] = "u" ;  mat[2][1] = "v" ; mat[2][2] = "m" ; mat[2][3] = "n" ;  mat[2][4] = "o" ; 

		mat[3][0] = "p" ;  mat[3][1] = "q" ; mat[3][2] = "r" ; mat[3][3] = "s" ;  mat[3][4] = "t" ; 

		System.out.println(Arrays.deepToString(mat));

		//	System.out.println(java.util.Arrays.toString(mat));


		int row = 4 , column = 5 , i, k = 0 , l = 0 ;


		int lastRow = row-1 , lastColumn = column-1 ; 
		
		
		for (int i1 = l ; i1<=lastColumn ; i1++) {

			System.out.print(mat[k][i1]);

		

	}
	
	
	for (i=1 ; i<=lastRow; i++){
		
		System.out.print(mat[i][lastColumn]);
	}
	
	//k++;


/*
		while(k<=lastRow && l<=lastColumn){

			




	}
*/

	

	
	
	
	





}}
