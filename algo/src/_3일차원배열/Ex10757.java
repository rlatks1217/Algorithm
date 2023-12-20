package _3일차원배열;

import java.math.BigDecimal;
import java.util.Scanner;

public class Ex10757 {

	public static void main(String[] args) {
		// 풀이 1
		Scanner sc = new Scanner(System.in);
		BigDecimal A =  new BigDecimal(sc.next());
		BigDecimal B =  new BigDecimal(sc.next());
		System.out.println(A.add(B));
		sc.close();
	}

}
//BigDecimal : long보다 큰 범위의 수 셈할 때 사용
//그냥 구현할 시 각 자리 숫자를 1의자리부터 역순으로 배열에 옮겨담은 후 연산하여 구함