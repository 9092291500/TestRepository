package regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*000.12.12.034
		121.234.12.12	
		23.45.12.56
		00.12.123.123123.123
		122.23
		Hello.IP
		 */

		int count = 0 ;

		Pattern p = Pattern.compile("a?");

		Matcher m = p.matcher("sasasasasasaaaaaa!!!!!!!!!!");
		

		while (m.find()){

			count++ ;
			
			//System.out.println(m.group());

			System.out.println(m.start() + "@@@@@@"+ m.end()+""+ m.group() );
		}
		System.out.println("@@@@@@@@@@@@@@       " + count);
		
		
		
	}

	
}
