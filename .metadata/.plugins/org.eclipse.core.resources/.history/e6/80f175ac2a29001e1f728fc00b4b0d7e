package _programmers;


public class 옹알이2 {

	public static void main(String[] args) {
		String[] babbling = {"wooawoo", "yeayaye", "woowoo", "ayaaya"};
 		System.out.println(solution(babbling));
 		
	}

	private static int solution(String[] babbling) {
		int answer = 0;
		String[] bab = {"aya", "ye", "woo", "ma"};
		
		for (String string : babbling) {
			if (string.contains("ayaaya") || string.contains("yeye") || string.contains("woowoo") || string.contains("mama")) {
				continue;
			}
			
			for (int i = 0; i < bab.length; i++) {
				if (string.contains(bab[i])) {
					string = string.replace(bab[i], " ");
				}
			}
			
			string =string.replace(" ", "");
			if (string.equals("")) {
				answer++;
			}
		}
		
		return answer;
	}

}

//ymae에서 ""로 replace할 경우에는 ye가 되므로 다음 loop에서 발음할 수 있는 것처럼 처리하게 됨
//replaceFirst("문자열", "바꿀 문자열") : 해당 문자열을 하나만 바꾼다.
//문제에서 배열인 매개변수의 요소들은 중복되지 않는다는 말이 없으면 set 쓰는 것은 위험함!
