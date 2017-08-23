
public class BinarySearch {

	public static boolean search(int[] values, int data) {
		int left = 0;
		int right = values.length - 1;

		while (left <=right) {
			int mid = left + (right - left) / 2;
			if (values[mid] == data) {
				return true;
			}

			if (values[mid] > data) {
				right = mid - 1;
			} else if (values[mid] < data) {
				left = mid + 1;
			}
		}

		return false;
	}

	
	public static boolean searchRec(int[] values,int l,int r,int key){
		
		if(l<=r){
			
			int mid=l+(r-l)/2;
			if(values[mid]==key){
				return true;
			}
			
			if(values[mid]>key){
				return searchRec(values,l,mid-1,key);
				
			}
			if(values[mid]<key){
				return searchRec(values,mid+1,r,key);
			}
		}
		
		
		return false;
		 
	}
	public static void main(String[] args) {
		int[] vals = { 1, 2, 5, 4, 2, 7 };
		System.out.println(searchRec(vals, 0,5, 7));
	}
}
