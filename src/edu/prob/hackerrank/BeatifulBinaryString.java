package edu.prob.hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BeatifulBinaryString {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        char[] B = in.next().toCharArray();
        
        if(n==1 || n==2){
            System.out.println(0);
            return;
        }
        int count=0, j=0;
        String v="010";
        for(int i=0;i<B.length;i++){
            if(v.charAt(j)==B[i]){
                j++;
            }else{
                j=0;
                if(v.charAt(j)==B[i]){//recheck for 0010
                	j++;
                }
            }
            
            if(j==3){
                   B[i]=(char)1;    
                   count++;
                   j=0;
            }
        }
        
        System.out.println(B);
        System.out.println(count);
        
    }
}

