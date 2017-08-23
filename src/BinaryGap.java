
public class BinaryGap {

	
	public static void main(String[] args) {
		int n=1376796946;
		String v=Integer.toBinaryString(n);
		
		int count=0;
		int start=0;
		int max=0;
		//10001001001011100100
		for(int i=0;i<v.length();i++){
			if(v.charAt(i)=='1'){
				if(start==1){
					if(max<count){
						max=count;
					}
					count=0;
					continue;
				}
				start=1;
			}else{
				if(start==1){
					count++;
				}
			}
			
			
		}
		System.out.println(max);
				
	}
}
