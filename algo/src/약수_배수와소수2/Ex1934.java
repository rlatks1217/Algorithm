package 약수_배수와소수2;

import java.util.Scanner;

public class Ex1934 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for (int i = 0; i < T; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			int start = Math.max(a, b);
			int result = 1;
			while (start > 1) {
				if (a%start == 0 && b%start == 0) {
					result *= start;
					a /= start;
					b /= start;
				} else {
					start--;
				}
			}
			result *= a*b;
			System.out.println(result);
		}
		
		sc.close();
	}

}
//유클리드 호제법 : 작은 수를 큰 수에서 작은 수로 나눈 나머지로 나눠주는 과정을 나머지가 0일 때까지 반복하면 0이 되게 하는 숫자가 최대공약수가 됨
//두 숫자 a, b를 서로 곱한 값을 최대공약수로 나누면 그게 최소공배수가 됨
