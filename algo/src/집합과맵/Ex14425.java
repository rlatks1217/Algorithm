package 집합과맵;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Ex14425 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		ArrayList<String> list = new ArrayList<String>();
		for (int i = 0; i < N; i++) {
			list.add(br.readLine());
		}
		
		int result = 0;
		for (int i = 0; i < M; i++) {
			String a = br.readLine();
			for (int j = 0; j < list.size(); j++) {
				if (list.get(j).equals(a)) {
					result++;
				}
			}
		}
		
		System.out.println(result);
		
		br.close();
	}

}
//집합 S에 같은 문자열이 주어지는 경우가 없다고 했음 -> M번 주어지는 입력의 경우 같은 값이 있을 수도 있는 거임
