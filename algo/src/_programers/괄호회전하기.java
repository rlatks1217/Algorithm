package _programers;

public class 괄호회전하기 {

	public static void main(String[] args) {
		System.out.println(solution("[](){}"));
	}

	private static int solution(String s) {
		int answer = 0;

		String rotation = s;
		for (int i = 0; i < s.length(); i++) {
			String beforeRotation = rotation;
			String judge = rotation;
			boolean nonstop = true;			
			//판단
			while (nonstop) {
				if (judge.equals("")) {
					answer++;
				}

				if (judge.contains("()")) {
					judge = judge.replace("()", "");
				} else if (judge.contains("[]")) {
					judge = judge.replace("[]", "");
				} else if (judge.contains("{}")) {
					judge = judge.replace("{}", "");
				} else {
					nonstop = false;
				}
			}
			rotation = beforeRotation.substring(1, beforeRotation.length()) + beforeRotation.charAt(0);
		}
		return answer;
	}

}
//회전하는 로직 꼭 기억하자