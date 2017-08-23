package com.prep;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Test {

	static String funnyString(String s) {
		StringBuilder sb = new StringBuilder();
		sb.append(s);
		String rS = sb.reverse().toString();

		for (int i = 0; i < rS.length() - 1; i++) {
			if (Math.abs(s.charAt(i) - s.charAt(i + 1)) != (Math.abs(rS.charAt(i) - rS.charAt(i + 1)))) {
				return "Not Funny";
			}

		}
		return "Funny";

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int q = in.nextInt();
		for (int a0 = 0; a0 < q; a0++) {
			String s = in.next();
			String result = funnyString(s);
			System.out.println(result);
		}
	}
	
	
	
}
