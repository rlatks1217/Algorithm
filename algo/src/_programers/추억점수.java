package _programers;

import java.util.HashMap;

public class 추억점수 {

	public static void main(String[] args) {
		
		String[] name = {"may", "kein", "kain", "radi"};
		int[] yearning = {5, 10, 1, 3};
		String[][] photo = {{"may"},{"kein", "deny", "may"}, {"kon", "coni"}};
		
		HashMap<String, Integer> map = new HashMap<>();
		for (int i = 0; i < name.length; i++) {
			map.put(name[i], yearning[i]);
		}
		
		int[] answer = new int[photo.length];
	 	for (int i = 0; i < photo.length; i++) {
			for (int j = 0; j < photo[i].length; j++) {
				if (map.get(photo[i][j]) != null) {
					answer[i] += map.get(photo[i][j]);
				}
			}
		}
		
	 	for (int i : answer) {
	 		System.out.println(i);
			
		}
 	}

}
