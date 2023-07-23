package 직사각형과삼각형;

import java.util.Scanner;

public class Ex14215 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int max = Math.max(a, b);
		max = Math.max(max, c);
		
		if (max == a) {
			if (!(a < b + c)) {
				a = b + c - 1;
			}
		} else if (max == b){
			if (!(b < a + c)) {
				b = a + c - 1;
			}
		} else {
			if (!(c < a + b)) {
				c = a + b - 1;
			}
		}
		
		System.out.println(a + b + c);
		sc.close();
	}

}
//해론의 공식 (변의 길이만으로 넓이를 구할 수 있음) -> 여기선 안 쓰임
//삼각형 조건만 맞춰주면 됨
