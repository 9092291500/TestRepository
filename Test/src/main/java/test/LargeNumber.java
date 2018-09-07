package test;

public class LargeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String digit = "5";
	
		
		int number = 4454 ;    //Given number 
		
		
	for (int i = number ; i > 0 ; i--){
		
		
		String num = Integer.toString(i); 
		
		if(num.contains(digit)){
			
			continue ; 
		}

		else {
			System.out.println(i);
			
			break ; 
		}
	}

}}
