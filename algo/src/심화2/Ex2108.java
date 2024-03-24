package 심화2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ex2108 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] arr = new int[n];
		int[] plusCnt = new int[4001];
		int[] minusCnt = new int[4001];
		double sum = 0;
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];
			if (arr[i] >= 0) {
				plusCnt[arr[i]]++;
			} else {
				minusCnt[arr[i]*(-1)]++;				
			}
		}
		Arrays.sort(arr);

		System.out.println(Math.round(sum/n));
		System.out.println(arr[n/2]);
		
		List<Integer> list = new ArrayList<>(); // 최빈값 후보들
		int maxCnt = 0;
		for (int i = 1; i <= 4000; i++) {
			if (minusCnt[i] > maxCnt) {
				maxCnt = minusCnt[i];
				list = new ArrayList<>();
				list.add(i*(-1));
			} else if (minusCnt[i] == maxCnt) {
				list.add(i*(-1));
			}
		}
		for (int i = 0; i <= 4000; i++) {
			if (plusCnt[i] > maxCnt) {
				maxCnt = plusCnt[i];
				list = new ArrayList<>();
				list.add(i);
			} else if (plusCnt[i] == maxCnt) {
				list.add(i);
			}
		}
		list.sort(null);
		if (list.size() > 1) {
			System.out.println(list.get(1));			
		} else {
			System.out.println(list.get(0));						
		}
		
		System.out.println(arr[n-1] - arr[0]);
		
		sc.close();
	}

}
// 이전에 푼 방식이 틀린 이유는 -4000의 카운트는 세고 있지 않기 때문임