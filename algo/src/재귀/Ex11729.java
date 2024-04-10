package 재귀;

import java.util.Scanner;

public class Ex11729 {
	private static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int count = hanoi(n, 1, 2, 3, 0);
		System.out.println(count);
		System.out.println(sb.toString());
	}

	private static int hanoi(int n, int start, int mid, int last, int count) {
		count++;
		if (n == 1) {
			sb.append(start + " " + last + "\n"); // 가장 작은 원판이 옮겨질 위치 출력
			return count;
		}
		
		count = hanoi(n-1, start, last, mid, count);
		sb.append(start + " " + last + "\n"); // 가장 작은 원판을 제외하고 옮겨질 위치 출력
		count = hanoi(n-1, mid, start, last, count);
		
		return count;
	}
}
// 핵심 아이디어 : 가장 큰 원판을 제외한 나머지 n-1개의 원판이 최종 목적지와는 다른 장대에 들어가야 한다.

// n이 주어졌을 때 최종 목적지 가 3번째 장대이므로 2번째에 n-1개의 원판이 들어가게 해야 함(n-1개의 원판이 들어가는 로직은 재귀로 구현)
// n-1일 때는 최종 목적지가 2번째 장대인 것이나 마찬가지이므로 n-1개의 원판이 3번째 장대에 들어가면 됨
// 이런 식으로 1이 될 때까지 목적지 변경과 함께 숫자를 줄여가며 재귀로 호출