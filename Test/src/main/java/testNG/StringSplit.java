package testNG;

import java.util.Arrays;
import java.util.List;

public class StringSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		String str1 = "1 - 2  Of  2";


		java.util.List<String> list =  Arrays.asList(str1.split(" ")); 		




		for(String a : list)
		{

			System.out.println(a);
		}


		System.out.println(list.get(6));
	}

}
