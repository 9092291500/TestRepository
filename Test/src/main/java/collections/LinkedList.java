package collections;

import java.util.Iterator;

import com.graphbuilder.struc.LinkedList.Node;

public class LinkedList  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Node dsd = new Node();
		java.util.LinkedList<Integer> obj = new java.util.LinkedList<Integer>();



		
		obj.add(123);
		obj.add(123);
		

		obj.add(2);
		obj.add(2);
		obj.addFirst(878);
		obj.addLast(1000);
		
		System.out.println(obj);
	Iterator<Integer> x  =	obj.descendingIterator();

	 while (x.hasNext()) {
         System.out.println(x.next());
      }

		



		for (int i = 0 ; i <obj.size()  ; i++ ){


			System.out.println(i + " "+ "index of " + obj.get(i));



		}

		



	}

}
