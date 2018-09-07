package collections;

public class SL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int arr[] = {12, 35, 1, 10, 34, 1};
		int largest = arr[0];

		//System.out.println(largest);
		int secondLargest = arr[0];

		//System.out.println(secondLargest);


		for (int i = 0 ; i < arr.length ; i ++){

			if(arr[i]>largest){

				secondLargest = largest ; 

				largest = arr[i];



			}
			else if (arr[i] > secondLargest) {
				secondLargest = arr[i];

			}
		}
		System.out.println(secondLargest);

	}

}
