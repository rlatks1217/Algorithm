package _programmers;

import java.util.Stack;

public class 크레인인형뽑기게임 {

	public static void main(String[] args) {
		int[][] board = { { 0, 0, 0, 0 }, { 0, 0, 0, 0 }, { 0, 0, 0, 0 }, { 0, 0, 0, 0 } };
		int[] moves = { 2, 3, 1, 4, 2, 3 };
		System.out.println(solution(board, moves));
		
	}

	private static int solution(int[][] board, int[] moves) {
		int answer = 0;

		Stack<Integer> stack = new Stack<Integer>();

		for (int local : moves) {
			int choose = 0; //꺼낸 것
			for (int i = 0; i < board.length; i++) { //층수만큼 반복
				if (board[i][local-1] != 0) { //비어있지 않다면
					choose = board[i][local-1];
					board[i][local-1] = 0; //꺼냈으면 비웠다는 것 표시
					break;
				}
			}
			if (stack.isEmpty()) {
				if (choose != 0) {
					stack.add(choose);					
				}
				continue;
			}
			
			if (stack.peek() == choose) {
				stack.pop();
				answer++;
			} else {
				stack.add(choose);
			}
			
		}
		
		return answer*2;
	}

}
//board가 다 비어있는 경우도 생각해야 함
