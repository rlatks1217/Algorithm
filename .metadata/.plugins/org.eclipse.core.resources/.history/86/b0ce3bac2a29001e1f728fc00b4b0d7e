package _programmers중요;

import java.util.Arrays;
import java.util.HashMap;

public class 달리기경주 {

	public static void main(String[] args) {
		String[] players = {"mumu", "soe", "poe", "kai", "mine"};
		String[] callings = {"kai", "kai", "mine", "mine"};
 		System.out.println(Arrays.toString(solution(players, callings)));
	}

	private static String[] solution(String[] players, String[] callings) {
		String[] answer = {}; 
		
		HashMap<String, Integer> map = new HashMap<>();
		
		for (int i = 0; i < players.length; i++) {
			map.put(players[i], i);
		}
		
		for (int i = 0; i < callings.length; i++) {
			String player1 = players[map.get(callings[i])]; 
			String player2 = players[map.get(callings[i])-1];
			players[map.get(callings[i])] = player2;
			players[map.get(callings[i])-1] = player1;
			
			map.put(player2, map.get(callings[i]));
			map.put(player1, map.get(callings[i])-1);
		}
		
		answer = players;
		
		return answer;
	}

}
