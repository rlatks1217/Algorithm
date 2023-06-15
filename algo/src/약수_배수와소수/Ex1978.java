package 약수_배수와소수;

import java.util.Scanner;

public class Ex1978 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int cnt = 0;
		for (int i = 0; i < n; i++) {
			
			boolean primary = true;
			int number = sc.nextInt();
			
			if (number == 1) {
				continue;
			}
			
			for (int j = 2; j <= Math.sqrt(number); j++) {
				if(number%j == 0) {
					primary = false;
					break;
				}
			}
			
			if(primary) {
				cnt++;
			}
		}
		
		System.out.println(cnt);
		
		sc.close();
	}

}
