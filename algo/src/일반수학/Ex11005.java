package 일반수학;

import java.util.Scanner;

public class Ex11005 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int B = sc.nextInt();
		
		String result = Integer.toString(N, B);
		result = result.toUpperCase();
		
		System.out.println(result);
		
		sc.close();
		
	}

}

//A: 10, B: 11, ..., F: 15, ..., Y: 34, Z: 35 의 의미
// 101111 -> ABB 이런 식으로 바꿀 수 있다는 소리임(단, 진법의 종류에 따라 어디가 알파벳일지는 모름)