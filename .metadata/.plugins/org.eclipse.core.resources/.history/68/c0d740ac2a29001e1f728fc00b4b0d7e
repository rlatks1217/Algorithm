package _programmers중요;

import java.util.HashMap;

public class 성격유형검사하기 {

	public static void main(String[] args) {
		String[] survey = {"AN", "CF", "MJ", "RT", "NA"};
		int[] choices = {5, 3, 2, 7, 5};
 		System.out.println(solution(survey, choices));
	}

	private static String solution(String[] survey, int[] choices) {
		String answer = "";
		
		HashMap<Character, Integer> map = new HashMap<>();
		char[][] arr = {
				{'R', 'T'},	
				{'C', 'F'},	
				{'J', 'M'},	
				{'A', 'N'}	
		};
		
		//점수 합산할 map
		map.put('R', 0);
		map.put('T', 0);
		
		map.put('C', 0);
		map.put('F', 0);
		
		map.put('J', 0);
		map.put('M', 0);
		
		map.put('A', 0);
		map.put('N', 0);
		
		
		for (int i = 0; i < choices.length; i++) {
			
			if (choices[i] >= 4) {
				if (choices[i] == 4) {
					continue;
				}
				map.put(survey[i].charAt(1), map.get(survey[i].charAt(1)) + choices[i] - 4);
			} else {
				int point = 0;
				if (choices[i] == 3) {
					point = 1;
				} else if (choices[i] == 2){
					point = 2;
				}else {
					point = 3;					
				}
				map.put(survey[i].charAt(0), map.get(survey[i].charAt(0)) + point);
			}
		}
		
		for (int i = 0; i < 4; i++) {
			char a = (arr[i][0]);
			char b = (arr[i][1]);
			
			if(map.get(a) >= map.get(b)) {//점수 비교
				if (map.get(a) == map.get(b)) { //점수가 같다면
					if (a < b) {
						answer += a;
					} else {
						answer += b;						
					}
					continue;
				}
				answer += a;
			} else {
				answer += b;
			}
		}
		
		return answer;
	}

}
//정렬 / 4보다 작을 때 점수부여 오류 있었음