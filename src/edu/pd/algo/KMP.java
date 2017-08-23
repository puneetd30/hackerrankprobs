package edu.pd.algo;

public class KMP {

	private static int[] prefixFunction(String pattern) {
		int i = 1, j = 0;
		int[] prefixFn = new int[pattern.length()];
		while (i < pattern.length()) {
			if (pattern.charAt(i) == pattern.charAt(j)) {
				prefixFn[i] = j + 1;
				i++;
				j++;
			} else if (j > 0) {
				prefixFn[i] = prefixFn[j - 1];
			} else {
				prefixFn[i] = 0;
				i++;
			}
		}
		return prefixFn;
	}

	
	public static boolean isPatternMatch(String T,String P){
		int[] prefixFnArr=prefixFunction(P);
		int i=0,j=0;
		while(i<T.length() && j<P.length()){
			if(T.charAt(i)==P.charAt(j)){
				i++;
				j++;
			}
			else if(j>0)
			{
				j=prefixFnArr[j-1];
			}
			else{
				i++;
			}
			
		}
		if(j==P.length()){
			return true;
		}
		return false;
	}
	
	public static void main(String[] args){
		String T="abababbababababbcsgdsfgydsuygfguysdfguydrfguyeruyfguyerfguyeruferuyfgreuyfgyurefgyuguyrefguerfguyrefguyergfuegrfuerfgeruyfguyerfguyergfuyer";
		String P="ababa";
		 System.out.println(isPatternMatch(T, P));
		
	}
}
