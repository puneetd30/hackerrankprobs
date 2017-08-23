package problem2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main2 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		String[] rowsAndCol = line.split(" ");
		int n = Integer.parseInt(rowsAndCol[0]);
		int m = Integer.parseInt(rowsAndCol[1]);

		int[][] arr = new int[n][m];
		for (int i = 0; i < n; i++) {
			line = br.readLine();
			String[] inputs = line.split(" ");

			for (int j = 0; j < m; j++) {
				arr[i][j] = Integer.parseInt(inputs[j]);
			}
		}
		System.out.println(calMaxScore(arr));
	}

	private static int calMaxScore(int[][] arr) {
		int max = 0;
		int sum = 0;

		for (int j = 0; j < arr.length; j++) {
			int[][] sumMat = new int[arr.length][arr[0].length];
			if (arr[j][0] == -1) {
				sumMat[j][0] = 0;
				continue;
			}
			System.out.println();
			System.out.println(arr[j][0]);
			//int val = calMaxScore(j, 0, -1, -1, sum, arr, sumMat);
//			System.out.println("val=" + val);
//			if (val > max) {
//				System.out.println("val&max=" + val);
//				max = val;
//			}

		}
		return max;
	}

//	private static int calMaxScore(int r, int c, int pr, int pc, int sum,
//			int[][] arr, int[][] sumMat) {
//
//		int dist = 0, dist2 = 0, dist3 = 0;
//		if (c > arr[0].length) {
//			return 0;
//		}
//		if (arr[r][c] == -1) {
//			return 0;
//		}
//
//		if ((pr == arr.length - 1 && r == 0)u
//				|| (pr == 0 && r == arr.length - 1)) {
//			sumMat[r][c] = 0;
//			sum = 0;
//		}
//
//		System.out.print("rc:" + r + "" + c + " " + arr[r][c] + ",");
//
//		if (c == arr[0].length - 1) {
//
//			// if (r == 0 && r < arr.length) {
//			// dist = calMaxScore((r + 1) % arr.length, c, r % arr.length, c,
//			// sum + arr[r % arr.length][c], arr);
//			// } else if (r == arr.length - 1 && r >= 0) {
//			// dist = calMaxScore((r - 1) % arr.length, c, r % arr.length, c,
//			// sum + arr[r % arr.length][c], arr);
//			// } else {
//			// if (((r + 1) % arr.length) != pr && arr[(r + 1) % arr.length][c]
//			// != -1) {
//			// dist = calMaxScore((r + 1) % arr.length, c, r, c, sum, arr);
//			// }
//			// if (((r - 1) % arr.length) != pr && arr[r - 1 % arr.length][c] !=
//			// -1) {
//			// dist3 = calMaxScore((r - 1) % arr.length, c, r, c, sum, arr);
//			// }
//			// if(dist<dist3){
//			// dist=dist3;
//			// }
//			// }
//			// return dist;
//			dist = sumMat[r][c];
//			dist2 = sumMat[r][c];
//			
//			if (r == 0) {
//				for (int i = r; i < arr.length; i++) {// already 4 taken
//					if (arr[i][c] == -1) {
//						break;
//					}
//
//					dist += arr[i][c];
//					if (sumMat[i][c] < dist) {
//						sumMat[i][c] = dist;
//					}
//					// if ((i + 1) % arr[0].length == r) {
//					// return sum;
//					// }
//				}
//			} else if (r == arr.length - 1) {
//				for (int i = r; i >= 0; i--) {
//					if (arr[i][c] == -1) {
//						break;
//					}
//
//					dist += arr[i][c];
//					if (sumMat[i][c] < dist) {
//						sumMat[i][c] = dist;
//					}
//				}
//			} else {
//
//				for (int i = r;; i = (i + 1) % arr.length) {
//					if (arr[i][c] == -1) {
//						break;
//					}
//
//					if (i == 0) {// start of column #teleport
//						dist = 0;
//					}
//					dist = dist + arr[i][c];
//					if (sumMat[i][c] < dist) {
//						sumMat[i][c] = dist;
//					}
//					if ((i + 1) % arr.length == r) {
//						break;
//					}
//				}
//
//				for (int i = r;; i = (i - 1 + arr.length) % arr.length) {
//					if (arr[i][c] == -1) {
//						break;
//					}
//					if (i == arr.length - 1) { // end of column #teleport
//						dist2 = 0;
//					}
//					dist2 = dist2 + arr[i][c];
//					if (sumMat[i][c] < dist) {
//						sumMat[i][c] = dist;
//					}
//					if ((i - 1 + arr.length) % arr.length == r) {
//						break;
//					}
//				}
//				if (dist < dist2) {
//					return dist;
//				} else {
//					return dist2;
//				}
//			}
//			return dist;
//		}
//
//		sum += arr[r][c];
//		if (sumMat[r][c] < sum) {
//			sumMat[r][c] = sum;
//		}
//		if (((r + 1) % arr.length) != pr && arr[(r + 1) % arr.length][c] != -1) {
//			 calMaxScore((r + 1) % arr.length, c, r, c, sumMat[r][c],
//					arr, sumMat);
//			 dist=sumMat[r][c];
//		}
//		if ((r % arr.length) != pr && arr[r % arr.length][c + 1] != -1) {
//			calMaxScore(r, c + 1, r, c, sumMat[r][c], arr, sumMat);
//			dist2=sumMat[r][c];
//		}
//		if (((r - 1 + arr.length) % arr.length) != pr
//				&& arr[(r - 1 + arr.length) % arr.length][c] != -1) {
//			calMaxScore((r - 1 + arr.length) % arr.length, c, r, c,
//					sumMat[r][c], arr, sumMat);
//			dist3 = sumMat[r][c];
//		}
//		int max = Math.max(Math.max(dist, dist2), dist3);
//
//		return max;
//
//	}

	
	
	
}
