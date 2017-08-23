
import java.io.*;
	import java.util.*;
	import java.text.*;
	import java.math.*;
	import java.util.regex.*;

public class ParityGame {

	    static int smallestSizeSubsequence(int n, int[] A) {
	        int sum=0;
	       for( int i=0;i<n;i++){
	           sum+=A[i];
	       }
	       if(sum%2==0){
	           return 0;
	       } 
	       
	        int len=999999999;
	        
	        for(int i=0;i<n;i++){
	           int x=A[i];
	            if((sum-x)%2==0){
	              if(len>1){
	                  len=1;
	              }      
	            }
	           for(int k=i+1;k<n;k++){
	               x+=A[k];
	               int y=sum-x;
	               if((y%2)==0){
	                   if(len<(n-k)){
	                       len=n-k;
	                   }
	               }
	               
	           }
	            
	        }
	        if(len==0){
	            return -1;
	        }
	        return len;
	        
	    }

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int[] A = new int[n];
	        for(int A_i = 0; A_i < n; A_i++){
	            A[A_i] = in.nextInt();
	        }
	        int result = smallestSizeSubsequence(n, A);
	        System.out.println(result);
	    }
	}


