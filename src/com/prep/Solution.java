package com.prep;

import java.io.*;
import java.util.*;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		int[] x = new int[n];
		for (int x_i = 0; x_i < n; x_i++) {
			x[x_i] = in.nextInt();
		}
		int m = in.nextInt();
		int[] y = new int[m];
		for (int y_i = 0; y_i < m; y_i++) {
			y[y_i] = in.nextInt();
		}

		Arrays.sort(x);
		Arrays.sort(y);

		Map<Integer, Integer> xM = new HashMap<>();
		Map<Integer, Integer> yM = new HashMap<>();

		for (int i = 0; i < x.length; i++) {
			if (xM.containsKey(x[i])) {
				xM.put(x[i], xM.get(x[i]) + 1);
			} else {
				xM.put(x[i], 1);
			}
		}

		for (int j = 0; j < y.length; j++) {
			if (yM.containsKey(y[j])) {
				yM.put(y[j], yM.get(y[j]) + 1);
			} else {
				yM.put(y[j], 1);
			}
		}
		int[] b = null;

		b = new int[n + m];

		int k = 0;
		for (int i = 0; i < xM.size(); i++) {
			if (xM.get(x[i]).equals(yM.get(x[i]))) {
				continue;
			}
			b[k++] = x[i];
		}

		for (int j = 0; j < y.length; j++) {
			
			if (xM.get(y[j]).equals(yM.get(y[j]))) {
				continue;
			}
			
			b[k++] = y[j];
		}
		
		
		
		Arrays.sort(b);
		int curr = 0, prev = 0;
		for (int l = 0; l < b.length; l++) {

			if (b[l] != 0) {
				curr = b[l];
				if (curr != prev) {
					prev=curr;
					System.out.print(b[l] + " ");
				}
			}
		}

	}
}