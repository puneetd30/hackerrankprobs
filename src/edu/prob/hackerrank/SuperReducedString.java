package edu.prob.hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SuperReducedString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String in = sc.nextLine();
		Stack<String> st = new Stack<>();
		String[] vo = in.split("");

		for (int i = 1; i < vo.length; i++) {
			if (st.isEmpty() || !st.peek().equalsIgnoreCase(vo[i])) {
				st.push(vo[i]);
			} else {
				st.pop();
			}

		}

		for (int i = 0; i < st.size(); i++) {
			System.out.print(st.elementAt(i));
		}
	}
}