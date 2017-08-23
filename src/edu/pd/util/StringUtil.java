package edu.pd.util;

public class StringUtil {

	public static boolean isUpperCase(char s) {
		if (s >= 65 && s <= 90) {
			return true;
		}
		return false;
	}

	public static  boolean isLowerCase(char s) {
		if (s >= 97 && s <= 122) {
			return true;
		}
		return false;
	}

	public static boolean isDigit(char s) {
		if (s >= 48 && s <= 57) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		System.out.println("isUpper: "+isUpperCase('Z'));
		System.out.println("isLower: "+isLowerCase('z'));
		System.out.println("isDigit: "+isDigit('9'));
	}
}
