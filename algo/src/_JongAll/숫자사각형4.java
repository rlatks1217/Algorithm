package _JongAll;

import java.util.Scanner;

public class 숫자사각형4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		switch (m) {
		case 1:
			case1(n, m);
			break;
		case 2:
			case2(n, m);
			break;
		case 3:
			case3(n, m);
			break;
		}
		
		sc.close();
	}

	private static void case1(int n, int m) {
		int cnt = 0;
		for (int i = 0; i < n; i++) {
			cnt++;
			for (int j = 0; j < n; j++) {
				System.out.print(cnt + " ");
			}
			System.out.println();
		}
	}

	private static void case2(int n, int m) {
		int cnt = 1;
		boolean reverse = false;
		for (int i = 0; i < n; i++) {
			if(!reverse) {
				for (int j = 0; j < n; j++) {
					System.out.print(cnt + " ");
					cnt++;
				}
				reverse = true;
			} else {
				for (int j = 0; j < n; j++) {
					cnt--;
					System.out.print(cnt + " ");
				}
				reverse = false;
			}
			System.out.println();
		}
	}

	private static void case3(int n, int m) {
		int num = 1;
		int cnt = 0;
		for (int i = 0; i < n; i++) {
			cnt = num;
			for (int j = 0; j < n; j++) {
				System.out.print(cnt + " ");
				cnt += num;
			}
			num++;
			System.out.println();
		}
	}

}
