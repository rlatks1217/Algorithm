package 집합과맵;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Ex1764 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		for (int i = 0; i < n; i++) {
			String a = br.readLine();
			map.put(a, 0);
		}
		
		for (int i = 0; i < m; i++) {
			String b = br.readLine();
			if (map.containsKey(b)) {
				map.put(b, 1);
			}
		}
		
		ArrayList<String> list = new ArrayList<String>();
		for(String name : map.keySet()) {
			if (map.get(name) == 1) {
				list.add(name);
			}
		}
		
		bw.write(list.size() + "\n");
		
		Collections.sort(list);
		
		for (String name : list) {
			bw.write(name + "\n");
		}
		
		bw.flush();
		
		br.close();
		bw.close();
	}

}
