package 알고리즘개념;

import java.util.Scanner;

public class Ex24264 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		long n = sc.nextLong();
		System.out.println(n*n);
		System.out.println(2);
		
		sc.close();
		
		
//byte a = 21*3;
//계산되는 피연산자들의 타입이 int 이하인 경우(byte, char, short, int) 결과값의 타입은 무조건 int타입임
//즉, byte끼리 곱해도, short 에서 byte를 빼도 결과값은 int임(스펙을 이렇게 정했음.)
//하지만 결과값이 할당할 변수의 범위를 벗어나지 않으면 묵시적으로 용인해줌
//대신 int변수 x int변수를 byte타입 변수에 할당할 경우에는 오류가 남
	}

}
//int x int의 결과가 int 범위를 넘어서면 sysout에 찍을 때 이상하게 결과가 나옴