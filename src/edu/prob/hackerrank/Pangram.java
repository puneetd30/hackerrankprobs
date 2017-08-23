package edu.prob.hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Pangram {

    public static void main(String[] args) {
       Scanner sc =new Scanner(System.in);
        String v=sc.nextLine().toLowerCase();
        String[] alphas={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u",
                        "v","w","x","y","z"};
        for(int i=0;i<alphas.length;i++){
            
            if(v.indexOf(alphas[i])!=-1){
                continue;
            }else{
                System.out.println("not pangram");
                return;
            }
        }
        
        System.out.println("pangram");
        

    }
}