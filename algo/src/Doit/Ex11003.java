package Doit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Ex11003 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int L = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		Deque<Node> deque = new LinkedList<>();
		for (int i = 0; i < N; i++) {
			int num = Integer.parseInt(st.nextToken());
			
			while (!deque.isEmpty() && num < deque.peekLast().value) {
				deque.removeLast();
			}
			
			deque.add(new Node(i, num));
			
			if (deque.peekFirst().index <= i - L) {
				deque.removeFirst();
			}
			
			sb.append(deque.peekFirst().value + " ");
		}
		
		System.out.println(sb);
	}

}

class Node {
	int index;
	int value;
	
	public Node(int index, int value) {
		this.index = index;
		this.value = value;
	}
}
