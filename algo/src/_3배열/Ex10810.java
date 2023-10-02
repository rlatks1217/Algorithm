package _3배열;

import java.util.Scanner;

public class Ex10810 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt(); //횟수
		
		int[] basket = new int[N];
		
		for (int i = 0; i < M; i++) {
			int I = sc.nextInt();
			int J = sc.nextInt();
			int K = sc.nextInt();
			for (int j = I-1; j < J; j++) {
				basket[j] = K;
			}
		}
		
		for (int num : basket) {
			System.out.print(num + " ");
		}
		sc.close();
	}

}
