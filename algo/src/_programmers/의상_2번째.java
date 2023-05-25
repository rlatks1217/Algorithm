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
		
		int answer = 1;
		//4C1~4C4까지 구할 때는 조합 말고 이걸로 구하는 게 훨씬 효율적이다.
		for (int count : map.values()) {
		    answer *= (count + 1); 
		    //해당 옷 카테고리에서 각 옷들을 선택하는 경우의 수 + 옷 중에서 아무것도 선택하지 않는 경우의 수
		    //ex) 옷 1,2,3이 A라는 카테고리에 속해 있다고 하면 1,2,3을 각각 선택하는 경우와 1,2,3 중 아무것도 선택하는 않는 경우를 포함해서 총 4가지 경우의 수를 곱하게 되는 것이다.
		    //그렇게 되면 카테고리가 여러 개이더라도 아무것도 선택하지 않는 경우의 수를 포함했으므로 해당 카테고리를 선택하지 않으면서 다른 카테고리는 선택하는 경우의 수도 계산할 수 있다.
		}
		
		answer -= 1; //모두 입지 않는 경우의 수 뺌
		System.out.println(answer);
	}


}
