package _5문자열;

import java.util.Scanner;

public class Ex2675 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for (int i = 0; i < T; i++) {
			int R = sc.nextInt();
			String[] S = sc.next().split("");
			String result = "";
			for (int j = 0; j < S.length; j++) {
				for (int k = 0; k < R; k++) {
					result += S[j];
				}
			}
			System.out.println(result);
		}
		
	}
}
