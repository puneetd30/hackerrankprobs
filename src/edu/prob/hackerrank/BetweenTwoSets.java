package edu.prob.hackerrank;


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BetweenTwoSets {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] b = new int[m];
        for(int b_i=0; b_i < m; b_i++){
            b[b_i] = in.nextInt();
        }
        
        Arrays.sort(a);
        Arrays.sort(b);
        
        int[] l;
        int[] g;
        int count=0;
        if(a[a.length-1]< b[0]){
            l=a;
            g=b;
        }else{
            l=b;
            g=a;
        }
        
        for(int k=l[l.length-1];k<=g[0];k++)
        {    boolean l_end=true;
             boolean g_end=true;
        
            for(int i=0;i<l.length;i++){
                if(k%l[i]==0){
                    continue;
                }else{
                    l_end=false;
                    break;
                }
            }
        
        for(int j=0;j<g.length;j++){
            if( g[j]%k==0){
                continue;
            }else{
                g_end=false;
                break;
            }
        }
        
        
        if(l_end &&  g_end){
            count++;
        }
        
      }     
     System.out.println(count);   
    }
}

