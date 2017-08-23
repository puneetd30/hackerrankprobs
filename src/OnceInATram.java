import java.io.PrintWriter;
import java.util.Scanner;

public class OnceInATram {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
		for(long i = n+1;;i++){
			char[] s = Long.toString(i).toCharArray();
			if(s[0]+s[1]+s[2] == s[s.length-1] + s[s.length-2] + s[s.length-3]){
				System.out.println(new String(s));
				return;
			}
		}
	}
	
//	private static int ni()
//	{
//		int num = 0, b;
//		boolean minus = false;
//		while((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'));
//		if(b == '-'){
//			minus = true;
//			b = readByte();
//		}
//		
//		while(true){
//			if(b >= '0' && b <= '9'){
//				num = num * 10 + (b - '0');
//			}else{
//				return minus ? -num : num;
//			}
//			b = readByte();
//		}
//	}
//	private byte[] inbuf = new byte[1024];
//	public int lenbuf = 0, ptrbuf = 0;
//	private int readByte()
//	{
//		if(lenbuf == -1)throw new InputMismatchException();
//		if(ptrbuf >= lenbuf){
//			ptrbuf = 0;
//			try { lenbuf = is.read(inbuf); } catch (IOException e) { throw new InputMismatchException(); }
//			if(lenbuf <= 0)return -1;
//		}
//		return inbuf[ptrbuf++];
//	}
//	
}
