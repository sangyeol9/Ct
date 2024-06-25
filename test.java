package test;

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
	    public int solution(int a, int b, int n) {
	    	int result = 0;
	    	while(n>=a) {
	    		int newc = (n/a)*b;
	    		result += newc;
	    		
	    	}
	        return result;
	    }
	}
}

