package 입출력과사칙연산;

import java.util.Scanner;

public class Ex1008 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double a = (double)sc.nextInt();
		double b = (double)sc.nextInt();
		
		double answer = a/b;
		System.out.println(answer);
		
		sc.close();
	}

}
