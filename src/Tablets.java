import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tablets {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int N = Integer.parseInt(line);
		int[] healthScores = new int[N];
		for (int i = 0; i < N; i++) {
			healthScores[i] = Integer.parseInt(br.readLine());
		}
		int[] tabletsArr = tablets(healthScores);
		int sum = 0;
		for (int i = 0; i < tabletsArr.length; i++) {
			System.out.println(tabletsArr[i]);
			sum += tabletsArr[i];
		}
		System.out.println(sum);

	}

	static int[] tablets(int[] healthScores) {
		int[] dp = new int[healthScores.length];
		dp[0] = 1;
		int maxIndexVal = 0;
		for (int i = 1; i < healthScores.length; i++) {
			if (healthScores[i] < healthScores[i - 1]) {
				maxIndexVal = i - 1;
				if (dp[i - 1] - 1 >= 1) {
					dp[i] = dp[i - 1] - 1;
				} else {
					for (int j = maxIndexVal; j <= i; j++) {
						dp[j] = dp[j] + 1;
					}
				}
			} else if (healthScores[i] > healthScores[i - 1]) {
				dp[i] = dp[i - 1] + 1;
			} else {
				dp[i] = 1;
			}
		}
		return dp;
	}
}
