package _5문자열;

import java.util.Scanner;

public class Ex27866 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int i = sc.nextInt();
		
		System.out.println(s.charAt(i-1));
		
		sc.close();
	}

}
