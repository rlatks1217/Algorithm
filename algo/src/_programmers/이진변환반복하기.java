package _programmers;

public class 이진변환반복하기 {

	public static void main(String[] args) {
		
		String s = "110010101001";
		System.out.println(solution(s));
	}

	private static int[] solution(String s) {
		int count = 0;
		int change = 0;
		while (true) {
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == '0') {
					count++;
				}
			}
			s = s.replace("0", "");
			int number = s.length();
			s = Integer.toString(number, 2); //2진수로 변환
			
			change++;
			if (s.equals("1")) {
				break;
			}
		}
		
		System.out.println(count + " "+ change);
		int[] answer = {change, count}; 
		return answer;
	}

}
//10진수 => 2진수 변환 : toString
//2진수 => 10진수 변환 : parseInt
