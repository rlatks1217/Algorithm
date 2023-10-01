package _2조건문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex1330 {

	public static void main(String[] args) throws IOException {
		
// Scanner 사용
//		Scanner sc = new Scanner(System.in);
//		
//		String numbers = sc.nextLine();
//		
//		String[] numberArray = numbers.split(" ");
//		
//		int A = Integer.parseInt(numberArray[0]);
//		int B = Integer.parseInt(numberArray[1]);
//		
//		if (A > B) {
//			System.out.println(">");
//		} else if (A < B) {
//			System.out.println("<");		
//		} else {
//			System.out.println("==");					
//		}

// BufferReader 사용 (Scanner보다 효율(속도) 좋음)
		BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
		
		String number = bw.readLine();
		
		StringTokenizer st = new StringTokenizer(number, " ");
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		if (A > B) {
			System.out.println(">");
		} else if (A < B) {
			System.out.println("<");		
		} else {
			System.out.println("==");					
		}

		
	}//main

}
