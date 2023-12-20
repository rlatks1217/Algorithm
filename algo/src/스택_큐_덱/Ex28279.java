package 스택_큐_덱;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;

public class Ex28279 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static Deque<Integer> deque = new LinkedList<>();
	
    public static void main(String[] args) throws Exception {
    	
    	int N = Integer.parseInt(br.readLine());
    	
    	for (int i = 0; i < N; i++) {
			String []arr  = br.readLine().split(" ");
			operation(arr);
		}
    	bw.flush();
    	br.close();
    	bw.close();
    }

	private static void operation(String[] arr) throws Exception {
		switch (arr[0]) {
		case "1":
			deque.offerFirst(Integer.parseInt(arr[1]));
			break;
		case "2":
			deque.offerLast(Integer.parseInt(arr[1]));			
			break;
		case "3":
			if (!deque.isEmpty()) {
				bw.write(deque.pollFirst() +"\n");										
			} else {
				bw.write(-1 +"\n");
			}
			break;
		case "4":
			if (!deque.isEmpty()) {
				bw.write(deque.pollLast() +"\n");										
			} else {
				bw.write(-1 +"\n");
			}
			break;
		case "5":
			bw.write(deque.size() + "\n");
			break;
		case "6":
			if (deque.isEmpty()) {
				bw.write(1 + "\n");
			} else {
				bw.write(0 + "\n");
			}
			break;
		case "7":
			if (!deque.isEmpty()) {
				bw.write(deque.peekFirst() + "\n");
			} else {
				bw.write(-1 +"\n");
			}
			break;
		case "8":
			if (!deque.isEmpty()) {
				bw.write(deque.peekLast() + "\n");
			} else {
				bw.write(-1 +"\n");
			}
			break;
		}
	}
}
//deque은 앞이 오른쪽/뒤가 왼쪽
//빼고 출력한다 => poll() 써서 출력하란 의미