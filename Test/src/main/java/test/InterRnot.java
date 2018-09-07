package test;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.Math;

public class InterRnot {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String number = in.next();
        
		int len = number.length();
		
		int ifNum =  0;
		
		for(int i=0;i<len;i++){
			if(number.charAt(i)>=48 && number.charAt(i)<=57){
				ifNum = ifNum+1;
			} //if
		} //for
			//if its a number
			if(ifNum==len){
				//starts 
				int output = 0;
				int place = 0;
				for(int j=len-1;j>=0;j--){
					int a = number.charAt(j);
					if(a==48){
						output = (int) (output + (0* Math.pow(10, place)));
						place=place+1;
					}else if (a==49) {
						output = (int) (output + (1* Math.pow(10, place)));
						place=place+1;
					}else if (a==50) {
						output = (int) (output + (2* Math.pow(10, place)));
						place=place+1;
					}else if (a==51) {
						output = (int) (output + (3* Math.pow(10, place)));
						place=place+1;
					}else if (a==52) {
						output = (int) (output +  (4* Math.pow(10, place)));
						place=place+1;
					}else if (a==53) {
						output = (int) (output + (5* Math.pow(10, place)));
						place=place+1;
					}else if (a==54) {
						output = (int) (output + (6* Math.pow(10, place)));
						place=place+1;
					}else if (a==55) {
						output = (int) (output + (7* Math.pow(10, place)));
						place=place+1;
					}else if (a==56) {
						output = (int) (output + (8* Math.pow(10, place)));
						place=place+1;
					}else if (a==57) {
						output = (int) (output + (9* Math.pow(10, place)));
						place=place+1;
					} //else if
				
					//output = output +  * 2^i;
		
				//ends
				}// for
				
				System.out.println( (int)output);
			} // if
			// if 
			else {
				System.out.println("Its not a number");
			} // else
		} // psvm
		
		

	} // class