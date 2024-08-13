package Doit;

import java.util.Scanner;
import java.util.Stack;

public class Ex1874 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		Stack<Integer> stack = new Stack<>();
		int number = 1;
		int idx = 0;
		while (true) {
			if (!stack.isEmpty() && arr[idx] == stack.peek()) {
				sb.append("- \n");
				stack.pop();
				idx++;
			} else if (number <= n){
				stack.add(number++);
				sb.append("+ \n");
			} else {
				break;
			}
		}
		
		if (stack.isEmpty()) {
			System.out.println(sb);
		} else {
			System.out.println("NO");
		}
		
		sc.close();
	}

}
