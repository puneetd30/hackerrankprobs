package edu.prob.hackerrank;
//
//import java.io.*;
//import java.util.*;
//import java.text.*;
//import java.math.*;
//import java.util.regex.*;
//
//public class DigitMinMax {
//
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int l=sc.nextInt();
//        int h=sc.nextInt();
//        if(l<=100 && h<=100){
//            System.out.println(0);
//            return;
//        }
//        String[] vArr=new String[h-l+1];
//        int t=l;
//        for(int i=0;i<(h-l+1);i++){
//            vArr[i]=""+t;
//            t++;
//        }
//        int min=0,max=0;
//        for(int j=0;j<(h-l+1);j++){
//            int m=vArr[j].length()-2;   
//            for(int k=1;k<=m;k++){
//                char c=vArr[j].charAt(k);
//                if(c>vArr[j].charAt(k-1) && c>vArr[j].charAt(k+1)){
//                    max++;
//                }
//                if(c<vArr[j].charAt(k-1) && c<vArr[j].charAt(k+1)){
//                    min++;
//                }
//            }
//            
//            
//        }
//       System.out.println(min+max); 
//    }
//}

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DigitMinMax {

   public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long l=sc.nextInt();
        long h=sc.nextInt();
        if(l<=100 && h<=100){
            System.out.println(0);
            return;
        }
        List<String> vArr=new ArrayList<>();
        long t=l;
        for(int i=0;i<(h-l+1);i++){
            vArr.add(""+t);
            t++;
        }
        int min=0,max=0;
        for(int j=0;j<(h-l+1);j++){
            int m=vArr.get(j).length()-2; 
            
            for(int k=1;k<=m;k++){
                char c=vArr.get(j).charAt(k);
                if(c>vArr.get(j).charAt(k-1) && c>vArr.get(j).charAt(k+1)){
                    max++;
                }
                if(c<vArr.get(j).charAt(k-1) && c<vArr.get(j).charAt(k+1)){
                    min++;
                }
            }
            
            
        }
       System.out.println(min+max); 
    }
}