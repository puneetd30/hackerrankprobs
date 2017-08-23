package edu.prob.hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class FindIndexWhereLeftAndRightAreEqual {

    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
	   int T = in.nextInt();
       for(int i=0;i<T;i++){
        int S=in.nextInt();
        int[] ar = new int[S];
		for (int j = 0; j < S; j++) {
			ar[j] = in.nextInt();
		}
           System.out.println(findIndex(ar));
           
       }
    }
       public static String findIndex(int[] ar){
    	   if(ar.length==1){
    		   return "YES";
    	   }
            int[] b=new int[ar.length];
            int res=0;
            for(int i=0;i<b.length;i++){
            	res+=ar[i];
            }
            int addFromStart=ar[0];
            for(int j=1;j<b.length;j++){
                addFromStart+=ar[j];
                if(addFromStart==(res-addFromStart+ar[j])){
                	return "YES";
                }
            	
            }
            return "NO";
        }
}