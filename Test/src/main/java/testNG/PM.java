package testNG;

class PM
{
   public static void main(String args[])
   {		
	int temp;
	boolean isPrime=true;
	
	int num = 4 ; 
	
	for(int i=2;i<num ;i++)
	{
           temp=num%i;
	   if(temp==0)
	   {
	      isPrime=false;
	      break;
	   }
	}
	//If isPrime is true then the number is prime else not
	if(isPrime)
	   System.out.println(num + " is a Prime Number");
	else
	   System.out.println(num + " is not a Prime Number");
   }
}