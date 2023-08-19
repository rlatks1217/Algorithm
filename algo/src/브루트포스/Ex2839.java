package 브루트포스;

import java.util.Scanner;

public class Ex2839 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int result = 0;

		while (true) {
			if (N % 5 == 0) {
		// 왜 5로 나누냐? 5가 차지하는 비율이 많을수록 봉지는 최소가 되니까
				result += N / 5;
				break;
			} else if (N < 0) {
				result = -1;
				break;
			}
			N -= 3;
			result++;
		}
		//0이 될 때까지 나눠지지 않는 경우는 -1로 출력되거나 3의 배수인 수라서 3으로 나눈 숫자가 출력될 것
		System.out.println(result);
		result = 0;

		sc.close();

	}

}
//되도록 간결하게