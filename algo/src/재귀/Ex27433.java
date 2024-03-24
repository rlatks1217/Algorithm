package 재귀;

import java.util.Scanner;

public class Ex27433 {

	private static long result = 1;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		factorial(n);
		System.out.println(result);
		sc.close();
	}

	private static void factorial(int n) {
		if (n <= 1) {
			return;
		}
		result *= n;
		n--;
		factorial(n);
	}
}
// long a = 14*13*12*11*10*9*8*7*6*5*4*3*2*1;
// 곱셈 연산 결과 자체는 int이기 때문에 오버플로우가 발생하여 이상한 값이 long타입 변수에 담기는 것임