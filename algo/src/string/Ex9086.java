package string;

import java.util.Scanner;

public class Ex9086 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		sc.nextLine();
		for (int i = 0; i < T; i++) {
			String a = sc.nextLine();
			System.out.print(a.charAt(0));
			System.out.println(a.charAt(a.length()-1));			
		}
		
		sc.close();
	}

}
