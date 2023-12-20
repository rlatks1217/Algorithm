package 스택_큐_덱;

import java.util.Scanner;
import java.util.Stack;

public class Ex2164 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		sc.close();
		
		if (N == 1) {
			System.out.println(1);
			return;
		}
		Stack<Integer> stack1 = new Stack<Integer>();
		Stack<Integer> stack2 = new Stack<Integer>();
		
		for (int i = N; i >= 1; i--) {
			stack1.push(i);
		}
		
		int result = 0;
		boolean check = false;
		while (true) {
			if (stack1.size() > 0) {
				stack1.pop(); //버리기
				if (stack1.size() > 0) { // 맨 밑으로 집어넣기
					stack2.push(stack1.pop());
					check = true;
				}else {
					check = false;
				}
			} else {
				if (stack2.size() > 1) {
					int count = stack2.size();
					for (int i = 0; i < count; i++) {
						stack1.push(stack2.pop());
					}
					
					//삭제 + 맨 밑으로 내리기 중 맨 밑으로 내리기를 실행하지 않은 경우 맨 밑으로도 내려줘야 함
					if (!check) {
						stack2.push(stack1.pop());
					}
				}else {
					result = stack2.pop();
					break;
				}
			}	
		}
		
		System.out.println(result);
	}
}
//for문에 size() 사용하면 pop()할 때마다 size가 줄어드므로 for문의 원래 목표횟수가 계속 달라져버림 
//-> 변수에 size()만큼 할당시켜서 횟수를 고정한 다음 실행시키자

//N이 5가 들어온 경우를 예로 들었을 때 처음 루프에서 마지막 숫자(5)의 경우 삭제 과정은 진행했지만 맨 밑으로 내리는 과정은 진행되지 않음
//즉, stack1.pop()으로 삭제는 했는데 맨 밑으로 내리는 과정을 의미하는 stack2.push()은 진행되지 않았다는 소리임
//boolean값으로 해당 과정을 진행했는지 안했는지 체크해서 안 했다면 진행해줘야 함!!(이게 가장 찾기 힘들었던 오류)

//어거지로 구현하긴 했지만 queue로 삭제한 값을 다시 맨 뒤에다가 삽입하는 식으로 구현하는 것이 더 편한 듯..