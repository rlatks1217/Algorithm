package 재귀;

import java.util.Scanner;

public class Ex10870 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int result = fibonacci(n);
		System.out.println(result);
		sc.close();
	}

	private static int fibonacci(int n) {
		if (n <= 1) {
			return n;
		}
		return fibonacci(n-1) + fibonacci(n-2);
	}
}