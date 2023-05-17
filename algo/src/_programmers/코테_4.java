package _programmers;

import java.util.Stack;

public class 코테_4 {

	public static void main(String[] args) {
		
		System.out.println(solution("abcd"));
	}

	private static int solution(String s) {
		int answer = 0;
		
		Stack<Character> stack = new Stack<Character>();
		
		for (char c : s.toCharArray()) {
			if (stack.isEmpty()) {
				if (c == 'z' || c == 'a') {
					stack.add(c);
				}
			} else {
				if (stack.peek() == 'z') {
					if (c == 'a') {
						answer++;
						stack.pop();
						stack.add(c);
					}
				} else if (stack.peek() == 'a'){
					if (c == 'z') {
						answer++;
						stack.pop();						
						stack.add(c);
					}					
				}
			}
			
		}
		
		return answer;
	}

}
