package 스택_큐2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ex11866 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		sc.close();
		
		Queue<Integer> queue = new LinkedList<Integer>();
		Queue<Integer> resultQueue = new LinkedList<Integer>();
		
		for (int i = 1; i <= n; i++) {
			queue.offer(i);
		}
		
		while(queue.size() > 0) {
			for (int i = 1; i < k; i++) {
				queue.offer(queue.poll());
			}
			resultQueue.offer(queue.poll());
		}
		
		String result = resultQueue.toString().replace("[", "<").replace("]", ">");
		
		System.out.println(result);
	}

}
//k-1번 삭제 후 다시 맨 뒤로 삽입(원순열 순번 도는 것을 구현) / 그 다음은 해당 순번이므로 삭제