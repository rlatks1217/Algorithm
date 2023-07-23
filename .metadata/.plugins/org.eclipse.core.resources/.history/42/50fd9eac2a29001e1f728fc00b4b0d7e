package _programmers;

import java.util.Arrays;

public class 가장가까운같은글자 {

	public static void main(String[] args) {
		String s = "banana";
		System.out.println(solution(s));
	}

	private static int[] solution(String s) {
		int[] answer = new int[s.length()];
		
		answer[0] = -1;
		
		for (int i = 1; i < s.length(); i++) {
			boolean find = false;
			
			String a = s.substring(0, i+1); //i+1을 해야 i까지 짤린다
			char word = a.charAt(a.length()-1);
			
			for (int j = i-1; j >= 0; j--) {
				if (s.charAt(j) == word) {
					int gap = (a.length()-1) - j;
					answer[i] = gap;
					find = true;
					break;
				}
			}
			
			if(!find) {
				answer[i] = -1;
			}
		}
		
		System.out.println(Arrays.toString(answer));
		return answer;
	}

}
