package _JongAll;

import java.util.Scanner;

public class 숫자사각형2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		boolean reverse = false;
		int cnt = 0;
		for (int i = 0; i < n; i++) {
			if (!reverse) {
				for (int j = 0; j < m; j++) {
					cnt++;
					System.out.print(cnt + " ");
				}
				reverse = true;
			} else {
				cnt += m;
				for (int j = 0; j < m; j++) {
					System.out.print(cnt - j + " ");
				}
				reverse = false;
			}
			System.out.println();
		}
		
		sc.close();
	}

}
