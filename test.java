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
    public int solution(String t, String p) {
          int count =0;
	    int pl = p.length();
	       for(int i=0;t.length()-i>=pl;i++) {   
	    			  if( t.substring(i, i+pl ).compareTo(p)<=0) {
	    				 count++; 
	    			  }
	       }
	        
	     
	        return count;
	    }
}
}

