package collections;

import java.util.Arrays;

public class Pushzero2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int array[] = {	1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
		
		
		
		int current = array.length - 1;
        //3
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] != 0) {
                array[current] = array[i];
                current--;
            }
        }

                                                                                                                                
        System.out.println(Arrays.toString(array));
	}

}
