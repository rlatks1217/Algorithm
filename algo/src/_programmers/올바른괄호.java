package _programmers;

import java.util.Stack;

public class 올바른괄호 {

	public static void main(String[] args) {
		String s = "(()(";
		System.out.println(solution(s));
		
	}

	private static boolean solution(String s) {
		boolean answer = false;
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < s.length(); i++) {
			if(stack.isEmpty() || s.charAt(i) == '(') {
				stack.add(s.charAt(i));
				continue;
			}
			
			stack.pop();
			
		}
		
		if (stack.isEmpty()) {
			answer = true;
		}
		
		return answer;
	}

}
