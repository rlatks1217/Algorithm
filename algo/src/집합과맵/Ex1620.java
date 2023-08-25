package 집합과맵;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Ex1620 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		HashMap<String, String> map1 = new HashMap<String, String>();
		HashMap<String, String> map2 = new HashMap<String, String>();
		
		for (int i = 1; i <= n; i++) {
			String a = br.readLine();
			map1.put(a, Integer.toString(i)); //단어가 key
			map2.put(Integer.toString(i), a); //번호가 key
		}
		
		for (int i = 0; i < m; i++) {
			String b = br.readLine();
			if (map1.containsKey(b)) { //단어가 들어온 경우
				bw.write(map1.get(b) + "\n");
			} else if (map2.containsKey(b)){ //숫자가 들어온 경우
				bw.write(map2.get(b) + "\n");
			}
		}
		
		bw.flush();
		
		br.close();
		bw.close();
		
	}

}
