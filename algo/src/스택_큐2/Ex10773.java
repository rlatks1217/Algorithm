package 스택_큐2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Ex10773 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int K = Integer.parseInt(br.readLine());
		
		Stack<Integer> stack = new Stack<Integer>();
		for (int i = 0; i < K; i++) {
			int num = Integer.parseInt(br.readLine());
			
			if (num == 0) {
				stack.pop();
			} else {
				stack.push(num);
			}
		}
		int sum = 0;
		for (Integer num : stack) {
			sum += num;
		}
		
		bw.write(sum + "");
		bw.flush();
		
		br.close();
		bw.close();
	}

}
