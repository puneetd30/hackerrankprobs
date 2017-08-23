/* IMPORTANT: Multiple classes and nested static classes are supported */

import java.io.BufferedReader;
import java.io.InputStreamReader;

class SumOfGCD {
	public static void main(String args[]) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int N = Integer.parseInt(line);
		// hold inputs and convert
		String[] listOfNos = br.readLine().split(" ");
		// for DP
		int gcdSum[] = new int[1000000];

		int Q = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < Q; i++) {
			String[] queryType = br.readLine().split(" ");
			int p = Integer.parseInt(queryType[1]);
			int q = Integer.parseInt(queryType[2]);
			
			if (queryType[0].equals("C")) {
				for (int m = p; m <= q; m++) {
					
					if (gcdSum[Integer.parseInt(listOfNos[m-1])] > 0) {
						continue;
					}
					int k = Integer.parseInt(listOfNos[Integer
							.parseInt(queryType[m]) - 1]);
					for (int j = k; j >= 1; j--) {
						gcdSum[k] += gcd(j, k);
					}
				}
				int sum=0;
					for(int l=p;l<=q;l++){
						sum+=gcdSum[Integer.parseInt(listOfNos[l-1])];
					}
					System.out
							.println(sum % 100000007);
			} else {
				listOfNos[p-1] = "" + q;
			}
		}

	}

	static int gcd(int a, int b) {
		return b == 0 ? a : gcd(b, a % b);
	}
}
