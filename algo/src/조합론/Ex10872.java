package 조합론;

import java.util.Scanner;

public class Ex10872 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		int result = 1;
		for (int i = n; i >= 2; i--) {
			result *= i;
		}
		
		System.out.println(result);
	}

}
