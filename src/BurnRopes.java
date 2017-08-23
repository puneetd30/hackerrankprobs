import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BurnRopes {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int T = Integer.parseInt(line);
		for (int i = 0; i < T; i++) {
			int M = Integer.parseInt(br.readLine());
			String U = br.readLine();
			String L = br.readLine();
			String[] uArr = U.split(" ");
			String[] lArr = L.split(" ");
			int[] uInt = new int[uArr.length];
			int[] lInt = new int[lArr.length];

			int TU = 0, TL = 0;
			for (int j = 0; j < uInt.length; j++) {
				uInt[j] = Integer.parseInt(uArr[j]);
				TU += uInt[j];
			}
			for (int k = 0; k < lInt.length; k++) {
				lInt[k] = Integer.parseInt(lArr[k]);
				TL += lInt[k];
			}

			System.out.println(totalTime(M, uInt, lInt, TL, TU));

		}

	}

	private static int totalTime(int m, int[] uInt, int[] lInt, int TL, int TU) {
		if (m == 0) {
			return 0;
		}
//		if (m == 2) {
//			return 2;
//		}

		int dp[] = new int[TL + TU + m];
		// int tLs=TL;
		// int tUs=TU;
		dp[0] = 1;
		int M = m - 1;
		int t = 0;
		t = t + 1;
		int u = 0, l = 0;
		int uB = 0, lB = 0,mb=0;
		while ((TL + TU + M)>0) {

			if (t>0 && t-1 < uInt.length && uInt[t-1] > 0) {
				uInt[t-1] = uInt[t-1] - 1;
				u = 1;
				TU -= 1;
			} else {
				u = 0;
			}

			if (t>0&& (t-1) < lInt.length && lInt[t-1] > 0) {
				lInt[t-1] = lInt[t-1] - 1;
				l = 1;
				TL -= 1;
			} else {
				l = 0;
			}
			
			if (M > 0) {
				M = M - 1;
				mb=1;
			} else {
				mb=0;
			}

			for (int k = t - 1; k > 0; k--) {
				if ((k-1) < uInt.length && uInt[k-1] > 0) {
					uInt[k-1] = uInt[k-1] - 1;
					uB += 1;
					TU -= 1;
				} else {
					uB += 0;
				}
				if ((k-1) < lInt.length && lInt[k-1] > 0) {
					lInt[k-1] = lInt[k-1] - 1;
					lB += 1;
					TL -= 1;
				} else {
					lB += 0;
				}
			}
			
			
			
			//dp[t] = dp[t - 1] + mb + u + l + lB + uB;
			t = t + 1;
			lB = 0;
			uB = 0;
		}

		return t;

	}
}
