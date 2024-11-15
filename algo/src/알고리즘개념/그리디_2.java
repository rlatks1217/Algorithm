package 알고리즘개념;

import java.util.Scanner;

public class 그리디_2 {

//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		int N = sc.nextInt();
//		int K = sc.nextInt();
//		
//		int count = 0;
//		while (N != 1) {
//			if (N%K == 1) {
//				N += -1;
//				count++;
//				continue;
//			}
//			
//			N /= K;
//			count++;
//		}
//		
//		System.out.println(count);
//		
//		sc.close();
//	}

//더 효율적인 방법(반복문 더 적게 돌게 됨)
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		int count = 0;
		while(true) {
			//더이상 K로 나눌 정도의 수가 아니라면
			if (N < K) {
				break;
			}
			
			//나누어 떨어지는 수가 될 때까지 뺄셈
			int target = (N/K)*K; //가장 가까운 수 중 K로 나누어 떨어지는 수 구함
			count += N - target; //이 연산을 하게 되면 나누어 떨어지는 수가 될 때까지 1을 뺀 횟수를 구할 수 있게 됨
			N = target;
			
			N /= K;
			count++;
		}
		
		//1이 될 때까지만 연산하고 멈춰야 하므로 횟수 1은 차감한다.(한 번 덜 연산해야 된다는 얘기)
		System.out.println(count);
		
		sc.close();
	}
}
