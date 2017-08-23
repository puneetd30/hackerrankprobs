
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class FairCuttingCake {

    static long howManyToInvite(long A, long B, long a) {
        double Ad=A*1.0;
        double Bd=B*1.0;
        
        double AdBd=Ad/Bd;
        double val=0.0;        
            val=a/AdBd;
        return (long)val;
        // Return the number of people Leha should invite to his party
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long A = in.nextLong();
        long B = in.nextLong();
        long a = in.nextLong();
        long b = howManyToInvite(A, B, a);
        System.out.println(b);
        in.close();
    }
}
