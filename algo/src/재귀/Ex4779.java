package 재귀;

import java.util.Scanner;

public class Ex4779 {
	private static StringBuilder sb;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int N = sc.nextInt();
			Line(N);
		}
		sc.close();
	}

	private static void Line(int n) {
		sb = new StringBuilder();
		int length = (int) Math.pow(3, n);
		for (int i = 0; i < length; i++) {
			sb.append("-");
		}

		replaceString(0, length);
		System.out.println(sb);
	}

	private static void replaceString(int start, int totalLength) {
		if (totalLength == 1) {
			return;
		}
		
		int replaceLength = totalLength / 3;
		for (int i = start + replaceLength; i < start+replaceLength*2; i++) {
			sb.setCharAt(i, ' ');
		}
		
		replaceString(start, replaceLength);
		replaceString(start+replaceLength*2, replaceLength);
	}
}
