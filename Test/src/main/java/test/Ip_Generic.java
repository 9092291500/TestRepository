package test;

import java.util.Arrays;

public class Ip_Generic {
	

	static String ip(String ip)

    {
		
		
		
		String str1 = ip; 

		String[] d =	str1.split("[.]");



		//System.out.println(d);

		String s = Arrays.toString(d);

		//System.out.println(s);


		String pattern = "";
		boolean b1 = true;

		java.util.List<String> list =  Arrays.asList(str1.split("[.]"));


		//System.out.println(list.size()) ;




		if(list.size() ==4){


			for (int i = 0 ; i <=list.size()-1  ; i++) {

				String word = list.get(i);


				boolean b =	word.matches("(.*)[A-Za-z](.*)");



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



			if(s.equals(s1)){
				
				
				System.out.println(ip +"...." + "Given ip address is valid ");
			}

		}

		else {

			System.out.println(ip +"..... " +"Invalid");
		}


		return ip;
		


    }





	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ip("750000.12.123.123123.123");
		ip("000.12.12.034");
		ip("122.23");
		ip("Hello.IP");
		ip("XXYYZZ");
		ip("SATIZ");

	}

}
