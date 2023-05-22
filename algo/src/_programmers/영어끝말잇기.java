package _programmers;

import java.util.HashMap;

public class 영어끝말잇기 {

	public static void main(String[] args) {
		int n = 3;
		String[] words = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
		System.out.println(solution(n, words));
		
	}

	private static int[] solution(int n, String[] words) {
		
		HashMap<String, Integer> map = new HashMap<>();
		
		int turn = 0;
		int cnt = 0;
		for (int i = 0; i < words.length; i++) {
			if (cnt == 0) {
				turn++;
			}
			cnt++;
			if (i == 0) {
				map.put(words[i], 0);
				continue;
			}

			if (words[i-1].charAt(words[i-1].length()-1) != words[i].charAt(0)) {
				break;
			}else if (map.containsKey(words[i])) {
				break;
			}else {
				map.put(words[i], 0);
			}
			
			if (cnt == n) {
				cnt = 0;
			}
		}
		
		if (cnt == 0) {
			turn = 0;
		}
		
		System.out.println(turn + " " + cnt);
		return null;
	}

}
//문제 읽으면서 어떤 것들 신경써야 되는지 적으면서 읽자