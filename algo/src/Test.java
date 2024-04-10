import java.util.Scanner;

public class Test {
	static char[][] arr;
	 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		arr = new char[n][n];
		make(0, 0, n, false);
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				sb.append(arr[i][j]);
			}
			sb.append('\n');
		}
		System.out.println(sb);
	}

	private static void make(int x, int y, int n, boolean blank) {
		if (blank) {
			// 공백의 가로 세로도 n(n/3 이후 넘어온 size)크기임을 이용해서 2중 for문으로 공백처리 후 함수 return
			for (int i = x; i <x + n; i++) { 
				for (int j = y; j <y + n; j++) {
					arr[i][j] = ' ';
				}
			}
			return;
		}
		
		if (n == 1) {
			arr[x][y] = '*';
			return;
		}
		
		int size = n/3;
		int count = 0;
		// 더 작은 단위의 블럭의 첫 시작점 및 순회할 범위를 지정해줘야 하므로 x ~ x + n 라고 작성 
		for (int i = x; i <x + n; i+=size) {
			for (int j = y; j <y + n; j+=size) {
				count++;
				if (count == 5) {
					make(i, j, size, true);
				} else {
					make(i, j, size, false);					
				}
			}
		}
	}
}
// 1. 가장 큰 단위(처음 입력받은 수)크기 정사각형을 9개의 블럭으로 쪼개고 한 블럭 단위로 순회하면서 별표 혹은 공백 처리를 하게 됨
// 2. 그 하나의 블럭 또한 9개의 블럭으로 쪼개서 한 블럭 단위로 똑같이 별표 혹은 공백 처리
// 3. 1이 될 때까지 9개의 블럭을 쪼개고 별표를 할당 / 2중 for문에서 5번째로 실행되는 즉, 중앙에 위치한 블럭은 공백처리
// 이 과정을 2중for문과 재귀를 통해 구현한 것