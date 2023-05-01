package _programers;

import java.util.Arrays;

public class 완주하지못한선수 {

	public static void main(String[] args) {

		String[] participant = {"mislav", "stanko", "mislav", "ana"};
		String[] completion = {"stanko", "ana", "mislav"};
		
		Arrays.sort(participant);
		Arrays.sort(completion);
		
		String answer = "";
		for (int i = 0; i < participant.length; i++) {
			if (i < participant.length-1 && !(participant[i].equals(completion[i]))) {
				answer = participant[i];
				break;
			} else {
				answer = participant[i];
			}
			
		}
		
		System.out.println(answer);

	}

}
//UnsupportedOperationException : array에서 list로 바꾼 자료구조는 삭제하거나 변경할 수 없음
//정렬을 하게 되면 하나의 인덱스를 제외하고 나머지 인덱스는 모두 인덱스에 해당하는 값이 서로 같다는 것을 이용
