package 약수_배수와소수2;

import java.util.Scanner;

public class Ex13241 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long a = sc.nextLong();
		long b = sc.nextLong();
		
		long bigger = Math.max(a, b);
		long smaller = Math.min(a, b);
		long rest = 0;
		long result = 0;
		while(true) {
			rest = bigger%smaller;
			if (rest > 0) {
				bigger = smaller;
				smaller = rest;
			} else {
				result = smaller;
				break;
			}
		}
		
		System.out.println(a*b/result);
		
		sc.close();
	}

}
