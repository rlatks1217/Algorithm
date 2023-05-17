package _programmers;

public class 둘만의암호 {

	public static void main(String[] args) {
		System.out.println(solution("zzzzz", "a", 5));
	}

	private static String solution(String s, String skip, int index) {
		String answer = "";
		
		for (int i = 0; i < s.length(); i++) {
			char a = s.charAt(i);
			for (int j = 0; j < index; j++) {
				//index 1 더함
				a += 1;
				if (a > 122) {
					a -= 26; 
				}				
				if (skip.contains(Character.toString(a))) {
					j--;
				}
			}
			
			answer += a;
		}
		return answer;
	}

}
