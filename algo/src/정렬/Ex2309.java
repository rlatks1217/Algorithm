package 정렬;

import java.util.Arrays;
import java.util.Scanner;

public class Ex2309 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[9];
		for (int i = 0; i < 9; i++) {
			arr[i] = sc.nextInt();
		}
		
		boolean[] check = new boolean[9];
		int result[] = new int[7];
		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			check[i] = true;
			for (int j = 0; j < arr.length; j++) {
				if (!check[j]) {
					check[j] = true;
				}else {
					continue;
				}
				for (int j2 = 0; j2 < arr.length; j2++) {
					if (!check[j2]) {
						check[j2] = true;
					}else {
						continue;
					}
					for (int k = 0; k < arr.length; k++) {
						if (!check[k]) {
							check[k] = true;
						}else {
							continue;
						}
						for (int k2 = 0; k2 < arr.length; k2++) {
							if (!check[k2]) {
								check[k2] = true;
							}else {
								continue;
							}
							for (int l = 0; l < arr.length; l++) {
								if (!check[l]) {
									check[l] = true;
								}else {
									continue;
								}
								for (int l2 = 0; l2 < arr.length; l2++) {
									if (!check[l2]) {
										sum = arr[i] + arr[j] + arr[j2] + arr[k] + arr[k2] + arr[l] + arr[l2];
										if (sum == 100) {
											result[0] = arr[i];
											result[1] = arr[j];
											result[2] = arr[j2];
											result[3] = arr[k];
											result[4] = arr[k2];
											result[5] = arr[l];
											result[6] = arr[l2];
										}
									} else {
										continue;
									}
								}
								check[l] = false;
							}
							check[k2] = false;
						}
						check[k] = false;
					}
					check[j2] = false;
				}
				check[j] = false;
			}
			check[i] = false;
		}
		
		Arrays.sort(result);
		for (int k = 0; k < result.length; k++) {
			System.out.println(result[k]);
		}
		
		sc.close();
	}
}
//전체 다 더한 것에서 2중for문으로 두 개만 빼는 게 훨씬 효율적