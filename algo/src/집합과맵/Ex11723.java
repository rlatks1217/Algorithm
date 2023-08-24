package 집합과맵;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Ex11723 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int M = Integer.parseInt(br.readLine());
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < M; i++) {
			String[] str = br.readLine().split(" ");
			String str2 = str.length == 1 ? "0" : str[1];
			
			String a = str[0];
			int b = Integer.parseInt(str2);
			
			switch (a) {
			case "add":
				if (map.get(b) == null) {
					map.put(b, b);
				}
				break;
			case "remove":
				if (map.get(b) != null) {
					map.remove(b);
				}
				break;
			case "check":
				if (map.get(b) != null) {
					sb.append(1 + "\n");
				}else {
					sb.append(0 + "\n");
				}
				break;
			case "toggle":
				if (map.get(b) == null) {
					map.put(b, b);
				} else {
					map.remove(b);
				}
				break;
			case "all":
				for (int j = 1; j <= 20; j++) {
					map.put(j, j);
				}
				break;
			case "empty":
				map = new HashMap<Integer, Integer>();
				break;
			}
		}
		
		br.close();
		
		System.out.println(sb);
		
	}

}
//StringTokenizer 같은 경우 다음 Token이 없는데 nextToken을 사용하게 되면 오류가 발생함
//StringTokenizer의 경우 ""로는 못 나눔 - 단, 여러 구분자를 줄 수 있음
//emptyString은 기본적으로 token으로 인식하지 않음