package edu.prob.hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class OnceInATram {

    static String onceInATram(int x) {
        int x1=x/1000;
        int x2=x%1000;
        int sumX1=(x1%10)+(x1/100)+(x1%100)/10;
        int sumX2=0,l=0,m=0,h=0;
        String y=null;
        // Complete this function
        while(true){
            
            x2=x2+1;
            sumX2=(x2%10)+(x2/100)+(x2%100)/10;
           
            
            if(sumX1==sumX2){
            	 l=(sumX2%10);
                 h=(sumX2/100);
                 m=(sumX2%100)/10;
                 if(l!=0 && m!=0 && h==0){
                     y="0"+m+l;
                 }
                 
                 if(l!=0 && m==0 && h==0){
                     y="0"+"0"+l;
                 }
                if(y!=null){
                    return x1+""+y;
                }
                return x1+""+ x2;
            }
        }
       // return "" + (x%1000);

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        String result = onceInATram(x);
        System.out.println(result);
    }
}
