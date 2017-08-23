
//you can also use imports, for example:
import java.util.*;

//you can write to stdout for debugging purposes, e.g.
//System.out.println("this is a debug message");

class Brackets {
	public static int solution(String S) {
		Stack<String> stack = new Stack<>();
		if(S.length()%2!=0){
			return 0;
		}
		for (int i = 0; i < S.length(); i++) {

			if (S.charAt(i) == '{' || S.charAt(i) == '[' || S.charAt(i) == '(') {
				stack.push(String.valueOf(S.charAt(i)));
				continue;
			}
			if (!stack.isEmpty() && ((S.charAt(i) == '}' && stack.peek().equals("{"))
					|| (S.charAt(i) == ']' && stack.peek().equals("["))
					|| (S.charAt(i) == ')' && stack.peek().equals("(")))) {
				stack.pop();
			}
		}

		if (stack.empty()) {
			return 1;
		} else {
			return 0;
		}
	}

	public static void main(String[] args) {
		System.out.println(solution("{}{}}"));
	}
}