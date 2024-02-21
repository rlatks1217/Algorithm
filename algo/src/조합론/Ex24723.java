package 조합론;

import java.util.Scanner;

public class Ex24723 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		int result = 1;
		for (int i = 0; i < n; i++) {
			result *= 2;
		}
		
		System.out.println(result);
	}

}
