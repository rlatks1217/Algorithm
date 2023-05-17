package _programmers;

public class 문자열나누기 {

	public static void main(String[] args) {
		System.out.println(solution("aaabbaccccabba"));
	}

	private static int solution(String s) {
		int answer = 0; //여태 분해한 문자열 수
		
		char x = s.charAt(0);
		int equal = 0;
		int differ = 0;
		for (int i = 0; i < s.length(); i++) {
			if(x == s.charAt(i)) {
				equal++;
			} else {
				differ++;
			}
			
			if (equal == differ) {
				if (i == s.length()-1) {
					answer++;
					break;
				}
				s = s.substring(i+1, s.length());
				x = s.charAt(0);
				answer++;
				i = -1;
				equal = 0;
				differ = 0;
			} else if (i == s.length() -1) {
				answer++;
			}
		}
		
		return answer;
	}

}

//1. 문제읽고 문제 풀 순서 정리
//2. 순서대로 코드 작성
//3. 조건 마지막으로 맞춰보기
//4. test
