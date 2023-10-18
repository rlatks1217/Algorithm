package Onboarding;

public class Problem2 {
	
	public static void main(String[] args) {
		String cryptogram = args[0];
		solution(cryptogram);

	}

	private static void solution(String cryptogram) {
		for (int i = 1; i < cryptogram.length(); i++) {
			char before = cryptogram.charAt(i-1);
			char now = cryptogram.charAt(i);
			if (before == now) {
				String frontWord = cryptogram.substring(0, i-1);
				String backWord = cryptogram.substring(i+1, cryptogram.length());
				cryptogram = frontWord + backWord;
				i -= 2;
			}
		}
		
		System.out.println(cryptogram);
	}
}
