package _programmers;

import java.util.Arrays;

public class 체육복 {

	public static void main(String[] args) {

		int n = 5;
		int[] lost = { 2, 5 };
		int[] reserve = { 1, 3, 5 };

		System.out.println(solution(n, lost, reserve));
	}

	private static int solution(int n, int[] lost, int[] reserve) {
		int answer = n - lost.length;

		int[] students = new int[n + 1];
		
		Arrays.sort(lost);
		Arrays.sort(reserve);

		for (int i = 0; i < lost.length; i++) {
			students[lost[i]] -= 1;
		}

		for (int i = 0; i < reserve.length; i++) {
			students[reserve[i]] += 2;
		}

		for (int i = 0; i < lost.length; i++) {
			
			if (students[lost[i]] == 1) {
				answer++;
				continue;
			}
			
			if (lost[i] == students.length - 1) {
				if (students[lost[i] - 1] == 2) {
					students[lost[i] - 1] -= 1;
					answer++;
				}
				continue;
			}

			if (students[lost[i] - 1] == 2) {
				students[lost[i] - 1] -= 1;
				answer++;
			} else if (students[lost[i] + 1] == 2) {
				students[lost[i] + 1] -= 1;
				answer++;
			}
		}

		return answer;
	}

}
//끝에 있는 애가 도난 당했을 때 생각 안함
//lost[i]가 마지막 인덱스인 경우를 생각한 것까지는 좋았는데 그 코드가 가장 위에 있는 경우 
//if (lost[i] == students.length - 1) {
//	if (students[lost[i] - 1] == 2) {
//		students[lost[i] - 1] -= 1;
//		answer++;
//	}
//	continue;
//}
// 이 먼저 실행되어 버림 => 이 경우 해당 인덱스값이 1(빌리지 않아도 수업 들을 수 있음)이더라도 이 if문 안으로 들어가서 카운팅이 되지 않으므로 오류가 남