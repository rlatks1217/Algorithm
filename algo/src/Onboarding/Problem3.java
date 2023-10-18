package Onboarding;

public class Problem3 {
	public static void main(String[] args) {
		int number = Integer.parseInt(args[0]);
		
		solution(number);
	}

	private static void solution(int number) {
		int clapCount = 0;
		for (int i = 1; i <= number; i++) {
			String numberString = Integer.toString(i);
			for (int j = 0; j < numberString.length(); j++) {
				char digitNumber = numberString.charAt(j);
				if (digitNumber == '3' || digitNumber == '6' || digitNumber == '9') {
					clapCount++;
				}
			}
		}
		
		System.out.println(clapCount);
	}
}

