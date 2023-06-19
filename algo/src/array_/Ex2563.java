package array_;

import java.util.Arrays;
import java.util.Scanner;

public class Ex2563 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		boolean[][] square = new boolean[100][100];
		
		for (int i = 0; i < T; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			for (int j = b-1; j < b + 9; j++) {
				for (int k = a-1; k < a + 9; k++) {
					if (!square[j][k]) {
						square[j][k] = true;
					}
				}
			}
			//3부터 13까지를 칠한다고 하면 3과 13사이의 공간을 칠한다고 생각하면 편함
			//근데 인덱스는 0부터 시작하니까 a+9와 같이 써줘야 하는 것임
			
		}
		int area = 0;
		for (int i = 0; i < square.length; i++) {
			for (int j = 0; j < square.length; j++) {
				if (square[i][j]) {
					area++;
				}
			}
		}

		System.out.println(area);
		
		sc.close();
	}

}

//세 번 이상 겹쳐질 경우 문제가 됨
//이유 : 로직 흐름상 한 색종이를 붙일 때마다 겹치는 부분이 있는지 확인하고 겹치면 겹치는 만큼 제거하는 방식인데
//이렇게 할 경우 로직 흐름상 넓이에서 겹치는 부분을 중복해서 빼게 되므로 문제가 됨
//(즉, 이미 중복이 제거된 부분도 한 번 더 제거하게 되는 것임)
