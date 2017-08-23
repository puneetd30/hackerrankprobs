package edu.pd.algo;

public class SieveOfEratosthenes {


	public static void main(String args[]){
		
		int arr[]=genPrimes(100000000);
		for(int i=0;i<arr.length;i++){
			if(arr[i]>0){
				System.out.println(i);
			}
		}
		
		System.out.println(countPrimes(arr,2500));
		
	}
	
	private static int countPrimes(int[] arr,int n) {
		int i, count=0;
		for(i=2;i<=n/2;i++){
			if(arr[i]>0 && arr[n-i]>0){
				count++;
			}
		}
		return count;
	}

	private static int[] genPrimes(int MAX){
		int[] arr=new int[MAX];
		int i,j;
		for(i=0;i<MAX;i++){
			arr[i]=1;
		}
		for(i=2;i<=Math.sqrt(MAX);i++){
			if(arr[i]>0){
				for(j=i;j*i<MAX;j++){
					arr[i*j]=0;
				}
			}
		}
		
		return arr;
	}
	
	private static int[] genPrime(int Max){
		int a[]=new int[Max];
		int i,j;
		
		for(i=0;i<Max;i++){
			a[i]=1;
		}
		
		for(i=2;i<=Math.sqrt(Max);i++){
			if(a[i]>0){
				for(j=i;j*i<=Max;j++){
					a[i*j]=0;
					
				}
				
				
			}
			
			
			
		}
		return a;
	}

}

