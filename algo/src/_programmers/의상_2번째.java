package _programmers;

import java.util.HashMap;

public class 의상_2번째 {

	public static void main(String[] args) {
		String[][] clothes = {{"yellow_hat","headgear"},{"blue_sunglasses", "eyewear"},{"green_turban","headgear"}};
		solution(clothes);
	}

	private static void solution(String[][] clothes) {
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		//옷 종류 세기
		for (int i = 0; i < clothes.length; i++) {
			if(map.containsKey(clothes[i][1])) {
				map.put(clothes[i][1], map.get(clothes[i][1])+1);
			}else {
				map.put(clothes[i][1], 1);
			}
		}
		int result = 0;
		
	}

}
