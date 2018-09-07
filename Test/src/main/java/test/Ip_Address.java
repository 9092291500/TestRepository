package test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Ip_Address {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//		IP address is a string in the form "A.B.C.D", where the value of 
		//		A, B, C, and D may range from 0 to 255. Leading zeros are allowed. 
		//		The length of A, B, C, or D can't be greater than 3.

		/*000.12.12.034
		121.234.12.12
		23.45.12.56
		00.12.123.123123.123
		122.23
		Hello.IP
		 */




		String str1 = "122.23"; 

		String[] d =	str1.split("[.]");



		//System.out.println(d);

		String s = Arrays.toString(d);

		System.out.println(s);


		String pattern = "";
		boolean b1 = true;

		java.util.List<String> list =  Arrays.asList(str1.split("[.]"));


		System.out.println(list.size()) ;




		if(list.size() ==4){


			for (int i = 0 ; i <= list.size()-1  ; i++) {

				String word = list.get(i);


				boolean b =	word.matches("(.*)[A-Za-z](.*)");
				System.out.println(b + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");


				try {
					int number  = Integer.parseInt(word);

					if( (number >=0 && number <=255) &&(word.length()<=3)&& (b!= b1)){

						pattern = pattern+word+".";

					}else {

						System.out.println("invalid");


						break ;
					}
				} catch (NumberFormatException e) {
					// TODO Auto-generated catch block
					System.out.println("Given ip Consists of Variable");
				}


			}



			String[] c =  	pattern.split("[.]");

			String s1 = Arrays.toString(c);



			System.out.println(s.equals(s1));

		}

		else {

			System.out.println("Not a valid");
		}



	}}