import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class AlgoTest { // 13:00
	static ArrayList<Integer>[] upGraph;
	static ArrayList<Integer>[] downGraph;
	static boolean visited[];
	static int u, v, x;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		x = Integer.parseInt(st.nextToken());
		u = 1;
		v = n;
		upGraph = new ArrayList[n + 1];
		downGraph = new ArrayList[n + 1];
		for (int i = 1; i <= n; i++) {
			upGraph[i] = new ArrayList<>();
			downGraph[i] = new ArrayList<>();
		}

		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());

			downGraph[a].add(b);
			upGraph[b].add(a);
		}

		visited = new boolean[n + 1];
		u += BFS(upGraph);
		visited = new boolean[n + 1];
		v -= BFS(downGraph);
		System.out.println(u + " " + v);
	}

	private static int BFS(ArrayList<Integer>[] graph) {
		Queue<Integer> q = new LinkedList<>();
		visited[x] = true;
		q.offer(x);

		int cnt = 0;
		while (!q.isEmpty()) {
			int num = q.poll();
			
			for (int node : graph[num]) {
				if (visited[node]) {
					continue;
				}
				
				cnt++;
				q.offer(node);
				visited[node] = true;
			}
		}
		
		return cnt;
	}
}