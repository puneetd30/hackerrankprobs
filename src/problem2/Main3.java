package problem2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main3 {

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
		int score = 0;
		int min=0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i][0] == -1) {
				continue;
			}
			
			score = calMaxScore(i, 0, arr, 0);
			if(min<score){
				min=score;
			}
		}
		return min;
	}

	private static int calMaxScore(int r, int c, int[][] arr, int paths) {
		if (r > arr.length - 1 || c > arr[0].length - 1) {
			return paths;
		}

		if (arr[r][c] == -1) {
			return paths;
		}

		if (c == arr[0].length - 1) {
			return calMaxScore(r+1,c,arr,paths+arr[r][c]);
		}
		
		int sc= Math.min(calMaxScore(r, c + 1, arr, paths+arr[r][c]),calMaxScore(r + 1, c, arr, paths+arr[r][c]));
	    return sc;
	}
}
