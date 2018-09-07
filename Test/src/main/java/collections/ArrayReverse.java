package collections;

import java.util.Arrays;

public class ArrayReverse {

 public static void main(String[] args) {

 

  int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 , 11, 12 ,13,14 , 15, 16, 17 , 18 , 19 , 20 , 21, 23 };
  
  int[] b = new int[a.length];
  
  int j = 0;

  // array index starts from 0,
  // so i should be initialized to array length - 1.
  for (int i = a.length - 1; i >= 0; i--) {
   b[j++] = a[i];
  }

  System.out.println(Arrays.toString(b));

 }
  
 

 }

