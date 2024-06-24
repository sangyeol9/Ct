package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String a = sc.nextLine();
 		
		/*
		 for(int i=0;i<score.length;i++) {
	        	for(int j=i+1;j<=score.length-1;j++) {
	        		if(score[i] < score[j]) {
	        			int temp = score[i];
	        			score[i] = score[j];
	        			score[j] = temp;
	        			
	        		}	        		
	        	}
	        } 
		 */
	}

	class Solution {
	    public int solution(int number, int limit, int power) {
	    	
	    	int result =0;
	    	for(int i=1;i<=number/2;i++) {
	    		int count =0;
	    		
	    		for(int j=1;j<=i;j++) {
	    			if(i % j == 0) {
	    				count ++;
	    			}	
	    			if(count>limit) {
	    				count = power;
	    				break;
	    			}
	    		}
	    		
	    		
	    		result += count;
	    	}
	    	
	        return result;
	    }
	}
}

