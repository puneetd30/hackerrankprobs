package com.prep;

//you can write to stdout for debugging purposes, e.g.
//System.out.println("this is a debug message");

class Brackets {
	public static int solution(String S) {
		int openCount = 0, totalOpenCount=0;
		int totalCloseCount = 0;
		for (int i = 0; i < S.length(); i++) {
			if (S.charAt(i) == ')') {
				totalCloseCount++;
				
			}else if(S.charAt(i)=='('){
				totalOpenCount++;
			}

		}
		
		if(totalOpenCount==0 && totalCloseCount==0){
		    return 0;
	    }
		else
		if(totalOpenCount==0){
			return totalCloseCount;
		}else if(totalCloseCount==0){
			return totalOpenCount;
		}

		for (int j = 0; j < S.length(); j++) {
			if (openCount == totalCloseCount) {
				return j;
			}

			char b = S.charAt(j);
			if (b == '(') {
				openCount++;
			} else if (b == ')') {
				totalCloseCount--;
			}
			

		}

		return 0;
	}

	public static void main(String[] args) {
		System.out.println(solution("(())"));

	}
}