import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CounterGame {

	 public static void main(String[] args) {
	        Scanner sc=new Scanner(System.in);
	        
	       int t=sc.nextInt();
	        long a[]=new long[64];
	        a[0]=1;
	        for(int i=1;i<a.length;i++){
	            a[i]=a[i-1]*2l;
	        }
	        
	        for(int i=0;i<t;i++){
	            long b=sc.nextLong();
	            char nextCurr='L'; 
	            while(b>1){
	               for(int j=0;j<a.length;j++) 
	               {    
	                   if(a[j]==b){
	                       b>>=1; 
	                       break;
	                    }else if(a[j]>b){
	                        b-=a[j-1];
	                       break;
	                    }
	               }
	                    if(nextCurr=='L'){
	                            nextCurr='R';
	                        }
	                        else if(nextCurr=='R'){
	                            nextCurr='L';
	                        }
	                
	                
	            }
	            if(nextCurr=='R'){
	                System.out.println("Louise");
	            }else{
	                System.out.println("Richard");
	            }
	            
	        }

	    }
}