package 직사각형과삼각형;

import java.util.Scanner;

public class Ex5073 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);


		while (true) {
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			if (a == 0) {
				break;
			}
			
			int max = Math.max(a, b);
			max = Math.max(max, c);
			
			if (max == a) {
				if (!(a < b + c)) {
					System.out.println("Invalid");
					continue;
				}
			} else if (max == b) {
				if (!(b < a + c)) {
					System.out.println("Invalid");
					continue;
				}
			} else if (max == c) {
				if (!(c < a + b)) {
					System.out.println("Invalid");
					continue;
				}
			}
	
			if (a == b) {
				if (b == c) {
					System.out.println("Equilateral");
				} else {
					System.out.println("Isosceles");
				}
			} else if (b == c) {
				System.out.println("Isosceles");
			} else if (a == c) {
				System.out.println("Isosceles");
			} else {
				System.out.println("Scalene");
			}

		}
		
		sc.close();
	}

}
