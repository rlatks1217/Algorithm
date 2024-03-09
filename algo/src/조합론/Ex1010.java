package 조합론;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex1010 {

	private static int[][] cArr = new int[30][30];
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		for (int i = 0; i < t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());

			sb.append(combination(m, n) + "\n");
		}
		
		br.close();
		System.out.println(sb.toString());
	}
	
	private static int combination(int m, int n) {
		// 배열은 최초에 0으로 초기화되므로 해당 index의 요소값이 0이란 건 아직 해당 index에는 값이 할당되지 않았음을 의미함
		if (cArr[m][n] > 0) {
			return cArr[m][n];
		}
		
		// nC0과 nCn은 1임을 이용
		if (m == n || n == 0) {
			return cArr[m][n] = 1;
			// 다음과 같이 작성 시 변수에 할당한 값을 return함
		}
		
		// 파스칼의 법칙 이용
		return cArr[m][n] = combination(m-1, n-1) + combination(m-1, n);			
	}

}
