package _4함수;

import java.util.Scanner;

public class Ex1065 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int cnt = 0;
		for (int j = 1; j <= N; j++) {
			if (j < 100) {
				cnt++;
			} else if (j > 100) {
				String[] numList = String.valueOf(j).split("");
				int[] num = new int[numList.length];
				
				for (int i = 0; i < numList.length; i++) {
					num[i] = Integer.parseInt(numList[i]);
				}
				
				boolean hansoo = false;
				for (int i = 0; i < num.length - 2; i++) {
					if ((num[i] - num[i + 1]) == (num[i + 1] - num[i + 2])) {
						hansoo = true;
					} else {
						hansoo = false;
						break;
					}
				}
				
				if (hansoo == true) {
					cnt++;
				}
			}
		}
		
		System.out.println(cnt);
		
	}
}
