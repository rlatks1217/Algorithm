package 약수_배수와소수2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex1929 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		
		boolean[] checkPrime = new boolean[N+1];
		checkPrime[1] = true;
		for (int i = M; i <= N; i++) {
			for (int j = 2; j <= Math.sqrt(i) ; j++) {
				if (i != j && i % j == 0) {
					checkPrime[i] = true; //소수 아님
					break;
				}
			}
			
			if (!checkPrime[i]) {
				for (int j = i*2; j <= N; j+=i) {
					checkPrime[j] = true;
				}
			}
		}
		
		for (int i = M; i < checkPrime.length; i++) {
			if (!checkPrime[i]) {
				sb.append(i + "\n");
			}
		}
		
		System.out.println(sb);
		
		br.close();
		
	}

}
//소수가 아닌 것 true해줄 때 N까지 해줘야 함
//마지막에 append 할 때 M부터 시작해야 함