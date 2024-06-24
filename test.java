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
	    public int solution(int k, int m, int[] score) {
	        for(int i=0;i<score.length-1;i++) {
	        	if(score[i] < score[i+1]) {
	        		int temp = score[i];
	        		score[i] = score[i+1];
	        		score[i+1] = temp;
	        	}
	        }
	        int a = 0;
	        int result =0;
	        for(int i=0; i<score.length/m;i++) {
	        	int temp = k;
	        	if(score[a] < k) {
	        		temp = score[a];
	        	}
	        }
	        
	        
	        return result;
	    }
	
	}
}

