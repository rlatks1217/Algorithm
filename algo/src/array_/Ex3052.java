package array_;

import java.util.Scanner;

public class Ex3052 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numbers[] = new int[10];

		for (int i = 0; i < 10; i++) {

			int a = sc.nextInt();
			numbers[i] = (a % 42);

		}

		int cnt = 0;
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < i; j++) {
				if ((i != 0) && (numbers[i] == numbers[j])) {
					cnt--;
					break;
				}
			}
			cnt++;
		}
		System.out.println(cnt);
	}

}
