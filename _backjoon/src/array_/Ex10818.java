package array_;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Ex10818 {

	public static void main(String[] args) throws NumberFormatException, IOException {
//
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		
//		int N = Integer.parseInt(br.readLine());
//
//		StringTokenizer st = new StringTokenizer(br.readLine());
//
//		int[] arr = new int[N];
//		
//		for (int i = 0; i < N; i++) {
//
//			arr[i] = Integer.parseInt(st.nextToken());
//
//		}
//		
//		int min = arr[0];
//		int max = arr[0];
//		
//		for (int j = 0; j < N; j++) {
//			
//			if (arr[j] > max) {
//				max = arr[j];
//			}
//			
//			if (arr[j] < min) {
//				min = arr[j];
//			}
//			
//		}
//		
//		bw.write(min+" "+max);
//		bw.flush();
//		br.close();
//		bw.close();
		
		String text = "1|2|3";
		String[] a = text.split("|"); 
		System.out.println(a[2]);
	}
}

//초기화를 배열의 첫번째 값으로 하자(배열의 값이 하나만 있을 땐 그게 최대값이자 최소값이니까)
