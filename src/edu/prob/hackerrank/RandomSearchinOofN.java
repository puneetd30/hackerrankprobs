package edu.prob.hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class RandomSearchinOofN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<Integer, Integer> costMap = new HashMap<>();
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int m = sc.nextInt();
			int n = sc.nextInt();
			int[] ar = new int[n];
			for (int j = 0; j < n; j++) {
				ar[j] = sc.nextInt();
			}

			for (int p = 0; p < ar.length; p++) {
				if (costMap.get(ar[p]) == null) {
					costMap.put(ar[p], 1);
				} else {
					costMap.put(ar[p], costMap.get(ar[p]) + 1);
				}
			}
			
			for (int k = 0; k < n; k++) {
					
				if (costMap.get(m-ar[k])!=null) {
					for(int q=k+1;q<ar.length;q++){
						if(m-ar[k]==ar[q]){
							System.out.println(""+(k+1)+" "+(q+1));
							break;
						}
					}
					
				}
			}
		}
	}
}