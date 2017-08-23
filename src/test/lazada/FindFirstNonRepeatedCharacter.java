//Please write a program for  the first non repeated character in a string , for example :
//
//If the word "stress" is input  then it should print  't'   as output .
//
//If the word "teeter" is input  then it should print  'r'   as output .
//
//Now , we should understand the pseudo algorithm or logic to achieve this task , code is given in the end of this post .

package test.lazada;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class FindFirstNonRepeatedCharacter {

	public static void main(String[] args) {
		Map<String, Integer> valMap = new LinkedHashMap<>();

		String val = "Stress".toLowerCase();

		for (int index = 0; index < val.length(); index++) {
			String inputVal = String.valueOf(val.charAt(index));
			valMap.put(inputVal, valMap.containsKey(inputVal) ? valMap.get(inputVal) + 1 : 1);
		}

		Set<String> values = valMap.keySet();
		for (String s : values) {
			if (valMap.get(s).equals(new Integer(1))) {
				System.out.println(s);
				break;
			}
		}

	}

	public static <K,V> Map<K,V> lruCache(final int maxSize) {
	    return new LinkedHashMap<K, V>(maxSize*4/3, 0.75f, true) {
	        @Override
	        protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
	            return size() > maxSize;
	        }
	    };
	}
	
	public String reverse(String str) {  
	    // exit or termination condition  
	    if ((null == str) || (str.length( )  <= 1)) {  
	        return str;  
	    }  
	          
	    // put the first character (i.e. charAt(0)) to the end. String indices are 0 based.   
	    // and recurse with 2nd character (i.e. substring(1)) onwards    
	    return reverse(str.substring(1)) + str.charAt(0);  
	}  
}
