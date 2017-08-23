import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Shopping {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int T = Integer.parseInt(line);
		String[] price;
		String priceVal;
		for (int i = 0; i < T; i++) {
			int N = Integer.parseInt(br.readLine());
			int[][] shop = new int[N][3];
			for (int j = 0; j < N; j++) {
				priceVal = br.readLine();
				price = priceVal.split(" ");
				shop[j][0] = Integer.parseInt(price[0]);
				shop[j][1] = Integer.parseInt(price[1]);
				shop[j][2] = Integer.parseInt(price[2]);
			}
			System.out.println(minCostToShop(shop));
		}
	}

	static int minCostToShop(int[][] shop) {
		int min = Integer.MAX_VALUE;
		int cost = 0;
		int[][] dp = new int[shop.length][3];
		for (int i = 0; i < 3; i++) {
			cost = minCostToShop(shop, 0, i, shop[0][i], dp);
			System.out.println("min= " + min + " cost: " + cost);
			if (min > cost && cost > 0) {
				min = cost;
			}
		}
		return min;
	}

	private static int minCostToShop(int[][] shop, int r, int c, int prevCost,
			int[][] dp) {
		if (r < shop.length) {
			// System.out.println(prevCost);
			int cost = 0;
			if (c == 0) {
				if (r + 1 < shop.length) {
					if (shop[r + 1][c + 1] < shop[r + 1][c + 2]) {
						if (dp[r + 1][c + 1] == 0) {
							dp[r + 1][c + 1] = minCostToShop(shop, r + 1,
									c + 1, shop[r + 1][c + 1], dp);
						} else {
							cost = prevCost + dp[r + 1][c + 1];
						}

					} else {
						if (dp[r + 1][c + 2] == 0) {
							cost = prevCost
									+ minCostToShop(shop, r + 1, c + 2,
											shop[r + 1][c + 2], dp);
						} else {
							cost = prevCost + dp[r + 1][c + 2];
						}
					}
				} else {
					return shop[r][0];
				}
			} else if (c == 1) {
				if (r + 1 < shop.length) {
					if (shop[r + 1][c - 1] < shop[r + 1][c + 1]) {
						if (dp[r + 1][c - 1] == 0) {
							cost = prevCost
									+ minCostToShop(shop, r + 1, c - 1,
											shop[r + 1][c - 1], dp);
						} else {
							cost = prevCost + dp[r + 1][c - 1];
						}

					} else {
						if (dp[r + 1][c + 1] == 0) {
							cost = prevCost
									+ minCostToShop(shop, r + 1, c + 1,
											shop[r + 1][c + 1], dp);
						} else {
							cost = prevCost + dp[r + 1][c + 1];
						}
					}
				} else {
					return shop[r][1];
				}
			} else if (c == 2) {
				if (r + 1 < shop.length) {
					if (shop[r + 1][c - 2] < shop[r + 1][c - 1]) {
						if (dp[r + 1][c - 2] == 0) {
							cost = prevCost
									+ minCostToShop(shop, r + 1, c - 2,
											shop[r + 1][c - 2], dp);
						} else {
							cost = prevCost + dp[r + 1][c - 2];
						}
					} else {
						if (dp[r + 1][c - 1] == 0) {
							cost = prevCost
									+ minCostToShop(shop, r + 1, c - 1,
											shop[r + 1][c - 1], dp);
						} else {
							cost = prevCost + dp[r + 1][c - 1];
						}
					}
				} else {
					return shop[r][2];
				}
			}
			return cost;
		}
		return 0;
	}
	// private static int minCostToShop(int[][] shop, int r, int c) {
	// if (r < shop.length) {
	// int cost = 0;
	// if (c == 0) {
	// if (r + 1 < shop.length) {
	// if (shop[r + 1][c + 1] < shop[r + 1][c + 2]) {
	// System.out.println(shop[r + 1][c + 1]);
	// cost += shop[r + 1][c + 1]
	// + minCostToShop(shop, r + 1, c + 1);
	// } else {
	// System.out.println(shop[r + 1][c + 2]);
	// cost += shop[r + 1][c + 2]
	// + minCostToShop(shop, r + 1, c + 2);
	// }
	// } else {
	// System.out.println(shop[r][0]);
	// return shop[r][0];
	// }
	// } else if (c == 1) {
	// if (r + 1 < shop.length) {
	// if (shop[r + 1][c - 1] < shop[r + 1][c + 1]) {
	// System.out.println(shop[r + 1][c -1]);
	// cost += shop[r + 1][c - 1]
	// + minCostToShop(shop, r + 1, c - 1);
	// } else {
	// System.out.println(shop[r + 1][c +1]);
	// cost += shop[r + 1][c + 1]
	// + minCostToShop(shop, r + 1, c + 1);
	// }
	// } else {
	// System.out.println(shop[r][1]);
	// return shop[r][1];
	// }
	// } else if (c == 2) {
	// if (r + 1 < shop.length) {
	// if (shop[r + 1][c - 2] < shop[r + 1][c - 1]) {
	// System.out.println(shop[r + 1][c -2]);
	// cost += shop[r + 1][c - 2]
	// + minCostToShop(shop, r + 1, c - 2);
	// } else {
	// System.out.println(shop[r + 1][c -1]);
	// cost += shop[r + 1][c - 1]
	// + minCostToShop(shop, r + 1, c - 1);
	// }
	// } else {
	// System.out.println(shop[r][2]);
	// return shop[r][2];
	// }
	// }
	// return cost;
	// }
	// return 0;
	// }
}
