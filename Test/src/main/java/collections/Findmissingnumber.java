package collections;

public class Findmissingnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arradd = 0 ; 
		
		int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 , 11, 12 ,
				13,14 , 15, 16, 17 , 18 , 19 , 20 , 21,22,
				23 ,24,25,26,27,28,29,30,31,33,32,35};//new int[]{1,2,3,4,6 } ;
		
		int n = arr.length+1 ;
		
	
		
		
		int sum  = n * (n+1)/2 ;
		
		System.out.println(sum);
		
		for(int a = 0 ; a <arr.length ; a ++){
			
			
			 arradd = arradd + arr[a];
		}

		System.out.println(arradd);
		
	 int m =  sum-  arradd ; 
	 
	 System.out.println(m + " - is the missing array");
	}

}
