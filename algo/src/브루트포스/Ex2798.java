package 브루트포스;

import java.util.Arrays;
import java.util.Scanner;

public class Ex2798 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int[] resultArr = new int[n*n*n];
		
		int idx = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (i == j) {
					continue;
				}
				for (int k = 0; k < arr.length; k++) {
					if (i == k || j == k) {
						continue;
					} else {
						resultArr[idx] = arr[i] + arr[j] + arr[k];
						idx++;
					}
				}
			}
		}
		
		Arrays.sort(resultArr);
		int max = 0;
		for (int i = 0; i < resultArr.length; i++) {
			if (m >= resultArr[i]) {
				max = Math.max(max, resultArr[i]);
			} else {
				break;
			}
		}
		
		System.out.println(max);
		
		sc.close();
	}

}
//boolean 배열 사용해서 다시 풀어봐