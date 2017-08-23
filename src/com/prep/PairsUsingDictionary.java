package com.prep;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PairsUsingDictionary {


	   public static void main(String[] args) {
		        Scanner in = new Scanner(System.in);
		        int n = in.nextInt();
		        int k = in.nextInt();
		        Map<Integer,Integer> x = new HashMap<>();
		        for(int x_i=0; x_i < n; x_i++){
		            x.put(in.nextInt(),0);
		        }
		        int count=0;
		        for(Integer y:x.keySet()){
		        	if(x.containsKey(y+k)){
		        		count++;
		        	}
		        }
		        System.out.println(count);
		    }
	}
