
package collections;
 
public class SecondLargest {
 
	public static void main(String[] args) {
 
		int arr[] = {12, 35, 1, 10, 34, 1 };
		int largest = arr[0];
		
		System.out.println(largest);
		int secondLargest = arr[0];
		
		System.out.println(secondLargest);
		
		System.out.println("The given array is:" );
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}
		for (int i = 0; i < arr.length; i++) {
 
			if (arr[i] > largest) {
				secondLargest = largest;
				System.out.println("sssssssssssssss" +secondLargest);
				largest = arr[i];
				System.out.println("@@@@@@@@@@@@@@" +largest);
 
			} else if (arr[i] > secondLargest) {
				secondLargest = arr[i];
 
			}
		}
 
		System.out.println("\nSecond largest number is:" + secondLargest);
 
	}
}