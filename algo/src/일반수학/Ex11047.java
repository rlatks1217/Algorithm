package 일반수학;

import java.util.Scanner;

public class Ex11047 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		int[] coinArr = new int[N];
		for (int i = 0; i < N; i++) {
			coinArr[i] = sc.nextInt();
		}
		
		int cnt = 0;
		for (int i = coinArr.length -1; i >= 0; i--) {
			if (coinArr[i] > K) {
				continue;
			}
			
			cnt += K/coinArr[i];
			K = K%coinArr[i];
			
			if (K == 0) {
				break;
			}
		}
		
		System.out.println(cnt);
		
		sc.close();
	}

}
//input이 1을 제외한 나머지는 5의 배수만 들어오기 때문에 가능한 로직
//문제 조건 보면 나와 있으니 문제 조건을 잘 확인해야 함..