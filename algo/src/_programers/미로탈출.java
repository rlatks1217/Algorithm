package _programers;

import java.util.Scanner;

public class 미로탈출 {

	public static int n,m;
	public static int[][] maze = new int[1000][1000];
	public static int result = 0;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt(); //높이
		m = sc.nextInt(); //칸수
		
		for (int i = 0; i < n; i++) {
			String floor = sc.next();
			for (int j = 0; j < m; j++) {
				maze[i][j] = floor.charAt(j) - '0';
			}
		}
		
		dfs(0, 0);
		
		System.out.println(result);
		
		sc.close();
	}

	private static void dfs(int y, int x) {
		
		if(x <= -1 || x >= m || y <= -1 || y >= n) {
			return;
		}
		
		if (maze[y][x] == 1) {
			result++; //이동칸수 증가
			dfs(y+1, x); //아래쪽
			dfs(y, x+1); //오른쪽
		}
	}

}
