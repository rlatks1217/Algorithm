package 심화2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Ex25192 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int cnt = 0;
		Map<String, Integer> map = null;
		for (int i = 0; i < n; i++) {
			String nickname = br.readLine();
			if (nickname.equals("ENTER")) {
				map = new HashMap<>();
				continue;
			}
			if (map.get(nickname) == null) {
				cnt++;
				map.put(nickname, 1);
			}
		}
		
		br.close();
		System.out.println(cnt);
	}
}