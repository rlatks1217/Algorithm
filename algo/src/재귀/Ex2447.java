package 재귀;

import java.util.Scanner;

public class Ex2447 {
	static char[][] arr;
	 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		
		arr = new char[N][N];
		
		make(0, 0, N, false);
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				sb.append(arr[i][j]);
			}
			sb.append('\n');
		}
		
		System.out.print(sb);
	}

	private static void make(int x, int y, int n, boolean blank) {
		if (blank) {
			for (int i = x; i < x + n; i++) {
				for (int j = y; j < y + n; j++) {
					arr[i][j] = ' ';
				}
			}
			return;
		}
		
		if (n == 1) {
			arr[x][y] = '*';
			return;
		}
		
		int size = n / 3;
		int cnt = 0;
		for (int i = x; i < x + n; i += size) {
			for (int j = y; j < y + n; j += size) {
				cnt++;
				if (cnt == 5) {
					make(i, j, size, true);
					continue;
				}
				make(i, j, size, false);
			}
		}
	}
}
