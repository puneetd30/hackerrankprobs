package edu.pd.algo.greedy;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class GridChallenge {

	public static void main2(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for (int z = 0; z < t; z++) {
			int n = sc.nextInt();
			char[][] v = new char[n][n];
			String b = null;
			
			if(n==1){
				b = sc.next().trim();
				System.out.println("YES");
				continue;
			}
			for (int i = 0; i < n; i++) {
				b = sc.next().trim();
				v[i] = b.toCharArray();
				Arrays.sort(v[i]);
			}

			boolean flag = false;

			for (int i = 1; i < v[0].length; i++) {
				flag = true;
				for (int j = 0; j < v[0].length; j++) {

					if (v[i-1][j] <= v[i][j]) {
						continue;
					} else {
						flag=false;	
						break;
					}

				}
			}
			if(flag){
			System.out.println("YES");
			}else{
				System.out.println("NO");
			}
//			boolean fl = false;
//			for (int k = 0; k < flags.length; k++) {
//				if (flags[k]) {
//					fl = true;
//					break;
//				}
//			}
//			if (fl) {
//				System.out.println("YES");
//			} else {
//				System.out.println("NO");
//			}
		}
	}
	
	 public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int t = sc.nextInt();

			for (int z = 0; z < t; z++) {
				int n = sc.nextInt();
				char[][] v = new char[n][n];
				String b = null;
				
				
				for (int i = 0; i < n; i++) {
					b = sc.next().trim();
					v[i] = b.toCharArray();
					Arrays.sort(v[i]);
				}

				boolean flag = false;

				for (int i = 0; i < v[0].length; i++) {
					flag = true;
					for (int j = 1; j < v[0].length; j++) {

						if (v[j-1][i] <= v[j][i]) {
	                        
							continue;
						} else {
							flag=false;	
							break;
						}

					}
					if(flag==false){
						break;
					}
				}
				if(flag){
				System.out.println("YES");
				}else{
					System.out.println("NO");
				}
//				boolean fl = false;
//				for (int k = 0; k < flags.length; k++) {
//					if (flags[k]) {
//						fl = true;
//						break;
//					}
//				}
//				if (fl) {
//					System.out.println("YES");
//				} else {
//					System.out.println("NO");
//				}
			}
		}
}

