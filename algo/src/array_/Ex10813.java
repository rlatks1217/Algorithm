package array_;

import java.util.Scanner;

public class Ex10813 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int[] arr = new int[N+1];
		
		for (int i = 1; i < arr.length; i++) {
			arr[i] = i;
		}
		
		for (int i = 0; i < M; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			int changeNum = arr[a];
			arr[a] = arr[b];
			arr[b] = changeNum;
		}
		
		for (int i = 1; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		sc.close();
	}

}
