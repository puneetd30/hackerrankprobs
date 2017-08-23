
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MaxPerimeterTriangle_Greedy {
	static class Triangle {
		long max;
		long min;
		long mid;

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}
		Arrays.sort(arr);
		Map<Long, List<Triangle>> hashMap = new HashMap<>();
		long perimeter = 0;
		for (int i = 0; i < arr.length - 2; i++) {
			for (int j = i + 1; j < arr.length - 1; j++) {
				
				for (int k = j + 1; k < arr.length; k++) {
					long a = arr[i];
					long b = arr[j];
					long max = 0;
					max = a > b ? a : b;
					long min = 0;
					min = a < b ? a : b;
					long c = arr[k];
					max = max > c ? max : c;
					min = min < c ? min : c;
					long mid = (max == a && min == b) ? c : (max == b && min == c) ? a : (max == c && min == a) ? b : 0;
					if ((a == max && max < (b + c)) || (b == max && max < (a + c)) || (c == max && max < (a + b))) {
						long tPerimeter = max + min + mid;
						Triangle t = new Triangle();
						t.max = max;
						t.mid = mid;
						t.min = min;
						if (perimeter < tPerimeter) {
							perimeter = tPerimeter;
						}
						if (hashMap.containsKey(tPerimeter)) {
							hashMap.get(tPerimeter).add(t);
						} else {
							List<Triangle> triangles = new ArrayList<>();
							triangles.add(t);
							hashMap.put(tPerimeter, triangles);
						}
					}
				}

			}
		}

		if (hashMap.isEmpty()) {
			System.out.println("-1");
		} else {
			long maxT = 0;
			long min = Integer.MAX_VALUE;
			long mid = 0;
			List<Triangle> trns = hashMap.get(perimeter);

			for (Triangle tn : trns) {
				if (maxT <= tn.max) {
					maxT = tn.max;
					if (tn.min < min) {
						min = tn.min;
					}
					mid = tn.mid;
				}
			}
			System.out.println(min + " " + mid + " " + maxT);
		}

	}
}
