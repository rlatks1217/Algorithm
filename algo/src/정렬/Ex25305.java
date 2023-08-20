package 정렬;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Ex25305 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int k = sc.nextInt();
		
		Integer[] arr = new Integer[N];
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr, Collections.reverseOrder());
		
		System.out.println(arr[k-1]);
		
		sc.close();
	}
}
