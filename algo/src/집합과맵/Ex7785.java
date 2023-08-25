package 집합과맵;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class Ex7785 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		
		Map<String, String> map = new HashMap<String, String>();
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			String name = st.nextToken();
			String outIn = st.nextToken();
			if (!(map.containsKey(name) || outIn.equals("leave"))) {
				map.put(name, outIn);
			} else {
				if (outIn.equals("leave")) {
					map.remove(name);
				}
			}
		}
		
		Set<String> set = map.keySet();
		Object[] arr = set.toArray();
		
		Arrays.sort(arr);
		
		for (int i = arr.length-1; i >= 0; i--) {
			sb.append(arr[i]+"\n");
		}
		
		System.out.println(sb);
		
		br.close();
		
	}

}
