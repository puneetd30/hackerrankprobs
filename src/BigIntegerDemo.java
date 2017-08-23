
import java.math.*;

public class BigIntegerDemo {

public static void main(String[] args) {

        // create 2 BigInteger objects
        BigInteger bi1, bi2;

        bi1 = new BigInteger("123");
        bi2 = new BigInteger("123");

        // create 2 boolean objects
        Boolean b1, b2;

        // compare bi1 with bi2
        b1 = (bi1==bi2);

	// compare bi1 with an object value 123, which is not a BigIntger
        b2 = bi1.equals("123");

        String str1 = bi1 + " equals BigInteger " + bi2 + " is " +b1;
//	String str2 = bi1 + " equals object value 123 is " +b2;

	// print b1, b2 values
        System.out.println( str1 );
//        System.out.println( str2 );
    }
}