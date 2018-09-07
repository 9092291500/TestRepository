package logic_program;

public class Count_Palindrime_in_a_given_sentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "HAPPY malayaLam tooT DuD"; 
		
		int count = 0 ;
		
		
		String reverse = "" ;
		
		
		
		
		String[] words = str.split(" ");
		
		System.out.println(words.length);
		
		
		for(int i = 0 ; i<words.length ; i++) {
			
			
			String word = words[i].toLowerCase() ; 
			
			for (int j = word.length()-1 ; j>=0; j--){
				
				
			reverse = reverse+word.charAt(j);
			
		
				
				
				
				
				
			}
			
			
			
			if(reverse.contains(word)){
				
				System.out.println("given is same  " + word);
				
				count++ ;
			}
			
			
			
			
		}
		
		
		System.out.println("The total number of palindroe in a given sentence is = " + count);

	}

}
