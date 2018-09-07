package test;

import java.util.Arrays;

public class Reversethesentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "I am  a  Badman"; 
		//o/p : drow ma dab

		String reverseString = "";



		String[] words  = str.split(" ");
		System.out.println(words);

		int arraylength = 	words.length ; 


		for(int i = 0 ; i <arraylength  ; i++ ){

			String word = words[i] ; 


			String reverseWord = "";

			for( int j = word.length()-1;j >= 0  ; j--){



				reverseWord = reverseWord + word.charAt(j);
				System.out.println(reverseWord);


			}
			reverseString = reverseString + reverseWord + " " ;
			System.out.println(reverseString);

		}

		System.out.println(reverseString);


		System.out.println("***********************************************************************");

		String str1 = "I am Badman"; 

		java.util.List<String> list =  Arrays.asList(str1.split(" "));
		System.out.println(list);

		System.out.println(list.size()) ; 

		for(int i = 0 ; i< 3 ; i++){
			String word = list.get(i); 



			for( int j = word.length()-1;j >= 0  ; j--){



				System.out.print(word.charAt(j)+ " ");


			}



		}










	}

}
