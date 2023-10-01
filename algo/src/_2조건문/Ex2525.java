package _2조건문;

import java.util.Scanner;

public class Ex2525 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();

		int hour = (B + C) / 60;
		int minute = (B + C) % 60;

		A += hour;
		if (A > 23) {
			A -= 24;
		}
		
		System.out.println(A + " " + minute);
		
		sc.close();
	}

}
