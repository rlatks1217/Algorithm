package _3배열;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Ex10818 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		//2022 - 07 - 11
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());

		StringTokenizer st = new StringTokenizer(br.readLine());

		int[] arr = new int[N];
		
		for (int i = 0; i < N; i++) {

			arr[i] = Integer.parseInt(st.nextToken());

		}
		
		int min = arr[0];
		int max = arr[0];
		
		for (int j = 0; j < N; j++) {
			
			if (arr[j] > max) {
				max = arr[j];
			}
			
			if (arr[j] < min) {
				min = arr[j];
			}
			
		}
		
		bw.write(min+" "+max);
		bw.flush();
		br.close();
		bw.close();
		
		//2023 - 10 - 2
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		
//		int max = -1000000;
//		int min = 1000000;
//		
//		for (int i = 0; i < n; i++) {
//			int number = sc.nextInt();
//			if (number < min) {
//				min = number;
//			}
//			if (number > max) {
//				max = number;
//			}
//		}
//		
//		System.out.println(min + " " + max);
//		sc.close();
	}
}

//초기화를 배열의 첫번째 값으로 하자(배열의 값이 하나만 있을 땐 그게 최대값이자 최소값이니까)
