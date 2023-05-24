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
		        return map.get(a).size() - map.get(b).size();
//		        return map.get(b).size() - map.get(a).size(); //밑의 원리에 따라서 내림차순 정렬도 가능
//반환값이 음수인 경우 왼쪽 인자로 들어온 객체를 왼쪽에 배치
//반환값이 양수인 경우 왼쪽 인자로 들어온 객체를 객체를 오른쪽에 배치
//반환값이 0인 경우 두 객체가 같다는 의미
//그래서 기본적으로 (왼쪽 인자 - 오른쪽 인자)했을 때 오름차순 정렬을 하게 되는 것임
		    }
		}.reversed()); //내림차순(b - a를 하게 되면 내림차순 정렬을 하게 되므로 reversed 안 써도 됨)
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
