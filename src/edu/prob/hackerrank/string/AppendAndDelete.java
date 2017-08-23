package edu.prob.hackerrank.string;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class AppendAndDelete {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		String t = in.next();
		int k = in.nextInt();

		int delOps = 0;
		int appendOps = 0;
		if (s.equals(t)) {
			delOps = s.length();
			appendOps = delOps;
			if (k < delOps + appendOps) {
				System.out.println("No");
			} else {
				System.out.println("Yes");
			}

		} else {
			char[] s_arr = s.toCharArray();
			char[] t_arr = t.toCharArray();
			int s_i = 0, t_j = 0;
			for (; s_i < s_arr.length && t_j < t_arr.length; s_i++, t_j++) {
				if (s_arr[s_i] == t_arr[t_j]) {
					continue;
				} else {
					break;
				}
			}
			delOps = s_arr.length - s_i;
			appendOps = t_arr.length - t_j;
			
			if (k < delOps + appendOps ) {
				System.out.println("No");
			}else if( k > delOps + appendOps){
				if(s_i==0)//everything will be deleted
				{
					System.out.println("Yes");
				}else{
					System.out.println("No");
				}
			} 
			
			else {
				
				
				System.out.println("Yes");
			}

		}

	}
}
