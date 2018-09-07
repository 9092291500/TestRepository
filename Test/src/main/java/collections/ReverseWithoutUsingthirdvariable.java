package collections;

import java.util.Arrays;

public class ReverseWithoutUsingthirdvariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// {	1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9}; 

		int arr[] = {1, 2, 3, 4, 5, 6, 7};
		
		System.out.println(Arrays.toString(arr));
		
		


		int temp = 0 ; 

		System.out.println(arr.length);

		for(int i = 0;i<=2;i++ ) {                                                                       


			temp = arr[i] ; 
			
			arr[i] = arr[arr.length-i-1] ;
			
			
			arr[arr.length-i-1] = temp ;


		}


		


		
		System.out.println(Arrays.toString(arr));







	}

}
