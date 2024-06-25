package test;

import java.time.DayOfWeek;
import java.time.Month;
import java.time.MonthDay;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
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
	    public String solution(int a, int b) {
	        
	        int [] days = {31,29,31,30,31,30,31,31,30,31,30,31};
	        int temp =0;
	        for(int i=1;i<a;i++) {
	        	temp += days[i-1];
	        }
	        temp += b;
	        int result = temp%7;
	        String day = "";
	        if(result == 1) {
	        	day = "FRI";
	        }else if(result==2) {
	        	day = "SAT";
	        }else if(result==3) {
	        	day = "SUN";
	        }else if(result==4) {
	        	day = "MON";
	        }else if(result==5) {
	        	day = "TUE";
	        }else if(result==6) {
	        	day = "WED";
	        }else if(result==0) {
	        	day = "THU";
	        }
	        
	        return day;
	    }
	}
}

