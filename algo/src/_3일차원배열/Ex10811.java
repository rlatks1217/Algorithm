package _3일차원배열;

import java.util.Scanner;

public class Ex10811 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();

		int[] arr = new int[N];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}

		for (int i = 0; i < M; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			int start = a;
			int end = b;
			for (int j = 0; j < (b-a+1)/2; j++) {
				//반복문 안의 (b-a+1)/2도 반복이 될 때마다 연산됨
				//그러므로 인덱스 역할을 하는 변수는 따로 있어야 함 안 그러면 영향을 미침
				int change = arr[start-1];
				arr[start-1] = arr[end-1];
				arr[end-1] = change;
				start++;
				end--;
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		sc.close();
		
		//복습
//    	Scanner sc = new Scanner(System.in);
//    	
//    	int n = sc.nextInt();
//    	int m = sc.nextInt();
//    	
//    	int[] arr = new int[n+1];
//    	for (int i = 1; i <= n; i++) {
//    		arr[i] = i;
//		}
//    	
//    	for (int i = 0; i < m; i++) {
//			int a = sc.nextInt();
//			int b = sc.nextInt();
//			
//			int count = b - a + 1;
//			
//			for (int j = 0; j < count/2; j++, a++, b--) {
//				int keep = arr[a];
//				arr[a] = arr[b];
//				arr[b] = keep;
//			}
//		}
//    	
//    	for (int i = 1; i < arr.length; i++) {
//			System.out.print(arr[i] + " ");
//		}
//    	sc.close();
	}

}

//(b-a+1)/2를 하는 이유 : 가장 첫번째와 끝번째 수부터 짝지어서 자리를 바꾸는 식으로 뒤집음
//그러므로 짝이 몇 번 지어지는지만 세어주면 되는 것 / +1을 한 이유는 첫자리 자신도 포함시키기 위함임