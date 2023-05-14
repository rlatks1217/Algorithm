package 알고리즘개념;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {

	public static void main(String[] args) {
		
		boolean[] visited = new boolean[9];
		ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
		
		//DFS와 마찬가지로 초기화
		for (int i = 0; i < 9; i++) {
			graph.add(new ArrayList<Integer>());
		}
		
		graph.get(1).add(2);
		graph.get(1).add(3);
		graph.get(1).add(8);
		
		graph.get(2).add(1);
		graph.get(2).add(7);
		
		graph.get(3).add(1);
		graph.get(3).add(4);
		graph.get(3).add(5);
		
		graph.get(4).add(3);
		graph.get(4).add(5);
		
		graph.get(5).add(3);
		graph.get(5).add(4);
		
		graph.get(6).add(7);
		
		graph.get(7).add(2);
		graph.get(7).add(6);
		graph.get(7).add(8);
		
		graph.get(8).add(1);
		graph.get(8).add(7);
		
		
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.offer(1);
		visited[1] = true;
		
		while (!queue.isEmpty()) {
			bfs(visited, graph, queue);			
		}
	}

	private static void bfs(boolean[] visited, ArrayList<ArrayList<Integer>> graph, Queue<Integer> queue) {
		
		int nodeNum = queue.poll(); //원소 꺼냄
		
		System.out.print(nodeNum + " ");
		
		for (int i = 0; i < graph.get(nodeNum).size(); i++) {
			int y = graph.get(nodeNum).get(i);
			if (!visited[y]) {
				queue.offer(y);
				visited[y] = true;
			}
		}
		
	}

}
