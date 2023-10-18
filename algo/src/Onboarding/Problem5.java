package Onboarding;

import java.util.Arrays;

public class Problem5 {

	public static void main(String[] args) {
		int money = 15000;
		
		solution(money);
	}

	private static void solution(int money) {
		int[] unit = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 1};
		int[] result = new int[9];
		
		for (int i = 0; i < 9; i++) {
			result[i] = money/unit[i];
			money %= unit[i];
		}
		
		System.out.println(Arrays.toString(result));
	}

}
