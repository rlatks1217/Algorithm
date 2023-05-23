package _programmers중요;

import java.util.Arrays;

public class N의최소공배수 {

	public static void main(String[] args) {
		int[] arr = {2,6,8,14};
		System.out.println(solution(arr));
	}

	private static int solution(int[] arr) {
		
		Arrays.sort(arr);
		int lcmResult = arr[arr.length - 1];
		for (int i = arr.length-2; i >= 0; i--) {
			int gcdResult = gcd(lcmResult, arr[i]); //최대공약수 구하기
			lcmResult = lcmResult*arr[i]/gcdResult; //두 숫자 곱(나누기)두 숫자의 최대공약수 = 최소공배수 이용
			//구한 최소 공배수와 다음 배열의 요소의 최대 공약수를 다시 구하고 같은 과정을 반복하면 여러 수의 최소 공배수를 구할 수 있음
		}
		
		return lcmResult;
	}

	private static int gcd(int a, int b) {
		if(a%b == 0) {
			return b;
		}else {
			return gcd(b, a%b);
		}
	}
	//나누어 떨어지는 수면 그게 최대 공약수 / 나누어 떨어지지 않으면 더 작은 수와 a, b의 나머지로 다시 연산하도록 함수 호출
	
}
