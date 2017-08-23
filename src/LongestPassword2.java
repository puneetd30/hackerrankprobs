class LongestPassword2 {
	public static int solution(String S) {
		int max = -1;

		char[] sCharArr = S.toCharArray();
		int uppLetters = 0;
		int splLetters = 0;

		for (int i = 0; i < sCharArr.length; i++) {

			boolean isNumber = isDigit(sCharArr[i]);
			if (!isNumber) {

				boolean isUpper = isUpperCase(sCharArr[i]);
				if (isUpper) {

					uppLetters++;
				} else {

					splLetters++;
				}

				if (uppLetters >= 1 && splLetters >= 0) {
					if (max < (uppLetters + splLetters)) {
						max = uppLetters + splLetters;
					}
				}
			} else {

				if (uppLetters >= 1 && splLetters >= 0) {
					if (max < (uppLetters + splLetters)) {
						max = uppLetters + splLetters;
					}

				}
				uppLetters = 0;
				splLetters = 0;
			}

		}

		return max;
	}

	public static boolean isUpperCase(char s) {
		if (s >= 65 && s <= 90) {
			return true;
		}
		return false;
	}

	public static boolean isDigit(char s) {
		if (s >= 48 && s <= 57) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		System.out.println(solution("$Aa0$Aabc01$aabbAccdd0$aaaAaaabbccdd"));
	}
}