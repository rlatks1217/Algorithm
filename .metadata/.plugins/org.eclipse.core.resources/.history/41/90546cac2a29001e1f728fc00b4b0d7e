package _programmers;

import java.util.ArrayList;

public class 피로도 {
	public static ArrayList<Integer> list = new ArrayList<>();
	
	public static void main(String[] args) {
		int k = 80;
		int[][] dungeons = {{80,20},{50,40},{30,10},{60,40}};
		System.out.println(solution(k, dungeons));
	}

	private static int[] solution(int k, int[][] dungeons) {
		
		boolean[] visited = new boolean[dungeons.length];
		
		int n = dungeons.length;
		permutation(0, n, visited, k, dungeons, 0);
		
		int max = 0;
		for (int i = 0; i < list.size(); i++) {
			max = Math.max(max, list.get(i));
		}
		System.out.println(max);
		return null;
	}

	private static void permutation(int count, int end, boolean[] visited, int k, int[][] dungeons, int stress) {
		
		if(count == end) {
			list.add(count);
			return;
		}
		
		if (k < stress) {
			list.add(count);
			return;
		}
		k-= stress;
		
		for (int i = 0; i < dungeons.length; i++) {
			if(!visited[i] && dungeons[i][0] <= k) {
				visited[i] = true;
				permutation(count+1, end, visited, k, dungeons, dungeons[i][1]);
				visited[i] = false;
			}else {
				list.add(count);
			}
		}
	}
}
//재귀함수 사용 시 +하는 부분은 웬만해서는 for문 내부 외의 부분에서를 제외하고는 안 하는 게 좋음