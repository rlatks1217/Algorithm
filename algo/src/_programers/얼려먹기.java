package _programers;

import java.util.Scanner;

public class 얼려먹기 {

	
	public static void main(String[] args) {
		int result = 0;
		
		Scanner sc = new Scanner(System.in);
	
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[][] graph = new int[n][m];
		
		for (int i = 0; i < n; i++) {
			String floor = sc.next();
			for (int j = 0; j < m; j++) {
				graph[i][j] = floor.charAt(j) - '0';
			}
		}
		
		//1~n층의 1~5번째 노드까지 전부 다 확인
		for (int i = 0; i < n; i++) {
			int y = i;
			for (int j = 0; j < m; j++) {
				int x = j;
				if (dfs(x, y, n, m, graph)) {
					result += 1;
				}
			}
		}
		
		System.out.println(result);
		//연쇄적으로 탐색을 하는 경우가 3가지임을 알 수 있음
		sc.close();
	}

	private static boolean dfs(int x, int y, int n, int m, int[][] graph) {
		
		
		if (x <= -1 || x >= m || y <= -1 || y >= n) {
			return false;
		}
		
		if(graph[y][x] == 0) {
			graph[y][x] = 1;
			dfs(y-1, x, n, m, graph);
			dfs(y+1, x, n, m, graph);
			dfs(y, x-1, n, m, graph);
			dfs(y, x+1, n, m, graph);
			return true;
		}
		
		return false;
	}

}
