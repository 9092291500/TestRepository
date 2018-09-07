package test;

import java.util.Scanner;
import java.util.Arrays;

public class StringTokens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
        String input = "He is a very very good boy, isn't he?".trim()  ; 
        
        
        String[] tokens = input.split("[^\\p{Alpha}]+");
        
        //input.split("[^\\p{Alpha}]+");
        
        System.out.println(Arrays.toString(tokens));
        
        int size = (input.isEmpty()) ? 0 : tokens.length;
        System.out.println(size);
        
        for(String s : tokens) {
            System.out.println(s);
        }

	}

}
