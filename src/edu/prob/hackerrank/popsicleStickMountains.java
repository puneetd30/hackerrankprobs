package edu.prob.hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class popsicleStickMountains {

    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         int t= sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            System.out.println(catalanNumber(n));            
        
        }
    }
    
   static long catalanNumber(int n) {
        if(n==0 || n==2 ) return 1;
        int count=0;
        for(int i=0;i<=n;i+=2){
        	count+=catalanNumber(i)*catalanNumber(n-i);
        }
        return count;
    }
}