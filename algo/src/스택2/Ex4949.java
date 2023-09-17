package 스택2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Ex4949 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		while(true) {
			String sentence = br.readLine();
			
			if (sentence.equals(".")) {
				break;
			}
			
			Stack<Character> stack = new Stack<Character>();
			boolean find = false;
			for (int i = 0; i < sentence.length(); i++) {
				char word = sentence.charAt(i);
				if (word == '(' || word == '[') {
					find = true; 
					stack.push(word);
				} else if (word == ')') {
					find = true; 
					if (stack.size() > 0) {
						char a = stack.peek();
						if (a == '(') {
							stack.pop();
						}else {
							break;
						}
					} else {
						stack.push(word);
						break;
					}
				} else if (word == ']') {
					find = true;
					if (stack.size() > 0) {
						char a = stack.peek();
						if (a == '[') {
							stack.pop();
						} else {
							break;
						}
					} else {
						stack.push(word);
						break;
					}
				}
			}
			
			if (find) {
				if (stack.size() > 0) {
					bw.write("no\n");
				} else {
					bw.write("yes\n");
				}
			} else {
				bw.write("yes\n"); 
			}
		}
		
		bw.flush();
		
		br.close();
		bw.close();
	}

}
//괄호 비교 후 균형이 맞지 않는 멈추거나 스텍에 넣지 않고 그냥 지나가니까 [)]와 같은 예외가 생김
//]]]]]와 같이 오른쪽 괄호만 들어올 때를 생각 안 해줌