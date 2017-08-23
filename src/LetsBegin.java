import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LetsBegin {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int T = Integer.parseInt(line);
		for(int i=0;i<T;i++){
			int N=Integer.parseInt(br.readLine());
			System.out.println(noOfPrimes(N));
		}
	}

	static int noOfPrimes(int N) {
		int mod = N % 7;
		int noOfDigits = 0;
		if(N==1){
			return -1;
		}
		if(mod==0){
			return N/7;
		}else if (mod == 1) {
			noOfDigits = (N / 7) - 1 + 2;
		} else if (mod == 2) {
			noOfDigits = (N / 7) - 1 + 1;
		} else if (mod == 3) {
			noOfDigits = (N / 7) - 1 + 1;
		} else if (mod == 4) {
			noOfDigits = (N / 7) - 1 + 2;
		} else if (mod == 5) {
			noOfDigits = (N / 7) - 1 + 1;
		} else if (mod == 6) {
			noOfDigits = (N / 7) - 1 + 2;
		}
		return noOfDigits;
	}
}
