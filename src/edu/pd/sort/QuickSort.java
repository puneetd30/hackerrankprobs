package edu.pd.sort;

import java.util.Scanner;

public class QuickSort {

	static void quickSort(int[] ar) {
		quickSort(ar, 0, ar.length);

	}

	static void quickSort(int[] ar, int l, int r) {
		if (l < r) {
			int p = partition(ar, l, r);
			
			quickSort(ar, l, p);
			quickSort(ar, p + 1, r);
		}

	}

	static int partition(int[] ar,int ls,int rs) {
		int lc=ls,rc=rs;
		int p = ar[ls];
		int left[] = new int[ar.length];
		int right[] = new int[ar.length];
		int equal[] = { p };
		int l = 0;
		int r = 0;
		for (int i = ls; i < rs; i++) {
			if (ar[i] < p) {
				left[l++] = ar[i];
			}
			if (ar[i] > p) {
				right[r++] = ar[i];
			}
		}
		for (int k = 0; k < l; k++) {
			ar[ls++] = left[k];
		}
		int pivot=ls;
		ar[ls++] = equal[0];// pivot
		
		for (int m = 0; m < r; m++) { 
			ar[ls++] = right[m];
		}
		
		return pivot;
	}

	static void printArray(int[] ar,int l,int p) {
		if(p-l<=1){
			return;
		}
		for (int i=l;i<p;i++) {
			System.out.print(ar[i] + " ");
		}
		System.out.println("");
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] ar = new int[n];
		for (int i = 0; i < n; i++) {
			ar[i] = in.nextInt();
		}
		quickSort(ar);
		in.close();
		printArray(ar, 0, n);
	}
}
