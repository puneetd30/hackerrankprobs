
public class GCD {

	static int gcd(int a, int b) {
		return b == 0 ? a : gcd(b, a % b);
	}
}
