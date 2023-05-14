package 알고리즘개념;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class 스택_큐예제 {

	public static void main(String[] args) {
		
		Stack<Integer> stack  = new Stack<>();
		
		stack.push(1); //push()는 add() 같은 역할을 하는 메소드 => 단, push()는 Stack 클래스에서만 사용하는 메소드임
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		
		System.out.println(stack.peek()); //Stack의 최상단에 있는 데이터를 반환만 하는 메소드(삭제는 아님)
		System.out.println(stack.pop()); //Stack의 최상단에 있는 데이터를 반환하고 삭제하는 메소드
		
		Queue<Integer> queue = new LinkedList<Integer>(); 
		//Queue의 경우 클래스가 아니라 인터페이스 형태로 제공됨 => 그래서 LinkedList 이용
		
		queue.offer(1); //데이터 추가 메소드
		queue.offer(2); 
		queue.offer(3);
		queue.offer(4);
		queue.offer(5);
		System.out.println(queue.poll()); //가장 먼저 들어온 요소부터 반환, 삭제
		
	}

}
