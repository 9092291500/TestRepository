package testNG;

class FIB{  
public static void main(String args[])  
{    
 
	
	int n1 , n2 , n3 ;
	
	
	n1 = 0 ; 
	n2 = 1 ; 
	
	System.out.println(n1 + " "  + n2);
	
	
	for (int i = 0 ; i< 8 ; i++   ){
		
		
		n3 = n1+ n2  ;
		
		System.out.print(n3 + " ");
		
		n1 = n2 ;
		n2 = n3 ;
		
		
		
	}
	
	
	/*int n=29;//it is the number to be checked    
	 int  m=n/2;
	 
	 System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
	 
	 System.out.println(m);
	 */
	 
	 
 }
	 
	 
	 
	 
  
  }  