package _JongAll;

import java.util.Scanner;

public class 숫자사각형1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int cnt = 1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(cnt + " ");
				cnt++;
			}
			System.out.println();
		}
		
		sc.close();
	}

}
