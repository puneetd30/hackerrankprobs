package edu.prob.hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TwoChars {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int len = in.nextInt();
		String s = in.next();
		String v[] = s.split("");
		String filteredVal = null;
		Set<String> setStr = null;
		Map<String, Integer> vMap = null;

		do {
			setStr = new HashSet<>();
			vMap = new HashMap<>();

			for (int i = 1, j = 2; i < v.length - 1; i++, j++) {
				if (v[i].equals(v[j])) {
					setStr.add(v[i]);
				}
			}

			for (String s1 : setStr) {
				for (int i = 1; i < v.length; i++) {
					if (v[i].equals(s1)) {
						v[i] = "";
					}
				}
			}

			StringBuilder sb = new StringBuilder();
			for (int k = 1; k < v.length; k++) {
				if (!v[k].equals(""))
					sb.append(v[k]);
			}

			filteredVal = sb.toString();
			v = filteredVal.split("");
		} while (setStr.size() != 0);

		if (filteredVal.length() == 0 || filteredVal.length() == 1) {
			System.out.print("" + 0);
			return;
		} else if (filteredVal.length() == 2) {
			System.out.print("" + 2);
			return;
		}
		String[] filterValArr = filteredVal.split("");

		for (int i = 1; i < filterValArr.length; i++) {
			if (vMap.get(filterValArr[i]) == null) {
				vMap.put(filterValArr[i], 1);
			} else {
				int tVal = vMap.get(filterValArr[i]).intValue();
				vMap.put(filterValArr[i], tVal + 1);
			}

		}
		String[] alphabetSet=new String[vMap.keySet().size()];
        vMap.keySet().toArray(alphabetSet);
		
		
		
		
		
	}
}
