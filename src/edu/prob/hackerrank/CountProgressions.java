//package edu.prob.hackerrank;
//
//
//import java.io.*;
//import java.util.*;
//import java.text.*;
//import java.math.*;
//import java.util.regex.*;
//
//public class CountProgressions {
//
//    public static void main(String[] args) {
//      Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int powerSetSize=(int)Math.pow(2,n);
//        int []a=new int[n];
//        for(int i=0;i<n;i++){
//            a[i]=sc.nextInt();
//        }
//        
//        //Use Powerset to generate all possible sequences 
//        int count=0;
//        for(int j=0;j<powerSetSize;j++){
//            List<Integer> vList=new ArrayList<>();
//            for(int k=0;k<n;k++){
//                if((j & (1<<k))>0){
//                    vList.add(a[k]);      
//                }
//            }
//            if(vList.isEmpty() || vList.size()==1 || vList.size()==2 ){
//                count++;
//            }else{
//                int firstElem=vList.get(0);
//                int d=vList.get(1)-vList.get(0);
//                boolean flag=true;
//                for(int k=1;k<vList.size();k++){
//                    if(firstElem +((k+1)-1)*d==vList.get(k)){
//                        continue;
//                    }else{
//                        flag=false;
//                        break;
//                    }
//                }
//                if(flag){
//                    count++;
//                }
//            }
//            
//        }
//        System.out.println(count);
//    }
//}


package edu.prob.hackerrank;


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CountProgressions {

    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int powerSetSize=(int)Math.pow(2,n);
        int []a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        
        //Use Powerset to generate all possible sequences 
        int count=n+1;
        for(int j=0;j<powerSetSize;j++){
            List<Integer> vList=new ArrayList<>();
            for(int k=0;k<n;k++){
                if((j & (1<<k))>0){
                    vList.add(a[k]);      
                }
            }
            if(vList.size()>2){
                int firstElem=vList.get(0);
                int d=vList.get(1)-vList.get(0);
                boolean flag=true;
                for(int k=1;k<vList.size();k++){
                    if(firstElem +((k+1)-1)*d==vList.get(k)){
                        continue;
                    }else{
                        flag=false;
                        break;
                    }
                }
                if(flag){
                    count++;
                }
            }
            
        }
        System.out.println(count);
    }
}