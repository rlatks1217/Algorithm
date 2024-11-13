import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Main { // 21 : 31
	static int N, local1, local2;
	static ArrayList<Reach>[] graph;
	static boolean[] visited;
	static int minDistance;
	public static void main(String[] args) throws IOException {
		
		// DFS()
		// 첫번째 방 방문했다고 취급 visited = true;
		// 큐에서 꺼내고
		// for
			// 도착지라면 최소값인지 체크
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		local1 = Integer.parseInt(st.nextToken());
		local2 = Integer.parseInt(st.nextToken());
		
		graph = new ArrayList[N + 1];
		visited = new boolean[N + 1];
		minDistance = Integer.MAX_VALUE;
		
		for (int i = 1; i <= N; i++) {
			graph[i] = new ArrayList<>();
		}
		
		for (int i = 0; i < N - 1; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int distance = Integer.parseInt(st.nextToken());
			graph[a].add(new Reach(b, distance));
			graph[b].add(new Reach(a, distance));
		}
		
		DFS(local1, local2, 0, 0);
		System.out.println(minDistance);
	}
	
	private static void DFS(int start, int end, int distance, int before) {
		
		for (Reach node : graph[start]) {
			if (!visited[start]) {
				visited[start] = true;
				if (node.end == end) {
					if (before <= node.distance) {
						minDistance = Math.min(distance, minDistance);						
					} else {
						distance -= before;
						minDistance = Math.min(distance + node.distance, minDistance);												
					}
				} else {
					DFS(node.end, end, distance + node.distance, node.distance);
				}
				visited[start] = false;
			}
		}
	}
	
}

class Reach {
	int end;
	int distance;
	
	public Reach (int end, int distance) {
		this.end = end;
		this.distance = distance;
	}
	
}