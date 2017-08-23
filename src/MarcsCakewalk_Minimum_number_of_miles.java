import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MarcsCakewalk_Minimum_number_of_miles {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] calories = new int[n];
        for(int calories_i=0; calories_i < n; calories_i++){
            calories[calories_i] = in.nextInt();
        }
        Arrays.sort(calories);
        long v=0;
        for(int i=0;i<n;i++){
            v+=calories[n-i-1]*(Math.pow(2,i));
            
        }
        
        System.out.println(v);
        // your code goes here
    }
}
