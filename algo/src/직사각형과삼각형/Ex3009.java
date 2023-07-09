package 직사각형과삼각형;

import java.util.Scanner;

public class Ex3009 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		int x3 = sc.nextInt();
		int y3 = sc.nextInt();
		
		int x = 0;
		int y = 0;
		if (x1 == x2){
			x = x3;
			if (y3 == y1) {
				y = y2;
			} else {
				y = y1;
			}
		} else if (x1 == x3){
			x = x2;
			if (y2 == y1) {
				y = y3;
			} else {
				y = y1;
			}
		}else {
			x = x1;
			if (y1 == y2) {
				y = y3;
			} else {
				y = y2;
			}
		}
		System.out.println(x + " " + y);
		
		sc.close();
	}
}
