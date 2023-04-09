package array_;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex10807 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = 1;

		int N = sc.nextInt(); 
		sc.nextLine();
		String numbers = sc.nextLine();
		int v = sc.nextInt();
		int array[] = new int[N];
		StringTokenizer st = new StringTokenizer(numbers, " ");

		int cnt = 0;
		for (int i = 0; i < array.length; i++) {
			array[i] = Integer.parseInt(st.nextToken());
			if (array[i] == v) {
				cnt++;
			}

		}
		System.out.println(cnt);
	}

}
