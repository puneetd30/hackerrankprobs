package edu.prob.hackerrank.string;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        System.out.println(A.length() + B.length());
        if(A.compareTo(B)==1){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
       char a[]= A.toCharArray();
        int v=a[0]-32;
        a[0]=(char) v;
        String AM=new String(a);
       
        char b[]= B.toCharArray();
        v=b[0]-32;
        b[0]=(char) v;
        String BM=new String(b);
       
        System.out.println(AM+" "+BM);
        System.out.println();
        /* Enter your code here. Print output to STDOUT. */
        
    }
}

