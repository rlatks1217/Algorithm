package _5문자열;

import java.util.Scanner;

public class Ex10798 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] arr = new String[15];
		
		
		for (int i = 0; i < 5; i++) {
			String a = sc.nextLine();
			for (int j = 0; j < a.length(); j++) {
				arr[j] += a.charAt(j) + "";
			}
		}
		String result = "";
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == null) {
				break;
			}
			result += arr[i];
		}
		
		result = result.replace("null", "");
		
		System.out.println(result);
		
		sc.close();
	}
}
