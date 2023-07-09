package 직사각형과삼각형;

import java.util.Scanner;

public class Ex1085 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		
		int lGap = x;
		int rGap = w - x;
		int tGap = h - y;
		int bGap = y;
		
		int a = Math.min(tGap, bGap);
		int b = Math.min(rGap, lGap);
		
		int result = Math.min(a, b);
		
		System.out.println(result);
		
		sc.close();
	}

}
