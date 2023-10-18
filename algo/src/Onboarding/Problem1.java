package Onboarding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] input1 = br.readLine().split(" ");
		String[] input2 = br.readLine().split(" ");
		solution(input1, input2);
		
	}
	
	private static void solution(String[] pobi, String[] crong) {
		
		if (!pageCheck(pobi, crong)) {
			System.out.println(-1);
			return;
		}
		
		int biggerValue1 = Math.max(calBiggerValue(pobi[0]), calBiggerValue(pobi[1]));
		int biggerValue2 = Math.max(calBiggerValue(crong[0]), calBiggerValue(crong[1]));
		
		if (biggerValue1 > biggerValue2) {
			System.out.println(1);
			return;
		}
		
		if (biggerValue1 > biggerValue2) {
			System.out.println(2);
			return;
		}
		
		System.out.println(0);
	}

	private static boolean pageCheck(String[] pobi, String[] crong) {
		boolean checkResult = true;
		
		int pobiPage1 = Integer.parseInt(pobi[0]);
		int pobiPage2 = Integer.parseInt(pobi[1]);
		int crongPage1 = Integer.parseInt(pobi[0]);
		int crongPage2 = Integer.parseInt(pobi[1]);
		
		if (pobiPage1 + 1 != pobiPage2) {
			checkResult = false;
		}
		
		if (crongPage1 + 1 != crongPage2) {
			checkResult = false;
		}
		
		return checkResult;
	}

	private static int calBiggerValue(String pageNum) {
		String []pageArr = pageNum.split("");
		
		int plusValue = 0;
		int multiplyValue = 0;
		for (int i = 0; i < pageArr.length; i++) {
			plusValue += Integer.parseInt(pageArr[i]);
			multiplyValue *= Integer.parseInt(pageArr[i]);
		}
		
		if (plusValue >= multiplyValue) {
			return plusValue;
		}
		
		return multiplyValue;
	}

}
