package Doit;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class Ex17298 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		int[] arr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		} 
		
		int[] answer = new int[n];
		Stack<Integer> stack = new Stack<>();
		stack.push(0);
		for (int i = 1; i < n; i++) {
			while (!stack.isEmpty() && arr[stack.peek()] < arr[i]) {
				answer[stack.pop()] = arr[i];
			}
			stack.push(i);
		}
		
		while (!stack.isEmpty()) {
			answer[stack.pop()] = -1;
		}
		
		for (int i = 0; i < answer.length; i++) {
			bw.write(answer[i] + " ");
		}
		
		bw.flush();
		
		br.close();
		bw.close();
	}

}
