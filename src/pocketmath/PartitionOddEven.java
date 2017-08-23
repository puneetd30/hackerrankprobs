package pocketmath;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PartitionOddEven {
	public static final String COMMA=",";
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String line = br.readLine();
		String[] arrString = line.split(COMMA);
		StringBuilder evenArr = new StringBuilder(), oddArr = new StringBuilder();

		if (arrString.length == 0) {
			System.out.println(0);
			return;
		}

		for (int i = 0; i < arrString.length; i++) {
			if (Integer.parseInt(arrString[i]) % 2 == 0) {
				evenArr.append(arrString[i]);
				evenArr.append(COMMA);
			} else {
				oddArr.append(arrString[i]);
				oddArr.append(COMMA);
			}
		}

		boolean isEven = false;

		if (evenArr.length() > 0) {
			isEven = true;
			System.out.print(evenArr.substring(0, evenArr.length() - 1));
		}

		if (oddArr.length() > 0) {
			if (isEven) {
				System.out.print(COMMA);
			}
			System.out.print(oddArr.substring(0, oddArr.length() - 1));
		}

	}

}
