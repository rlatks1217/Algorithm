package _programmers;

public class 멀리뛰기 {

	public static void main(String[] args) {
		System.out.println(solution(3));
	}

	private static long solution(int n) {
		long answer = 0;
		
		while (n > 0) {
			for (int i = 0; i < 2; i++) {
				n -= i;
				if (n == 0) {
					answer++;
				}
			}
		}
		
		return answer;
	}

}
