package 시간복잡도;

import java.util.Scanner;

public class Ex24265 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		
		System.out.println(n*(n-1)/2); //1부터 n-1까지의 합
		System.out.println(2);
		
		sc.close();
	}

}
