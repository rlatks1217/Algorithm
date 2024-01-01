package 스택_큐_덱;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Ex2346 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		ArrayDeque<int[]> deque = new ArrayDeque<>();
		
		for (int i = 0; i < N; i++) {
			deque.add(new int[] {i + 1, Integer.parseInt(st.nextToken())}); // 순서(index), 이동할 값
			// 생소한 부분
			// 원의 형태를 자료구조로 구현하는 것이기 때문에 순서를 따로 저장해놓지 않으면 순서를 알 수 없음 
		}
		
		bw.write("1 ");
		int move = deque.poll()[1];
		while (!deque.isEmpty()) {
			if (move > 0) {
				for (int i = 1; i < move; i++) {
					deque.addLast(deque.pollFirst());
				}
				move = deque.peekFirst()[1];
				bw.write(deque.pollFirst()[0] + " ");
			} else {
				for (int i = 1; i < move*(-1); i++) {
					deque.addFirst(deque.pollLast());
				}
				move = deque.peekLast()[1];
				bw.write(deque.pollLast()[0] + " ");				
			}

		}
		
		bw.flush();
		br.close();
		bw.close();
		
	}

}
// for문 1부터 시작인 이유 : 해당 요소부터 이동하기 시작해야 하는데 해당 요소가 이미 없어진 이후이므로 1번 덜 이동해야 하므로