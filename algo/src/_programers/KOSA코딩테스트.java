package _programers;
//철수는 최근 경제 상황이 좋지 않아 어쩔 수 없이 우범지역에 집을 구하게 되었다.
//이 지역에는 N개의 교차로가 있고, N-1개의 길이 각각 두 교차로를 양방향으로 연결하고 있다.
//교차로들은 1번부터 N번까지 번호가 붙어 있다. 어떤 교차로에서든 다른 교차로로
//1개 이상의 길을 이용하여 이동할 수 있는 방법이 있다.
//
//각 교차로에는 다세대 주택이 있는데, 그 다세대 주택의 집들 중에 범죄자가 살고 있을 수 있다.
//철수는 어떤 교차로에 있는 다세대 주택에 범죄자가 있는지 여부를 모두 파악하였다.
//아래 그림을 보면 8개의 교차로가 7개의 길로 연결되어 있다.
//원 안의 숫자는 교차로의 번호이다.
//원 옆에 있는 숫자는 해당 교차로에 범죄자가 살고 있는지 알려주는 것으로,
//0 이면 범죄자가 살고 있지 않고, 1 이면 범죄자가 살고 있다는 뜻이다.
//
//
// 
//철수는 모든 교차로 i에 대해서 거리 K이내에 있는 교차로들 중 (교차로 i 포함) 범죄자가 살고 있는
//교차로들의 개수를 계산하고 싶다. 교차로의 개수, 연결 상태와, 각 교차로에 범죄자가 사는지 여부를
//입력 받아 그 답을 계산하는 프로그램을 작성하라. 편의상 출력은 모든 교차로에 대한 답을 더한 총 합으로 정한다.
//
// 
//
//[입력]
//
//입력 파일의 제일 첫째 줄에는 파일에 포함된 케이스의 수 T가 주어진다.
//각 케이스의 첫째 줄에 교차로의 개수를 나타내는 자연수 N과 거리 K가 주어진다. (1 ≤ N ≤ 100,000, 0 ≤ K ≤ 100)
//둘째 줄부터 N-1개의 줄에 걸쳐 도로들에 대한 정보가, 그 도로가 잇는 두 교차로의 번호로 주어진다.
//어떤 교차로에서든 다른 교차로로 1개 이상의 길을 이용하여 이동할 수 있는 방법이 있다.
//즉, 교차로들은 Tree 형태로 연결되어 있음에 유의하라. 다음 줄에 N개의 0 또는 1 값이 주어진다.
//이 값들은 교차로의 번호 순서대로 각 교차로의 다세대 주택에 범죄자가 살고 있는지를 알려준다.
//값이 0 인 경우 범죄자가 살고 있지 않은 교차로임을 의미하고, 값이 1 인 경우 범죄자가 살고 있는 교차로임을 의미한다.
// 
//
//[출력]
//
//각 테스트 케이스의 답을 순서대로 표준출력으로 출력하며, 각 케이스마다 줄의 시작에 “#x”를 출력하여야 한다.
//이때 x는 케이스의 번호이다.
//같은 줄에, 각 교차로에 대해 거리 K이내의 교차로들 중 범죄자가 살고 있는 교차로의 개수를 계산하여 모두 더한 총합을 출력한다.
//
//
//2
//8 1
//1 4
//5 4
//7 5
//5 8
//3 7
//6 5
//2 6
//1 0 0 1 1 0 0 1
//5 6
//1 2
//2 3
//3 4
//4 5
//1 0 1 1 0
//
//
//답
//12
//15
import java.util.ArrayList;
import java.util.Scanner;

public class KOSA코딩테스트 {

	static int AnswerN;
	static int N = 0;
	static int K = 0;
	static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++) {
			
			N = sc.nextInt();
			K = sc.nextInt();
			
			for (int i = 0; i < N; i++) {
				//노드용 list 객체 초기화
				graph.add(new ArrayList<Integer>());
			}
			
			for (int i = 0; i < N-1; i++) {
				int cross1 = sc.nextInt();
				int cross2 = sc.nextInt();
				
				graph.get(cross1-1).add(cross2-1);
				graph.get(cross2-1).add(cross1-1);
			}
			
			
			//범죄자 유무 입력 받음
			boolean[] check = new boolean[N];
			for (int i = 0; i < check.length; i++) {
				int boll = sc.nextInt();
				if (boll == 1) {
					check[i] = true;
				}
			}
			
			boolean[] visited = new boolean[N];
			int distance = 0;
			for (int i = 0; i < graph.size(); i++) {
				getAnswer(distance, K, visited, i, check);				
			}
			
			System.out.println("#"+test_case+" "+AnswerN);
			graph.clear();
			AnswerN = 0;
		}
		sc.close();
	}

	private static void getAnswer(int distance, int k, boolean[] visited, int i, boolean[] check) {
		
		//k보다 벗어난 거리거나 이미 방문한 노드일 경우 종료
		if (distance > k || visited[i]) {
			return;
		}
		
		distance++;
		visited[i] = true; //방문처리
		
		//범죄자 유무 판단
		if (check[i]) {
			AnswerN++;
		}
		for (int j = 0; j < graph.get(i).size(); j++) {
			int y = graph.get(i).get(j);
			getAnswer(distance, K, visited, y, check);
		}
		visited[i] = false;
		
	}


}
