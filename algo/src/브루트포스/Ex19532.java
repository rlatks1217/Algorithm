package 브루트포스;

import java.util.Scanner;

public class Ex19532 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		int f = sc.nextInt();
		
		int x = 0;
		int y = 0;
		
		boolean stop = false;
		for (int i = -999; i < 1000; i++) {
			for (int j = -999; j < 1000; j++) {
				if (a*i + b*j == c && d*i + e*j == f) {
					x = i;
					y = j;
					stop = true;
					break;
				}
			}
			if (stop) { //찾았으면 멈춤
				break;
			}
		}
		
		System.out.println(x + " " + y);
		
		sc.close();
	}

}
