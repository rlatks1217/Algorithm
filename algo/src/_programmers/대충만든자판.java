package _programmers;

import java.util.ArrayList;

public class 대충만든자판 {
	public static void main(String[] args) {
		
		String[] keymap = {"ABACD", "BCEFD"};
		String[] target = {"ABCD","AABB"};
		
		System.out.println(solution(keymap, target));
	}

	private static int solution(String[] keymap, String[] target) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for (int i = 0; i < target.length; i++) { //한 단어마다
			
			int finalCount = 0; //한 단어의 총 누른 횟수
			
			for (int j = 0; j < target[i].length(); j++) { //한 단어의 글자마다
				int idx = 0; //while 제어
				String oneWord = "" + target[i].charAt(j); //한 단어 저장
				
				int min = 1000000000;
				boolean find = false;
				while (idx < keymap.length) { //keymap이라는 배열 전체를 돌거야 해당 글자가 포함되어 있는지 찾음
					if (keymap[idx].contains(oneWord)) {
						int count = keymap[idx].indexOf(oneWord) + 1;
						if (min > count) { //최소값보다 작으면
							min = count;
							find = true;
							if (min == 1) {
								break;
							}
						}
					}
					idx++;
				}
				
				if (!find) {
					finalCount = -1;
					break;
				}
				
				finalCount += min;
				min = 0;
				
			}
			list.add(finalCount);
		}
		
		System.out.println(list.toString());
		return 0;
	}
}
//최소값 초기화 신경 쓰자 => 매<글자>마다 초기화해줘야 함
//로직에 대해서 조금 더 구체적으로 머릿속에 그리고 코드를 짤 필요가 있음