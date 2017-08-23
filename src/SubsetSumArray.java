public class SubsetSumArray {

	public static void main(String[] args) {
		int a[] = { 9, 8, 1,2,5,3 };
		int[] res = subset(a, 12);
		for (int i = 0; i < res.length; i++) {
			if (res[i] != 0) {
				System.out.print(res[i] + ",");
			}
		}
	}

	public static int[] subset(int a[], int sum) {
		int[] emptyArr = new int[1];
		emptyArr[0] = -1;
		if (a.length == 0) {
			return emptyArr;
		}
		if (sum < 0) {
			return emptyArr;
		}

		int[] res = new int[a.length];
		return subsetRec(a, 0, sum, res);
	}

	private static int[] subsetRec(int a[], int index, int sum, int[] res) {
		if (index < a.length) {
			if (sum - a[index] == 0) {
				res[index] = a[index];
				return res;
			}
			if (sum - a[index] > 0) {
				res[index] = a[index];
				return  subsetRec(a, index+1, sum - a[index], res);
			}

			return subsetRec(a, index+1, sum, res);
		}
		
			return res;
		

	}
}
