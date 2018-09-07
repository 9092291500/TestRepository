package collections;

import java.util.Arrays;
import java.util.Iterator;

public class Reverse_using_LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "AWESOME";
		
		String[] c = str.split("");
		System.out.println(Arrays.asList(c));
		
		java.util.LinkedList<String> obj = new java.util.LinkedList<String>(Arrays.asList(c));
		
		Iterator<String> x  =	obj.descendingIterator();

		 while (x.hasNext()) {
	         System.out.print(x.next());
	      }



	}

}
