package logic_program;

import java.util.Arrays;
import java.util.HashSet;

public class MissingAlphabets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String userInput = "A" ; 
		
userInput = userInput.replaceAll(" ", "");

String[] inputArray = userInput.split("");

String[] alphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".split("");
		
HashSet<String> s1 = new HashSet<String>(Arrays.asList(inputArray));


HashSet<String> s2 = new HashSet<String>(Arrays.asList(alphabets));

System.out.println(s2);

s2.removeAll(s1);

System.out.println(s2);

		

	}

}
