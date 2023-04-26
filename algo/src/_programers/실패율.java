package _programers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class 실패율 {

	public static void main(String[] args) {
		
		int N = 5;
		int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
		
		HashMap<Integer, Double> failPercent = new HashMap<Integer, Double>();
		
		for (int i = 1; i <= N; i++) {
			int reachCount = 0;
			int notClear = 0;
			for (int j = 0; j < stages.length; j++) {
				if (i <= stages[j]) {
					reachCount++;
					if(i == stages[j]) {
						notClear++;
					}
				}
			}
			
			failPercent.put(i, (double)notClear/reachCount);
		}
		
		Object[] fail = failPercent.values().toArray();
		Arrays.sort(fail);
		System.out.println(Arrays.toString(fail));
		int[] answer = new int[N];
		
		int cnt = 0;
		for (Object percent : fail) {
			for (Integer stage : failPercent.keySet()) {
				if ((Double)percent == failPercent.get(stage)) {
					answer[answer.length-(cnt+1)] = stage;
					System.out.println(answer[answer.length-(cnt+1)]);
					cnt++;
					failPercent.remove(stage);
					break;
				}
			}
		}
		
//		System.out.println(Arrays.toString(answer));
		//배열에 담기는 방식만 해결해보자

		
	}

}
