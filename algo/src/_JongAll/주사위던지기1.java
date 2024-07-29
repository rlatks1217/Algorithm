package _JongAll;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 주사위던지기1 {
	static int N, M, num[];

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String[] data = reader.readLine().split(" ");

		/**
		 * 멤버 변수 설정
		 */
		N = Integer.parseInt(data[0]);
		M = Integer.parseInt(data[1]);
		num = new int[N];

		switch (M) {
		case 1:
			dice1(0, 0);
			break;
		case 2:
			dice2(0, 0, 1);
			break;
		case 3:
			dice3(0, 0, 0);
			break;
		}
	}

	/**
	 * 모든 경우의 수 나열
	 * @param idx
	 * @param cnt
	 */
	public static void dice1(int idx, int cnt) {
		if (cnt == N) {
			print();
			return;
		}
		for (int i = 1; i <= 6; i++) {
			num[idx] = i;
			dice1(idx + 1, cnt + 1);
		}
	}

	/**
	 * 중복되는 경우의 제거
	 * 숫자는 이전 숫자의 다음부터 시작(경우의 수를 나열해보고 패턴을 파악할 것)
	 * @param idx
	 * @param cnt
	 * @param before 이전 입력 값
	 */
	public static void dice2(int idx, int cnt, int before) {
		if (cnt == N) {
			print();
			return;
		}
		for (int i = before; i <= 6; i++) {
			num[idx] = i;
			dice2(idx + 1, cnt + 1, i);
		}
	}

	/**
	 * 중복되는 숫자 없이 구성 - 순열
	 * flag와의 bit 마스킹 연산을 이용해 해당 제승에서의 값이 있는지 확인
	 * @param idx
	 * @param cnt
	 * @param flag
	 */
	public static void dice3(int idx, int cnt, int flag) {
		if (cnt == N) {
			print();
			return;
		}
		for (int i = 1; i <= 6; i++) {
			if ((flag & (1 << i)) == 0) {
				num[idx] = i;
				dice3(idx + 1, cnt + 1, flag | 1 << i);
				// 비트 연산자
				// 쉬프트 연산자 : '<<'일 땐 나누기2, '>>'일 땐 나누기 2(홀수를 나눌 땐 맨마지막 1은 삭제되므로 int형을 나눗셈했을 때와 같은 결과 반환)
				// & 연산자 : 모두 1일 때 1을 반환(else 0 반환)
				// | 연산자 : 1일 때 1을 반환(else 0반환)
			}
		}
	}

	/**
	 * 배열 내용 출력
	 */
	public static void print() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < num.length; i++) {
			sb.append(num[i]);
			sb.append(" ");
		}
		System.out.println(sb);
	}
}