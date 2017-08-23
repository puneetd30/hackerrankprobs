//Given a sorted array (sorted in non-decreasing order) of positive numbers, 
//find the smallest positive integer value that cannot be represented as sum of elements of any subset of given set. 
//
//Input:  arr[] = {1, 3, 6, 10, 11, 15};
//Output: 2
//
//Input:  arr[] = {1, 1, 1, 1};
//Output: 5
//
//Input:  arr[] = {1, 1, 3, 4};
//Output: 10
//
//Expected time complexity is O ( n ).


package test.lazada;

public class TestSortedNumbers {

	
	public static void main(String[] args) {
//		int  arr[] = {1, 3, 6, 10, 11, 15};
//		int sum=0;
//		for(int i=0;i<arr.length-1;i++){
////			int diff =arr[i+1]-arr[i];
////			if(diff>1){
////				System.out.println(arr[i]+1);
////				break;
////			}else if(diff ==0){
////				int sum=arr[i]+arr[i+1];
////				
////				
////			}
//			sum+=arr[i];
//			
		
		class A{
			private final Object monitor=new Object();
			public void runA(){
				synchronized (monitor) {
					try{
						monitor.wait();
					}catch(InterruptedException e){
						System.err.println(e.getLocalizedMessage());
					}
					
				}
			}
		}
			
		A a=new A();
		a.runA();
			
		//}
	}
	
	
	
}


class Exception1 extends Exception{};
class Exception2 extends Exception{};
class Exception3 extends Exception{};

class M{}
class Z extends M{}
class X{
	protected M foo() throws Exception1,Exception2{ return null;};
}
class Y1 extends X{
	protected Z foo() throws Exception1{ return null;};
}

class Y2 extends X{
	protected M foo() throws Exception1,Exception2{ return null;};
}