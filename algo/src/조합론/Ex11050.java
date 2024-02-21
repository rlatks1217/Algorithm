package 조합론;

import java.util.Scanner;

public class Ex11050 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		if (k == 0) {
			System.out.println(1);
			return;
		}
		sc.close();
		
		int nResult = 1;
		int kResult = 1;
		int mul = k;
		
		for (int i = 0; i < k; i++) {
			nResult *= n;
			kResult *= mul;
			n--;
			mul--;
		}
				
		System.out.println(nResult/kResult);
	}

}
