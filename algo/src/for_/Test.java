package for_;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int cnt = 0;
		for (int i = (2*n)-1; i >= 1; i-=2) {
			for (int j = 0; j < cnt; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			cnt++;
			System.out.println();
		}
		for (int i = 1; i <= (2*n)+1; i+=2) {
			if (i == 1) {
				cnt--;
				continue;
			}
			cnt--;
			for (int j = 0; j < cnt; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		sc.close();
	}

}
//2n-1을 범위로 정하는 게 핵심임!! 홀수니까