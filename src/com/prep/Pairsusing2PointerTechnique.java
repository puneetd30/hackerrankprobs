package com.prep;

import java.util.Arrays;
import java.util.Scanner;

public class Pairsusing2PointerTechnique {

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int k = in.nextInt();
	        int[] x = new int[n];
	        for(int x_i=0; x_i < n; x_i++){
	            x[x_i] = in.nextInt();
	        }
	        Arrays.sort(x);
	        int i=0,j=n-1,count=0;
	        while(i<n){
	            while(Math.abs(x[i]-x[j])>k && j>0){ 
	                j--;
	            }
	            if(Math.abs(x[i]-x[j])==k){
	                count++;
	            }
	                i++;
	                //j=n-1;
	            }
	        System.out.println(count);
	    }

}
