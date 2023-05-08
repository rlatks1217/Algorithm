package _programers;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		
		boolean[] visited = new boolean[9];
		
		ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
		
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
		
		dfs(1, visited, graph);
	}

	private static void dfs(int nodeNum, boolean[] visited, ArrayList<ArrayList<Integer>> graph) {
		visited[nodeNum] = true;
		
		for (int i = 0; i < graph.get(nodeNum).size(); i++) {
			int y = graph.get(nodeNum).get(i);
			if (!visited[y]) {
				dfs(y, visited, graph);
			}
		}
		
	}

}
