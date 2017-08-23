import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MinAbsDifference {

    static int minimumAbsoluteDifference(int n, int[] arr) {
        Arrays.sort(arr);
        int diff=0;
       int min=Integer.MAX_VALUE;
       for(int i=0;i<arr.length-1;i++) {
               diff=Math.abs(arr[i]-arr[i+1]);
               min=Math.min(min, diff);
       }
        
        return min;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            int v=in.nextInt();
            arr[arr_i] =v;
        }
        int result = minimumAbsoluteDifference(n, arr);
        System.out.println(result);
        in.close();
    }
}
