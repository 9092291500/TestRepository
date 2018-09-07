package testNG;

public class Largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x , y , z , largest ;
		
		x = 111 ;
		
		y = 9 ;
		
		z = 13 ;
		
		
		largest = x ;
		if(y > x && y > z){
			largest = y;
		}
		else if(z > x && z > y){
			largest = z;
		}
		
		System.out.println("Largest number is " + largest);
		
		

	}

}
