package _programmers중요;

import java.util.HashSet;

public class 의상 {
	public static int answer = 0;

	public static void main(String[] args) {
		String[][] clothes = {{"yellow_hat","headgear"},{"blue_sunglasses", "eyewear"},{"green_turban","headgear"}};
		solution(clothes);
	}

	private static void solution(String[][] clothes) {
		HashSet<String> set = new HashSet<String>();
		
		for (int i = 1; i <= clothes.length; i++) {
			combination(set, 0, i, clothes);
		}
		
		
		System.out.println(answer);
	}

	private static void combination(HashSet<String> set, int start, int end, String[][] clothes) {
		
		if(end == 0) {
			answer++;
			return;
		}
		for (int i = start; i <= clothes.length - end; i++) {
			if(!set.contains(clothes[i][1])) {
				set.add(clothes[i][1]);
				combination(set, i+1, end-1, clothes);
				set.remove(clothes[i][1]);
			}
			
			
		}
		
	}

}

//set.remove(clothes[i][1]); //가장 안쪽부터 지우게 됨
//효율성 탈락