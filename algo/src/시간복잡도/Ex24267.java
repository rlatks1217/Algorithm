package 시간복잡도;

import java.util.Scanner;

public class Ex24267 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long n = sc.nextLong();
		
		System.out.println(n*(n-1)*(n-2)/6); //실행되는 횟수는 조합인 nC3하는 것과 같음
		System.out.println(3);
		
		sc.close();
	}

}
