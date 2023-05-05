package _programers;

import java.util.HashMap;

public class 전화번호목록 {

	public static void main(String[] args) {
		
		String[] phone_book = {"119","97674223","1195524421"};
		System.out.println(solution(phone_book));
	}
	
    public static boolean solution(String[] phone_book) {
        boolean answer = true;
        
        HashMap<String, Integer> map = new HashMap<>();
        
        for (String string : phone_book) {
			map.put(string, 0);
		}
        
        for (int i = 0; i < phone_book.length; i++) {
			for (int j = 1; j < phone_book[i].length(); j++) {
				String a = phone_book[i].substring(0 ,j);
				if (map.containsKey(a)) {
					return false;
				}
			}
		}
        
        
        return answer;
    }

}


//1. 전체 loop를 다 도는 것이 아니라 정렬을 한 후 일부분만 반복하도록 만들기
//2. Map 자료구조를 활용하여 담고 반복문 돌리기(검색 속도 향상)
// Arrays.sort(phone_book, Comparator.comparing(String::length)); : 배열 정렬
// 기본 for문보다 for each문이 더 빠름
// treeSet도 유용한 자료구조임(저장된 데이터를 자동으로 오름차순 정렬하여 가지고 있음 => 내림차순 정렬을 하고 싶을 경우 TreeSet<>(Collections.reverseOrder()); 라고 작성하면 됨
