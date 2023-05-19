package _programmers중요;

import java.util.HashMap;
import java.util.Stack;

public class 햄버거 {

	public static void main(String[] args) {
		int[] ingredient = {2, 1, 1, 2, 3, 1, 2, 3, 1};
 		System.out.println(solution(ingredient));
 	
	}

	private static int solution(int[] ingredient) {
		int answer = 0;
		
        Stack<Integer> inStack = new Stack<Integer>();
        
        for(int in : ingredient) {
            inStack.push(in);
            
            // 스택의 사이즈가 4이상이 됐을 경우 조건처리 시작 (오류방지)
            if(inStack.size() >= 4) {
                
                // Stack이 1231이 연달아 들어가있는 경우
                if(inStack.get(inStack.size()-4) == 1 
                && inStack.get(inStack.size()-3) == 2
                && inStack.get(inStack.size()-2) == 3
                && inStack.get(inStack.size()-1) == 1) {
                    
                    answer++; // 값++
                    inStack.pop(); inStack.pop(); inStack.pop(); inStack.pop(); // 1231 총 4개를 pop()을 활용해 삭제
                }
            }
        }
		return answer;
	}

}
//stack도 index로 접근할 수 있음 => get
//stack도 size 확인할 수 있음 => get

//inStack.size()-4 라고 쓴 이유 : 4개 쌓였다고 했을 때 맨 아래를 확인하기 위해서는 3을 빼는 것이 맞지만 index는 0부터 시작하므로 size() -1 에서 3을 빼야 함
//그래서 총 4를 빼는 것임