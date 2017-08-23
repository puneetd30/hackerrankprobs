package pocketmath;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Fibonacci {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String line=br.readLine();
		int n=Integer.parseInt(line);
		System.out.println( fibDP(n));
	}
	
	public static BigInteger fibDP(int x) {
		BigInteger fib[] = new BigInteger[x + 1];
		fib[0] = new BigInteger(""+0);
		fib[1] = new BigInteger(""+1);
		for (int i = 2; i < x + 1; i++) {
			fib[i]=fib[i-1].add(fib[i-2]);
		}
		return fib[x-1];
	}
}
