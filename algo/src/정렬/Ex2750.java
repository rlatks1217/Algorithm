package 정렬;

import java.util.Scanner;
import java.util.TreeSet;

public class Ex2750 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		TreeSet<Integer> set = new TreeSet<Integer>();
		for (int i = 0; i < N; i++) {
			set.add(sc.nextInt());
		}
		for (Integer num : set) {
			System.out.println(num);
		}
		
		sc.close();
	}

}
