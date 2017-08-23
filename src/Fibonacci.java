import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Fibonacci {
static long  fib[] =new long[51];
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String line=br.readLine();
		int n=Integer.parseInt(line);
		System.out.println( fibDP(n));
	}

//	static long fibo( long[] fib, int n) {
//		if(n<0){
//			return 0;
//		}
//		
//		if(n==0 || n==1){
//			return n;
//		}
//		
//		fib[0]=0;
//		fib[1]=1;
//		if(fib[n]!=0){
//			return fib[n];
//		}else{
//		fib[n]=fibo(fib, n-1)+fibo(fib,n-2);
//		return fib[n];
//		}
//	}
	
	public static long fibDP(int x) {
		long fib[] = new long[x + 1];
		fib[0] = 0;
		fib[1] = 1;
		for (int i = 2; i < x + 1; i++) {
			fib[i] = fib[i - 1] + fib[i - 2];
		}
		return fib[x-1];
	}
	
	
//	static  long fibTopDown(int n) {
//		if(n==0) return 0;
//		if(n==1) return 1;
//		if(fib[n]!=0){
//			return fib[n];
//		}else{
//			fib[n] = fibTopDown(n-1) + fibTopDown(n-2);
//			return fib[n];
//		}
//	}
	

}
