package 일반수학;

import java.util.Scanner;

public class Ex2720 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		int quarter = 0;
		int dime = 0;
		int nickel = 0;
		int penny = 0;
		
		for (int i = 0; i < T; i++) {
			int c = sc.nextInt();
			
			quarter = c/25;
			c = c - quarter*25;
			
			dime = c/10;
			c = c - dime*10;
			
			nickel = c/5;
			c = c - nickel*5;
			
			penny = c;
			
			System.out.println(quarter + " " + dime + " " + nickel + " " + penny);
		}
		
		sc.close();
		
	}
	
}
