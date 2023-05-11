package _programers;

import java.util.HashMap;

public class 코테_1 {

	public static void main(String[] args) {
		
		int[] waiting = {1,5,8,2,10,5,4,6,4,8};
		
		solution(waiting);
	}

	private static int[] solution(int[] waiting) {
		
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for (int number : waiting) {
			map.put(number, 0);
		}
		
		int[] answer = new int[map.size()];
		
		int cnt = 0;
		for (int i = 0; i < waiting.length; i++) {
			if (map.containsKey(waiting[i])) {
				answer[cnt] = waiting[i];
				map.remove(waiting[i]);
				cnt++;
			}
			if (cnt == map.size()) {
				return answer;
			}
		}
		
		
		return answer;
	}

}
