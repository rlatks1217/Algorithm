package _programmers;

import java.util.HashSet;
import java.util.Set;

public class 연속부분수열합의개수 {

	public static void main(String[] args) {
		int[] elements = { 7, 9, 1, 1, 4 };
		System.out.println(solution(elements));
	}

	private static int solution(int[] elements) {
		Set<Integer> set = new HashSet<>();

		int k = 0; //횟수를 나타냄
		while (k <= elements.length) {
			for (int i = 0; i < elements.length; i++) {
				int sum = 0;

				for (int j = i; j < i + k; j++) { //k만큼 더해준다(k가 부분수열의 길이를 의미함)
					sum += elements[j % elements.length]; 
					//여기가 포인트!!(4가 마지막 요소이므로 4 다음에는 j가 5가 될 것임 => 5%5(elements.length)= 0이므로 다시 0으로 돌아가게 된다.
				}
				set.add(sum); //부분수열에서 나올 수 있는 합이므로 다른 길이의 부분수열이더라도 합이 같다면 중복처리를 해줘야 함
			}
			k++;
		}
		
		
		System.out.println(set);
		return set.size() - 1; 
		//-1을 해주는 이유는 처음에 가장 내부에 있는 for문이 동작하지 않기 때문에 아무 합산도 이뤄지지 않은 sum(0을 값으로 가지고 있음)이 set에 추가되기 때문에 그 부분을 제외하려고 빼는 것임
	}

}
