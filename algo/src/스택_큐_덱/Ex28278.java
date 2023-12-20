package 스택_큐_덱;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class Ex28278 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		
		Stack<Integer> stack = new Stack<Integer>();
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			
			int chose = Integer.parseInt(st.nextToken());
			
			switch (chose) {
			case 1:
				int input = Integer.parseInt(st.nextToken());
				stack.add(input);
				break;
			case 2:
				if (!stack.empty()) {
					bw.write(stack.pop()+"\n");
				} else {
					bw.write("-1\n");
				}
				break;
			case 3:
				bw.write(stack.size()+"\n");
				break;
			case 4:
				if(stack.empty()) {
					bw.write("1\n");
				} else {
					bw.write("0\n");
				}
				break;
			case 5:
				if (!stack.empty()) {
					bw.write(stack.peek()+"\n");
				}else {
					bw.write("-1\n");
				}
				break;
			}
			
		}
		
		bw.flush();
		
		br.close();
		bw.close();
	}

}
//빼고 출력한다는 것은 제외하고 출력하는 말이 아님; 말 그대로 꺼내서 출력한다는 말..