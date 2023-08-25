package 집합과맵;

import java.util.HashMap;
import java.util.Scanner;

public class Ex10816 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int N = sc.nextInt();
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < N; i++) {
			int a = sc.nextInt();
			if (!map.containsKey(a)) {
				map.put(a, 1);
			} else {
				map.put(a, map.get(a)+1);
			}
		}
		
		int M = sc.nextInt();
		
		for (int i = 0; i < M; i++) {
			int b = sc.nextInt();
			
			if (map.containsKey(b)) {
				sb.append(map.get(b) + " ");
			} else {
				sb.append("0 ");
			}
		}
		System.out.println(sb);
		
		sc.close();
	}
}
//정렬해서 2진 탐색을 해서 찾는 것보다 이렇게 map을 이용하여 비교하는 것이 훨씬 효율적임
//map에 key가 있는지 없는지 판단할 때 getOrDefault(key값, default값)을 사용할 수도 있음
//그러면 key에 해당하는 value가 나오거나 key에 해당하는 value가 없을 경우 default값이 나오게 됨