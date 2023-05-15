package _programers;

import java.util.Arrays;

public class 숫자짝꿍 {

	public static void main(String[] args) {
		
		System.out.println(solution("12321", "42531"));
	}

	private static String solution(String x, String y) {
		
		
		String answer = "";
		
		int start = 0;
		int zeroCount= 0;
		for (int i = 0; i < x.length(); i++) {
			char c = x.charAt(i);
			for (int j = start; j < y.length(); j++) {
				if (y.charAt(j) == c) {
					answer += c;
					start = j+1;
					if (c ==48) {
						zeroCount++;
					}
					break;
				}
			}
		}
		
		if (answer.equals("")) {
			return "-1";
		}
		
		if (answer.length() == zeroCount) {
			return "0";
		}
		
		char[] arr = answer.toCharArray();
		Arrays.sort(arr);
 		StringBuilder sb = new StringBuilder(String.valueOf(arr));
		
		return sb.reverse().toString();
	}

}
