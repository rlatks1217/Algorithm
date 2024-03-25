package 재귀;

import java.util.Scanner;

public class Ex25501 {

	private static int cnt;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for (int i = 0; i < T; i++) {
			cnt = 0;
			String s = sc.next();
			System.out.println(isPalindrome(s) + " " + cnt);;
		}
		
		sc.close();
	}
	
	private static int isPalindrome(String s) {
		cnt++;
		int sLength = s.length();
		if (sLength <= 1) {
			return 1;
		}
		
		if (s.charAt(0) == s.charAt(sLength - 1)){
			s = s.substring(1, sLength - 1);
			return isPalindrome(s);
		}
		
		return 0;
	}
}