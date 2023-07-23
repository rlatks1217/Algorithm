package _programmers중요;

public class 신규아이디추천 {
	
	public static void main(String[] args) {
		System.out.println(solution("b"));
	}

	private static String solution(String new_id) {
		String answer = "";
		//소문자 치환
		String id = new_id.toLowerCase();
		//조건 안 맞는 문자열 제거
		id = id.replaceAll("[^a-z0-9-_.]", "");
		
		for (int i = 0; i < id.length(); i++) {
			//연속 . 제거
			String dot = "";
			int cnt = 0;
			if (id.charAt(i) == 46) {
				//.이 아닐 때까지 반복
				while (id.charAt(i+cnt) == 46) {
					dot += id.charAt(i+cnt);
					if (id.length()-1 <= i+cnt) {
						break;
					}
					cnt++;
				}
				if (dot.length() >= 2) {
					id = id.replace(dot, ".");
				}
			}
		}
		//처음 끝 . 확인
		if (id.length() != 1) {
			if (id.startsWith(".")) {
				if (id.endsWith(".")) {
					id = id.substring(1, id.length()-1);
				} else {
					id = id.substring(1, id.length());				
				}
			} else if (id.endsWith(".")){
				if (id.startsWith(".")) {
					id = id.substring(1, id.length()-1);
				} else {
					id = id.substring(0, id.length()-1);				
				}
			}
		} else {
			if (id.equals(".")) {
				id = "";
			}
		}
		System.out.println(id);
		
		if (id.equals("")) {
			id = "a";
		} else if (id.length() > 15) {
			id = id.substring(0, 15);
			if (id.endsWith(".")) {
				id = id.substring(0, 14);
			}
		}
		
		if (id.length() <= 2) {
			while(id.length() <= 2) {
				id += id.charAt(id.length()-1);
			}
		}
		
		answer = id;
		return answer;
	}

}
//.의 아스키 코드는 46번이다.
//한 글자만 남는 경우 .하나만 남는 경우도 있지만 .이 아닌 다른 글자가 한 글자만 남는 경우는 생각하지 않음
//왜 안 되는지 생각하고 모든 안 되는 경우에 대해서 해결할 수 있는 로직을 짜야 함