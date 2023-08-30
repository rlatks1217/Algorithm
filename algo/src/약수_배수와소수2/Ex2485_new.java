package 약수_배수와소수2;

import java.math.BigInteger;
import java.util.Scanner;

public class Ex2485_new {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		for (int i = 0; i < t; i++) {

			long num = sc.nextLong();

			BigInteger a = new BigInteger(num + ""); //문자열만 들어갈 수 있음

			if (a.isProbablePrime(10)) {

				System.out.println(a);

			} else {

				System.out.println(a.nextProbablePrime());

			}

		}

		sc.close();

	}

}
//BigInteger 이용하는 법 확인