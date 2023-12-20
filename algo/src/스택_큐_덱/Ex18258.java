package 스택_큐_덱;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Ex18258 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		
		Queue<Integer> queue = new LinkedList<Integer>();
		
		StringTokenizer st;
		
		int back = 0;
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			String command = st.nextToken();
			
			int num = 0;
			if (command.equals("push")) {
				num = Integer.parseInt(st.nextToken());
			}
			
			switch (command) {
			case "push":
				queue.offer(num);
				back = num;
				break;
			case "pop":
				if (!queue.isEmpty()) {
					sb.append(queue.poll() + "\n");
				} else {
					sb.append("-1\n");
				}
				break;
			case "size":
				sb.append(queue.size()+"\n");
				break;
			case "empty":
				if (queue.isEmpty()) {
					sb.append("1\n");
				}else {
					sb.append("0\n");
				}
				break;
			case "front":
				if(queue.isEmpty()) {
					sb.append("-1\n");
				} else {
					sb.append(queue.peek()+"\n");
				}
				break;
			case "back":
				if(queue.isEmpty()) {
					sb.append("-1\n");
				} else {
					sb.append(back + "\n");
				}
				break;
			}
		}
		
		System.out.println(sb.toString());
		br.close();
	}

}
//toArray로 바꾸는 연산이 들어가면 시간 초과가 나옴..
