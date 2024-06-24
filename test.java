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
	    public int solution(int[] nums) {
	    	Map<String, Object> map = new HashMap<>();
	    	
	    	for(int i=0;i<nums.length;i++) {
	    		map.put(String.valueOf(nums[i]), i);
	    	}
	    	int result = nums.length/2;
	    	if(map.size() < result) {
	    		result = map.size();
	    	}
	    	
	        return result;
	    }
	}
}

