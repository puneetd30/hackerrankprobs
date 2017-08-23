import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BeautifulPairs {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arrA = new int[n];
		int[] arrB = new int[n];
		
		for (int i = 0; i < n; i++) {
			arrA[i] = in.nextInt();
		}

		for (int i = 0; i < n; i++) {
			arrB[i] = in.nextInt();
		}

		Map<Integer, Integer> aMap = new HashMap<>();
		Map<Integer, Integer> bMap = new HashMap<>();
		for (int i = 0; i < arrA.length; i++) {
			for (int j = 0; j < arrB.length; j++) {
				if (!aMap.containsKey(i) && !bMap.containsKey(j)) {
					if (arrA[i] == arrB[j]) {
						aMap.put(i, i);
						bMap.put(j, j);
						break;
					}
				}
			}
		}
		
		if(aMap.isEmpty()){
			System.out.println(1);
		}else if(aMap.size()==n){
			System.out.println(n);
		}else if(aMap.size()<n){
			System.out.println(aMap.size()+1);
		}
	}
}
