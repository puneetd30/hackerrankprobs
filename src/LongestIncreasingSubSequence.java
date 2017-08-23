
public class LongestIncreasingSubSequence {

	public static void main(String[] args) {
		 int arr[] = { 10, 22, 9, 33, 21, 50, 41, 60 };
         int n = arr.length;
         System.out.println("Length of lis is " + lis( arr) + "n" );
	}
	
	static int lis(int[] arr){
		int[] lis=new int[arr.length];
		
		for(int i=0;i<arr.length;i++){
			lis[i]=1;
		}
		
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<i;j++){
				if(arr[i]>arr[j] && lis[i]<lis[j]+1){
					lis[i]=lis[j]+1;
				}
				
			}
		}
		
		int max=-1;
		for(int i=0;i<lis.length;i++){
			if(max<lis[i]){
				max=lis[i];
			}
		}
		return max;
	}
}
