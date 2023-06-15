package 약수_배수와소수;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex2501 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		for (int i = 2; i <= N; i++) {
			if (N%i == 0) {
				list.add(i);				
			}
		}
		if (list.size() < K) {
			System.out.println(0);
		}else {
			System.out.println(list.get(K-1));
		}
		
		sc.close();
	}

}
