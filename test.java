package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String a = sc.nextLine();
 		
		
	}

	class Solution {
	    public int solution(int n) {
	      		int answer =1;
		    	for(int i=3;i<=Math.sqrt(n);i++) {
	                int count = 0;
	               if(i%2 != 0) {
	                   
	                   for(int j=2;j<=i;j++){
	                        if(count==2) break;
	                        if(i%j == 0) count ++;
	                   } 
	                   if(count == 1 ) answer++;
	               }
	               
		    		
	                
		    	}
		    	
		        return answer;
	    }
	}
}

