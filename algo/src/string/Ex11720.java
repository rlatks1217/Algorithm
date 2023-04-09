package string;

import java.util.Scanner;

public class Ex11720 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		sc.nextLine();
		
		String[] number = sc.nextLine().split("");
		
		if (number.length == N) {
			int sum = 0;
			
			for (int i = 0; i < number.length; i++) {
				sum += Integer.parseInt(number[i]);
			}
			
			System.out.println(sum);
		}
		
	}

}
