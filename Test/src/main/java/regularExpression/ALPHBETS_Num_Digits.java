package regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ALPHBETS_Num_Digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String password = "$$ Welcome to 1st Automation Interview $$" ;
		
		System.out.println(password.charAt(5));

		int lettercount = 0 , digitcount = 0 ,  specialcount = 0 ; 

		Pattern letter = Pattern.compile("[a-zA-z]");
		Pattern digit = Pattern.compile("[0-9]");
		Pattern special = Pattern.compile ("[!@#$%&*()_+=|<>?{}\\[\\]~-]");
		//Pattern eight = Pattern.compile (".{8}");


		Matcher hasLetter = letter.matcher(password);
		Matcher hasDigit = digit.matcher(password);
		Matcher hasSpecial = special.matcher(password);


		for (int i = 0 ;password.length()<i ; i++) {

			if(hasLetter.find(password.charAt(i))) {

				lettercount++  ;
			}
		}

		System.out.println(lettercount);

		/*while  ( hasLetter.find()) {
			lettercount++  ; 



		} System.out.println(lettercount);

		while (hasDigit.find()) {
			digitcount++ ; 
			System.out.println(hasDigit.group());
		} 
		System.out.println(digitcount);

		while ( hasSpecial.find())  {
			System.out.println(hasSpecial.group());

			specialcount++;
		}System.out.println(specialcount);
		 */


	} 





} 


