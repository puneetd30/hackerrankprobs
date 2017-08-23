package com.prep;

public class EfficientStringUniqueChars {

	
	static boolean areChractersUnique(String str)
	{
	    // An integer to store presence/absence
	    // of 26 characters using its 32 bits.
	    int checker = 0;
	 
	    for (int i = 0; i < str.length(); ++i)
	    {
	        int val = (str.charAt(i)-'a');
	        System.out.println(val);
	        // If bit corresponding to current
	        // character is already set
	        if ((checker & (1 << val)) > 0)
	            return false;
	 
	        // set bit in checker
	        checker |=  (1 << val);
	        System.out.println("c:"+checker);
	    }
	 
	    return true;
	}
	
	public static void main(String[] args) {
		System.out.println(areChractersUnique("abcd"));
	}
}
// to check if bit is set, i need a variable & 1<<val(which bit is)
// to set, checker|=1<<val