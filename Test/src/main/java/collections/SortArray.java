package collections;

import java.util.Arrays;

public class SortArray {

	public static void main(String[]args) {

		int count=0,arr_count=0,v_counter=0;
		int arr[]= {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
		
		
		System.out.println(arr.length);
		int j=arr.length-1;
		for(int i=0;i<arr.length;i++) {

			if(arr[i]==0) {
				count++;
			}
		}
		for(int k=0;k<=j;k++) {
			if(arr[k]!=0) {
				arr[arr_count]=arr[k];
				arr_count++;
			}
		}
		for(int kk=0;kk<=j;kk++) {

			v_counter++;
			int res=arr.length-count;

			if(v_counter>res) {

				arr[kk]=0;

			}
		}
		for(int ll=0;ll<arr.length;ll++) {
			System.out.print(arr[ll]+" ");
		}
		
		System.out.print(Arrays.toString(arr));
	}
}