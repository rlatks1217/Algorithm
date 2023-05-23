package _programmers중요;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class 귤고르기_정렬_map_to_list방법포함 {

	public static void main(String[] args) {
		int k = 6;
		int[] tangerine = { 1, 3, 2, 5, 4, 5, 2, 3 };
		System.out.println(solution(k, tangerine));
	}

	private static int solution(int k, int[] tangerine) {
		int answer = 0;
		
		HashMap<Integer, ArrayList<Integer>> map = new HashMap<Integer, ArrayList<Integer>>();
		for (int i = 0; i < tangerine.length; i++) {
			if (map.get(tangerine[i]) == null) {
				map.put(tangerine[i], new ArrayList<Integer>());				
			}
		}
		
		for (int a : tangerine) {
			map.get(a).add(a);
		}
		ArrayList<Integer> tangerineList = new ArrayList<Integer>();
		for (int a : map.keySet()) {
			tangerineList.add(a);
		}
		
		
		
		//★정렬 코드 기억하기★
		//★정렬 코드 기억하기★
		Collections.sort(tangerineList, new Comparator<Integer>() { //꼭 wrapper Class가 와야 해
		    @Override
		    public int compare(Integer a, Integer b) {
		        return map.get(a).size() - map.get(b).size(); //리스트 안의 list의 크기순으로 정렬
		    }
		}.reversed()); //내림차순
		//★정렬 코드 기억하기★
		//★정렬 코드 기억하기★
		
		
		for (int i = 0; i < tangerineList.size(); i++) {
			int per = map.get(tangerineList.get(i)).size();
			k -= per;
			answer++;
			if (k <= 0) {
				break;
			}
		}
		
		return answer;
	}
}

//::는 Java 8부터 도입된 메서드 참조(Method Reference) 연산자

//map을 list로 만드는 방법
//HashMap<Integer, Integer> map1 = new HashMap<Integer, Integer>();
//List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map1.entrySet());
