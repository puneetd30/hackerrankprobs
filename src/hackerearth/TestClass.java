package hackerearth;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class TestClass {
	public static void main(String args[]) throws Exception {
		int count = 0;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int N = Integer.parseInt(line);
		for (int i = 0; i < N; i++) {
			String str = br.readLine();
			System.out.println(str.length());
			if (str.length() % 2 != 0) {
				continue;
			}
			int countA = countOccurences(str, "A");
			int countB = countOccurences(str, "B");
			if (countA % 2 != 0 || countB % 2 != 0) {
				continue;
			}

			boolean isBubblyA = checkIndex(str, "A");
			boolean isBubblyB = checkIndex(str, "B");
			if (isBubblyA && isBubblyB) {
				System.out.println("ISBUBBLY yes "+str);
				count++;
			}else{
				System.out.println("ISBUBBLY No "+str);
			}
		}

		System.out.println("final:"+count);
	}

	private static int countOccurences(String in, String c) {
		int count = 0;
		for (int i = 0; i < in.length(); i++) {
			if (c.equalsIgnoreCase("" + in.charAt(i))) {
				count++;
			}
		}
		return count;
	}

	private static boolean checkIndex(String in, String c) {
		String next = "";
		int count = 0;
		boolean isBubbly = true;
		for (int i = 0; i < in.length(); i++) {
			if (c.equalsIgnoreCase("" + in.charAt(i))) {
				if (i % 2 == 0) {
					count++;
					if (count % 2 == 0) {
						if (next.equalsIgnoreCase("odd")) {
							isBubbly = false;
							break;
						}
						count = 0;
						next = "";
					} else {
						next = "odd";
					}
				} else if (i % 2 != 0) {
					count++;
					if (count % 2 == 0) {
						if (next.equalsIgnoreCase("even")) {
							isBubbly = false;
							break;
						}
						count = 0;
						next = "";
					} else {
						next = "even";
					}
				}
			}

		}
		return isBubbly;
	}

}
