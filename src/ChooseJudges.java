import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ChooseJudges {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int[] scores = null;
		int T = Integer.parseInt(line);
		for (int i = 0; i < T; i++) {
			int N = Integer.parseInt(br.readLine());
			String scoresRes = br.readLine();
			String[] scoresResArr = scoresRes.split(" ");
			scores = new int[N];
			for (int k = 0; k < N; k++) {
				scores[k] = Integer.parseInt(scoresResArr[k]);
			}
			int caseVal = i + 1;
			System.out.println("Case " + caseVal + ": "
					+ calculateScore(scores));
			System.out.println(calculateScore(scores));
		}

	}

	private static int calculateScore(int[] scores) {
		int[] dp = new int[scores.length];
		if (scores.length == 1) {
			return scores[0];
		}
		// dp[0] = scores[0];
		// dp[1] = scores[1];
		for (int i = 0; i < scores.length - 3; i++) {
			// dp[i]+=
			// dp[i] += dp[i-2]+scores[i];
			int t1 = scores[i] + scores[i + 2];
			int t2 = scores[i] + scores[i + 3];

			dp[i] = Math.max(t1, t2);
		}
		return Math.max(dp[scores.length - 1], dp[scores.length - 2]);
	}

}
