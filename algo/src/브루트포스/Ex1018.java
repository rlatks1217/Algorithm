package 브루트포스;

import java.util.Scanner;

public class Ex1018 {
	private static int minCnt = 64;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); //세로
		int m = sc.nextInt(); //가로
		
		String[] rows = new String[n];
		for (int i = 0; i < n; i++) {
			rows[i] = sc.next();
		}
		
		//가로, 세로 각각 최대시작지점을 정해줌
		int mStart = m - 7; 
		int nStart = n - 7;

		//시작할 수 있는 모든 지점을 돌게 됨
		for (int i = 0; i < nStart; i++) {
			for (int j = 0; j < mStart; j++) {
				int cnt = check(i, j, rows);
				minCnt = Math.min(minCnt, cnt);
			}
		}
		
		System.out.println(minCnt);
		
		sc.close();
	}

	private static int check(int n, int m, String[] rows) {
		char firstWord1 = rows[n].charAt(m);
		char firstWord2 = rows[n].charAt(m) == 'B' ? 'W' : 'B';
		
		//W로 시작하는 경우와 B로 시작하는 경우 중에 최소를 구해서 return
		int result1 = checkCount(n, m, rows, firstWord1); 
		int result2 = checkCount(n, m, rows, firstWord2);
		
		int cnt = Math.min(result1, result2);
		
		return cnt;
	}

	private static int checkCount(int n, int m, String[] rows, char firstWord) {
		int cnt = 0;
		for (int i = n; i < n + 8; i++) {
			if (firstWord == 'B') {
				for (int j = m; j < m + 8; j+=2) {
					if (rows[i].charAt(j) != firstWord) {
						cnt++;
					}
				}
				for (int j = m + 1; j < m + 8; j+=2) {
					if (rows[i].charAt(j) != 'W') {
						cnt++;
					}
				}
				firstWord = 'W';
			}else {
				for (int j = m; j < m + 8; j+=2) {
					if (rows[i].charAt(j) != firstWord) {
						cnt++;
					}
				}
				for (int j = m + 1; j < m + 8; j+=2) {
					if (rows[i].charAt(j) != 'B') {
						cnt++;
					}
				}
				firstWord = 'B';
			}
		}
		return cnt;
	}
}
