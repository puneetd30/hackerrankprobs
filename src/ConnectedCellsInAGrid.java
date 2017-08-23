import java.util.Scanner;

public class ConnectedCellsInAGrid {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();

		int[][] b = new int[n][m];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				b[i][j] = in.nextInt();
			}
		}
		boolean[] visited = new boolean[n];
		for (int i = 0; i < n; i++) {
			visited[i] = true;

		}
		int count=0;
		for (int i = 0; i < n; i++) {
				dfs(i, visited, b);
				count++;
		}
		System.out.println(count);
	}

	static void dfs(int node, boolean[] seen, int[][] b) {
		seen[node] = true;

		for (int j = 0; j < b[0].length; j++) {
			if (!seen[j]) {
				dfs(j, seen, b);
			}
		}
	}
}
