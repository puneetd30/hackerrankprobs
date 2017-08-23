package com.prep;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class LeftRotateArray {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n =sc.nextInt();
        int d=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<a.length;i++){
          a[i]= sc.nextInt();
        }
        int[] b=new int[n];
        
        for(int i=0;i<n;i++){
            b[(n+i-d)%n]=a[i];
        }
        
        for(int j=0;j<n;j++){
            System.out.print(b[j]+" ");
        }
        
    }
}

//Scanner scan = new Scanner(System.in);
//int n = scan.nextInt();
//int d = scan.nextInt();
//int[] array = new int[n];
//for(int i=0; i<n;i++) {
//    array[(i+n-d)%n] = scan.nextInt();
//}
//for(int i=0; i<n;i++) {
//    System.out.print(array[i] + " ");
//}      
//
//Sample Input
//
//5 4
//1 2 3 4 5
//
//Sample Output
//
//5 1 2 3 4