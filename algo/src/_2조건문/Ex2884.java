package _2조건문;

import java.util.Scanner;

public class Ex2884 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int m = sc.nextInt();
		
		if (m - 45 >= 0) {
			System.out.println(h + " " + (m-45));
		} else {
			h = (h-1) < 0 ? 23 : (h-1);
			System.out.println(h + " " + (15+m));
		}
		
		sc.close();
	}

}
