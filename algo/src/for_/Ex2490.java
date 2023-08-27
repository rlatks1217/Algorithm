package for_;

import java.util.Scanner;

public class Ex2490 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 3; i++) {
			int sum = 0;
			for (int j = 0; j < 4; j++) {
				int number = sc.nextInt();
				sum += number;
			}
			switch (sum) {
			case 1:
				System.out.println("C");
				break;
			case 2:
				System.out.println("B");
				break;
			case 3:
				System.out.println("A");
				break;
			case 4:
				System.out.println("E");
				break;
			default:
				System.out.println("D");
				break;
			}
			
		}
		
		sc.close();
	}

}
