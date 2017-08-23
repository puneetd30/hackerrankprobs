package com.prep2;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class RepeatedString {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        long n = in.nextLong();
        if(s.length()==1 ){
             if(s.charAt(0)=='a'){
               System.out.println(n);
             }else{
               System.out.println(0);
             }
            return;
        }
        
        int aCount=0;
        int sLen=s.length();
        long curr=n;
        String sv="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'){
                aCount++;              
            }
//            if(curr-sLen>=0){
//                sv+=s;
//            }else{
//                sv+=s.substring(0,(int)curr);
//                break;
//            }
//            curr-=sLen;
        }
        
        long c=n/sLen;
        long e=n%sLen;
        long d=aCount*c;
        
        for(int i=0;i<e;i++){
            if(s.charAt(i)=='a'){
                d++;              
            }
        }
        System.out.println(d);
    }
}