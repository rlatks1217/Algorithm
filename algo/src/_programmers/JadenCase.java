package _programmers;

public class JadenCase {

	public static void main(String[] args) {
		String s = "3people unFollowed me";
		System.out.println(solution(s));
	}

	private static String solution(String s) {
		String answer = "";
		if (s.charAt(0) >= 'a') {
			answer += Character.toString(s.charAt(0) - 32);
		}else {
			answer += s.charAt(0);
		}
		
		for (int i = 1; i < s.length(); i++) {
			
			if (s.charAt(i) >= 'a') {
				if (s.charAt(i-1) == ' ') {
					answer += Character.toString(s.charAt(i) - 32);
				}else {
					answer += s.charAt(i);					
				}
			}else {
				if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
					if (s.charAt(i-1) == ' ') {
						answer += s.charAt(i);																
					} else {
						answer += Character.toString(s.charAt(i) + 32);											
					}
				} else {
					answer += s.charAt(i);										
				}
			}
		}
		
		return answer;
	}

}