package 알고리즘개념;

import java.util.ArrayList;

public class DFS {

	public static void main(String[] args) {
		
		boolean[] visited = new boolean[9];
		//list를 통해서 그래프 자료구조를 표현
		ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
		//graph라는 list 안에 들어가는 list가 각 노드가 방문해야 할 노드들의 list임
		
		//list 안의 각 index에 list객체 초기화(객체가 있어야 메소드 사용이 가능함)
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
		
		dfs(1, visited, graph); //1부터 방문 시작
	}
	
	//이 재귀함수를 통해서 자바 내부 스택을 이용한 DFS 구현
	public static void dfs(int x, boolean[] visited, ArrayList<ArrayList<Integer>> graph) {
		
		visited[x] = true; //현재 노드 방문처리
		System.out.print(x+" ");
		for (int i = 0; i < graph.get(x).size(); i++) { //현재 노드의 인접 노드 갯수만큼 for문이 돈다.
			int y = graph.get(x).get(i); //현재 노드가 방문해야 할 인접노드
			if (!visited[y]) { //방문하지 않았다면 (!false => true라는 의미) 해당 인접노드 쪽으로 파고 들어서 같은 작업 실시
				dfs(y, visited, graph);
			}
		}
	}

}
