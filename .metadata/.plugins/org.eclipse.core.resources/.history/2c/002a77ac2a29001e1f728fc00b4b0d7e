package _programmers;

import java.util.Arrays;

public class 구명보트 {

	public static void main(String[] args) {
		int[] people = {10, 20, 30, 40, 50, 60, 70, 80, 90};
		int limit = 100;
		System.out.println(solution(people, limit));
	}

	private static int solution(int[] people, int limit) {
		int answer = 0;
		
		Arrays.sort(people);
		
		int max_index = people.length -1;
		int min_index = 0;
		
		while(max_index >= min_index) {
			if(people[max_index] + people[min_index] <= limit) { //양 사이드에 있는 애들(가장 무거운 애 + 가장 가벼운 애)이 같이 탈 수 있는지 확인
				answer++;
				max_index--; 
				min_index++;
				//같이 탈 수 있으면 보트 개수 추가(answer++)/가벼운 애가 한 칸(무거운 쪽으로)/무거운 애가 한 칸(가벼운 쪽으로)
			}
			else {
				answer++;
				max_index--; 
				//아무랑도 탈 수 없으면 무거운 쪽 애만 한 칸 이동
			}
		}
		
		return answer;
	}
	

}

//정렬과 양 사이드에 있는 애들을 비교한다는 아이디어가 key point
