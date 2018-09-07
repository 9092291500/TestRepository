package test;

import java.util.Arrays;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "I AM JAVA ENGINEER" ; 
		
		java.util.List<String> ls =  Arrays.asList(str.split(" ")); 
		
		for (int i = 3 ; i >=0 ; i--){
			
			
			String str1 = ls.get(i);
			
			System.out.print(str1 + " * ");
			
			
		}
		
		

		String com = "j" ; 
		String com1 = "a" ;
		
		System.out.println(com.compareTo(com1)) ; 
		

	}

}
