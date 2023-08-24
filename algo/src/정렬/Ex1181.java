package 정렬;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Ex1181 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		String[] arr = new String[N];
		for (int i = 0; i < N; i++) {
			arr[i] = sc.next();
		}
		
		Arrays.sort(arr); //우선 순위가 낮은 알파벳 순 먼저
		Arrays.sort(arr, new Comparator<String>() {
			@Override
			public int compare(String str1, String str2) {
				return str1.length() - str2.length();
			}
			
		});
		
		for (int i = 0; i < arr.length; i++) {
			if (i != 0 && arr[i].equals(arr[i-1])) {
				continue;
			}
			System.out.println(arr[i]);
		}
		
		sc.close();
	}

}
//CompareTo() : 문자열 사전순으로 비교 -> compare() 안에서 이거 써도 괜찮을 듯