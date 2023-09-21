package 스택2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Ex12789 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		Queue<Integer> queue = new LinkedList<Integer>();
		Stack<Integer> stack = new Stack<Integer>();
		
		for (int i = 0; i < n; i++) {
			queue.offer(sc.nextInt());
		}

		int turn = 1;
		while (!queue.isEmpty()) {
			if (turn == queue.peek()) {
				queue.poll();
				turn++;
			} else {
				if (stack.size() == 0) {
					stack.push(queue.poll());
				} else {
					if (stack.peek() == turn) {
						stack.pop();
						turn++;
					} else {
						stack.push(queue.poll());
					}
				}
			}
		}
		
		while (true) {
			if (stack.size() == 0) {
				System.out.println("Nice");
				break;
			}
			
			if (stack.peek() == turn) {
				stack.pop();
				turn++;
			} else {
				System.out.println("Sad");
				break;
			}
		}
		
		sc.close();
	}

}
//for-each문 돌릴 시 stack이어도 배열처럼 가장 처음 들어간 놈부터 나옴
//for-문에서 stack size()로 범위를 정하면 i는 계속 증가하는 반면, stack의 크기는 줄어드므로 원하는 만큼 반복할 수가 없게 됨
//stack과 queue를 모두 확인했는데도 없는 경우에는 일단 stack에 해당 요소를 넣어놓고 순차적으로 계속 queue의 요소들을 살펴야 함