
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class LuckBalance_Greedy {

    public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        int k= in.nextInt();
        
        
        int[] tCases = new int[n-k+1];
        int v=0,u=0;
        int max=0;
        for(int tCases_i=0; tCases_i <n; tCases_i++){
            v=in.nextInt();
            u=in.nextInt();
            if(u==1){
            tCases[tCases_i] = v;
            }else{
                max+=v;
            }
        } 
        Arrays.sort(tCases);
        int a=tCases.length;
        for(int i=0;i<tCases.length;i++){
            if(a>k){
                a--;
                max-=tCases[i];
                continue;
            }else{
                max+=tCases[i];
            }            
            
        }
        System.out.println(max);
    }
}