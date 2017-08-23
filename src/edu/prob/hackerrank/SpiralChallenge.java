package edu.prob.hackerrank;



import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SpiralChallenge {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        char[][]v=new char[n][m];
        
        String t=null;
        
        for(int i=0;i<n;i++){
            t=sc.next();
            v[i]=t.toCharArray();
        }
        StringBuilder sb=new StringBuilder();
        
        int p=n*m;int z=0;
        int s=0;
        int i=0,j=0,k=0,l=0;
        while(p>0){
            for(i=n-(s+1);i>=s && p>0;i--){
                sb.append(v[i][s]);
                p--;   
            }
            i=i+1;
            for(j=i+1;j<m-i && p>0;j++){
                sb.append(v[i][j]);
                p--;
            }
            j=j-1;
            for(k=i+1;k<n-i&& p>0;k++){
                sb.append(v[k][j]);
                p--;
            }
            
            for(l=j-1;l>i&& p>0;l--){
                sb.append(v[k-1][l]);
                p--;
            }
            
            s++;
            
        }
        String[] g=sb.toString().split("#");
        
        for(int b=0;b<g.length;b++){
        	if(g[b].length()>0){
        		
        		z++;
        	}
        	
        }
        
        System.out.println(z);
    }
    
    
}