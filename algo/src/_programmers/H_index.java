package _programmers;

import java.util.Arrays;

public class H_index {

	public static void main(String[] args) {
		int[] arr = { 9000, 7000, 10000, 5000, 6000, 3000, 2000, 8000, 4000 };
		System.out.println(solution(arr));
	}

	private static int solution(int[] citations) {
		int max = 0;

		Arrays.sort(citations);
		for (int i = 0; i <= citations[citations.length-1]; i++) {
		//0번부터 세야 함!!!!!!
			int h = i;
			int cnt = 0;

			// h번 이상 인용된 논문의 수 구하기
			for (int c : citations) {
				if (c >= h) { // 인용 수가 h 이상이라면
					cnt++;
				}
			}

			System.out.println(cnt);
			if (h <= cnt) {
				if (citations.length - cnt <= h) {
					max = Math.max(max, h);
				}
			}
		}

		return max;
	}

}