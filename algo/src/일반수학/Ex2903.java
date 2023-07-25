package 일반수학;

import java.util.Scanner;

public class Ex2903 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int n = 3;
		int cnt = 1;
		
		for (int i = 1; i < N; i++) { 
			//범위가 1<= N <= 15 중 하나니까 첫번째는 무조건 실행한다고 보는 거임
			//그래서 첫번째 과정은 이미 수행했다고 치고 두 번째 케이스부터 계산할 수 있는 로직을 짠 것
			cnt *=2;
			n += cnt;
		}
		
		System.out.println(n*n);
		sc.close();
	}

}

//숫자만으로 규칙을 세우는 것도 좋지만 그림을 보고 규칙을 세우는 것도 생각해야 함
