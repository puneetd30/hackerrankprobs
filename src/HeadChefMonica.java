import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class HeadChefMonica {

	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String line = br.readLine();
		int N = Integer.parseInt(line);

		String experts = br.readLine().trim();
		String expertsArr[] = new String[N];

		for (int i = 0; i < N; i++) {
			expertsArr[i] = experts.charAt(i) + "";
		}

		Arrays.sort(expertsArr);

		Map<String, Integer> expertsMap = new HashMap<>();
		int count = 0;

		for (int i = 0; i < expertsArr.length; i++) {
			if ((i + 1) < expertsArr.length
					&& !expertsArr[i].equals(expertsArr[i + 1])) {
				expertsMap.put(expertsArr[i], ++count);
				count = 0;// refresh as next val will be different.
				continue;
			}
			expertsMap.put(expertsArr[i], ++count);
		}

		line = br.readLine();
		int M = Integer.parseInt(line);
		long O = 0;
		for (int i = 1; i <= M; i++) {
			line = br.readLine().trim();
			String[] order = line.split("");
			O = 1l*(expertsMap.get(order[1]) != null ? expertsMap.get(order[1])
					: 0)
					* (expertsMap.get(order[2]) != null ? expertsMap
							.get(order[2]) : 0);
			O = O
					* (expertsMap.get(order[3]) != null ? expertsMap
							.get(order[3]) : 0);
			System.out.println(O % 1000000007);
			if (O != 0) {
				expertsMap.put(order[1], expertsMap.get(order[1]) - 1);
				expertsMap.put(order[2], expertsMap.get(order[2]) - 1);
				expertsMap.put(order[3], expertsMap.get(order[3]) - 1);
			}
		}
	}
}
