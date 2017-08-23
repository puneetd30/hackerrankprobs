import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TowerOfHanoi {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int N = Integer.parseInt(line);
		for (int i = 0; i < N; i++) {
			int noOfDisks = Integer.parseInt(br.readLine());
			int[] dp = new int[noOfDisks];
			Drum[] arr = new Drum[noOfDisks];
			for (int j = 0; j < noOfDisks; j++) {
				Drum d = new Drum();
				String[] disk = br.readLine().split(" ");
				d.r = Integer.parseInt(disk[0]);
				d.h = Integer.parseInt(disk[1]);
				arr[j] = d;
			}
			dp[0] = arr[0].h;
			int ans = arr[0].h;
			for (int j = 1; j < noOfDisks; j++) {
				dp[j] = arr[j].h;
				for (int k = 0; k < j; k++) {
					if (arr[j].h > arr[k].h && arr[j].r > arr[k].r)
						dp[j] = Math.max(dp[j], dp[k] + arr[j].h);
				}
				ans = Math.max(ans, dp[j]);
			}
			System.out.println(ans);
		}

	}

	private static int hanoi(Drum[] arr, int st, int pos, int max) {

		if (st <= pos && st < arr.length && pos < arr.length) {
			if (arr[st].h == arr[pos].h && arr[st].r == arr[pos].r) {
				return 0;
			}
			if (arr[st].h > arr[pos].h && arr[st].r > arr[pos].r) {
				// if(dp[st]!=0 && (dp[st]<arr[st].h + arr[pos].h)){
				// dp[st]=arr[st].h+arr[pos].h;
				// dp[st]+=hanoi(arr,pos,pos+1,dp);
				// }
				int sum = arr[st].h + arr[pos].h;
				sum += hanoi(arr, pos, (pos + 1) % arr.length, max);
				if (max < (sum)) {
					max = sum;
					return max;
				}
			} else {
				return hanoi(arr, st, (pos + 1) % arr.length, max);
			}

		}
		return 0;
	}

	static class Drum {
		int h, r;

		public int getH() {
			return h;
		}

		public void setH(int h) {
			this.h = h;
		}

		public int getR() {
			return r;
		}

		public void setR(int r) {
			this.r = r;
		}

	}

}
