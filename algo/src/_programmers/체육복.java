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
//잃어버린 애들 중에서 for문 도는 것이므로 1인지를 먼저 체크해야 함
//각 if문을 완료한 다음에는 밑의 코드가 실행되지 않게 하기 위해 continue 필요



//sort를 안했을때 오답이 나오는 반례
//학생 4인
//분실 2인 [3,1]
//여분 2인 [2,4]
//
//sort를 안하게되면 2번 학생의 여분을 3번학생에게 전달하여 분실 1번, 여분 4번 두명의 학생이 체육복 전달을 못하게됩니다