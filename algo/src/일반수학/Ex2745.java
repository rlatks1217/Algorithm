package 일반수학;

import java.util.Scanner;

public class Ex2745 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String N = sc.next();
		int B = sc.nextInt();
		
		int num = Integer.parseInt(N, B); //B진수의 숫자인 N을 10진수로 바꾸는 코드
		
		System.out.println(num);
		
		String num16Str = Integer.toString(num, 16); //10진수인 숫자 num을 16진수로 바꾸는 코드 
		
		System.out.println(num16Str);
		sc.close();
	}

}
