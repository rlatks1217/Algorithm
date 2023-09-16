package 스택2;

import java.util.Scanner;
import java.util.Stack;

public class Ex9012 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		Stack<String> stack = new Stack<String>();

		for (int i = 0; i < T; i++) {
			String[] arr = sc.next().split("");
			for (int j = 0; j < arr.length; j++) {
				if (arr[j].equals(")") && stack.size() > 0) {
					String a = stack.peek();
					if (a.equals("(")) {
						stack.pop();
					}
				}else {
					stack.push(arr[j]);
				}
			}
			
			if (stack.size() > 0) {
				System.out.println("NO");
			} else {
				System.out.println("YES");
			}
			
			stack.clear();
		}
		
		sc.close();
	}

}
