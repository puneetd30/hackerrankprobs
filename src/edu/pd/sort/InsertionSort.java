package edu.pd.sort;

import java.io.*;
import java.util.*;

public class InsertionSort {

    public static void insertionSortPart2(int[] ar)
    {       int j=0;
            int e=0;
          for(int i=1;i<=ar.length-1;i++){
              j=i;
              e=ar[i];
              while((j-1)>=0 && ar[j-1]>e){
                  
                  ar[j]=ar[j-1];
                  j--;
                 
              }
              
              ar[j]=e;
               printArray(ar);    
          }
    }  
    
    
      
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       int s = in.nextInt();
       int[] ar = new int[s];
       for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
       }
       insertionSortPart2(ar);    
                    
    }    
    private static void printArray(int[] ar) {
      for(int n: ar){
         System.out.print(n+" ");
      }
        System.out.println("");
   }
}


