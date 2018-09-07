package test;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Duplicate_Words {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*Goodbye bye bye world world world - Goodbye bye world
		Sam went went to to to his business - Sam went to his business
		Reya is is the the best player in eye eye game - Reya is the best player in eye game
		in inthe - in inthe
		Hello hello Ab aB - Hello Ab*/
		
		
		/*String regex = "\\b(\\w+)(\\W+\\1\\b)+";
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
		
        Matcher m = p.matcher(null);
        */
        
        
        String str = "Reya is is the the best player in eye eye game" ;
        
        LinkedHashSet<String> hs = new LinkedHashSet<String>(Arrays.asList(str.split(" ")));
        
        System.out.println(hs);
        
       
		
	}

}
