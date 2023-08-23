package if_switch;

import java.util.Scanner;

public class Ex13458 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); //시험장 수
		
		int[] arr = new int[N]; 
		for (int i = 0; i < N; i++) {
			arr[i] = 1000000;
		}
		
		int B = sc.nextInt(); //총감독관 가능 수
		int C = sc.nextInt(); //부감독관 가능 수

		long result = 0;
		for (int i = 0; i < arr.length; i++) {
			int r = arr[i] - B;
			result++;
			if (r <= 0) {
				continue;
			}else {
				if (r%C > 0) {
					result += r/C + 1;
				} else {
					result += r/C;
				}
			}
		}
		System.out.println(result);
		
		sc.close();
	}

}
//최악의 경우의 수는 int로 받을 수 없음

//long 타입으로 선언해도 뒤에 L을 붙이지 않으면 값은 int로 받아 long 변수에 할당하는 꼴이 됨
//단, 직접 숫자를 변수에 할당하는 경우만 해당함