package _programmers;

public class 피보나치수 {

	public static void main(String[] args) {
		System.out.println(solution(5));
	}

	private static int solution(int n) {
		int answer =0;
		long[] arr = new long[n+1];
		arr[0] = 0;
		arr[1] = 1;
		for (int i = 2; i <= n; i++) {
			arr[i] = (arr[i-1]%1234567 + arr[i-2]%1234567);
		}
		
		answer = (int)arr[n];
		return answer;
	}

}
//먼저 1234567로 나눈 나머지로 연산하지 않으면 언어로 표현할 수 있는 숫자의 한계보다 커짐