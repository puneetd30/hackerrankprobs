package edu.prob.hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MegaTicTacToe {

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int g=sc.nextInt();
        for(int i=0;i<g;i++)
        {
            int n=sc.nextInt();
            int m=sc.nextInt();
            int k=sc.nextInt();
            char[][] pg=new char[n][m];
            String b=null;
            boolean isConsx=false, isConsO=false;
            int consX=0,consO=0;
            for(int j=0;j<n;j++){
                b=sc.next();
                pg[j]=b.toCharArray();
            }
            for(int x=0;x<n;x++){
                consX=0; consO=0;
                for(int y=0;y<m;y++){
                    if(pg[x][y]=='X'){
                        consX++;
                    }
                    if(pg[x][y]=='O'){
                        consO++;
                    }
                    if(pg[x][y]=='-'){
                        break;
                    }
               }
               if(consX>=k){
                   isConsx=true;
               } 
               if(consO>=k){
                   isConsO=true;
               } 
            }
            for(int x=0;x<m;x++){
                consX=0; consO=0;
                for(int y=0;y<n;y++){
                    if(pg[y][x]=='X'){
                        consX++;
                    }
                    if(pg[y][x]=='O'){
                        consO++;
                    }
                    if(pg[y][x]=='-'){
                        break;
                    }
               }
               if(consX>=k){
                   isConsx=true;
               } 
               if(consO>=k){
                   isConsO=true;
               } 
            }
            
            consX=0; consO=0;
            for(int x=0;x<m;x++){
                
               
                    if(pg[x][x]=='X'){
                        consX++;
                    }
                    if(pg[x][x]=='O'){
                        consO++;
                    }
                    if(pg[x][x]=='-'){
                        break;
                    }
               if(consX>=k){
                   isConsx=true;
               } 
               if(consO>=k){
                   isConsO=true;
               } 
            }
            
            int y=0;
            consX=0; consO=0;
            for(int x=m-1;x>=0;x--){
                if(y<n){
                
                if(pg[y][x]=='X'){
                    consX++;
                }
                if(pg[y][x]=='O'){
                    consO++;
                }
                if(pg[y][x]=='-'){
                    break;
                }
                y++;
              } 
           if(consX>=k){
               isConsx=true;
           } 
           if(consO>=k){
               isConsO=true;
           } 
        }
           if(isConsx && isConsO){
               System.out.println("NONE");
           } else if(isConsx){
               System.out.println("LOSE");
           }else if(isConsO){
               System.out.println("WIN");
           }else{
        	   System.out.println("NONE");
           }
            
        }
    }
}