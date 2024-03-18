package 심화2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Ex26069 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		Map<String, Boolean> map = new HashMap<String, Boolean>();
		map.put("ChongChong", true);
		
		for (int i = 0; i < n; i++) {
			String[] names = br.readLine().split(" ");
			
			for (int j = 0; j < 2; j++) {
				if (map.containsKey(names[j])) {
					if (j == 0) {
						map.put(names[1], true);						
						break;
					} else {
						map.put(names[0], true);						
					}
				}
			}
		}
		br.close();
		
		System.out.println(map.size());
	}
	
}
// 총총이가 언제 나오는지는 상관없이 총총이가 포함된 만남이라면 그 순간부터 map에 춤추는 인원이 담기기 시작함
// 그리고 contains만 쓸 거면 map보다는 set 쓰는 게 나음 