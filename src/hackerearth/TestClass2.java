package hackerearth;

/* IMPORTANT: Multiple classes and nested static classes are supported */

import java.io.BufferedReader;
import java.io.InputStreamReader;

class TestClass2 {
	public static void main(String args[]) throws Exception {
		// BufferedReader br = new BufferedReader(new
		// InputStreamReader(System.in));
		// String line = br.readLine();
		// int N = Integer.parseInt(line);
		// for (int i = 0; i < N; i++) {
		//
		// line = br.readLine();
		// int noOfDrivers = Integer.parseInt(line.trim());
		// int[] driverHeights = new int[noOfDrivers];
		//
		// line = br.readLine();
		// if (noOfDrivers == 1) {
		// System.out.println(1);
		// } else {
		// String[] heights = line.split(" ");
		// for (int j = 0; j < noOfDrivers; j++) {
		// driverHeights[j] = Integer.parseInt(heights[j]);
		// }
		//
		// long sight[] = new long[noOfDrivers];
		// int l = 0, j = 0;
		//
		// for (int k = 0; k < driverHeights.length; k++) {
		// int noOfDriversBefore = 0;
		// int noOfDriversAfter = 0;
		// l = k + 1;
		// j = k - 1;
		// while (l < driverHeights.length) {
		// if (driverHeights[k] > driverHeights[l]) {
		// noOfDriversAfter++;
		// } else {
		// break;
		// }
		// l++;
		// }
		// while (j > 0) {
		// if (driverHeights[k] > driverHeights[j]) {
		// noOfDriversBefore++;
		// } else {
		// break;
		// }
		// j--;
		// }
		//
		// sight[k] = (1l * (noOfDriversBefore + noOfDriversAfter) * (k + 1)) %
		// 1000000007;
		//
		// }
		//
		// long max = 0;
		// long minIndex = 0;
		// for (int y = 0; y < sight.length; y++) {
		// if (max < sight[y]) {
		// max = sight[y];
		// minIndex = y + 1;
		// System.out.println("max=" + max + " index:" + minIndex);
		// }
		//
		// }
		// System.out.println(minIndex);
		// }
		// }

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int N = Integer.parseInt(line);
		for (int i = 0; i < N; i++) {

			line = br.readLine();
			int noOfDrivers = Integer.parseInt(line.trim());
			int[] driverHeights = new int[noOfDrivers];

			line = br.readLine();
			if (noOfDrivers == 1) {
				System.out.println(1);
			} else {
				String[] heights = line.split(" ");
				for (int j = 0; j < noOfDrivers; j++) {
					driverHeights[j] = Integer.parseInt(heights[j].trim());
				}

				long sight[] = new long[noOfDrivers];
				int l = 0, j = 0;
				for (int k = 0; k < driverHeights.length; k++) {
					int noOfDriversBefore = 0;
					int noOfDriversAfter = 0;
					l = k + 1;
					j = k - 1;
					while (l < driverHeights.length) {
						if (driverHeights[k] > driverHeights[l]) {
							noOfDriversAfter++;
						} else {
							break;
						}
						l++;
					}
					while (j > 0) {
						if (driverHeights[k] > driverHeights[j]) {
							noOfDriversBefore++;
						} else {
							break;
						}
						j--;
					}
					sight[k] = (1l * (noOfDriversBefore + noOfDriversAfter) * (k + 1)) % 100000007;
				}

				long max = 0;
				long maxIndex = 0;
				for (int y = 0; y < sight.length; y++) {
					if (max < sight[y]) {
						max = sight[y];
						maxIndex = y + 1;
					}
				}
				System.out.println(maxIndex);
			}
		}
	}
}
