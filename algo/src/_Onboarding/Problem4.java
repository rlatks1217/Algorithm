package _Onboarding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem4 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String word = br.readLine();
		
		solution(word);

		//알파벳인지 확인
		//대문자인지 소문자인지 먼저 판단
		//사전대로 바꿔서 문자열 합치기
	}

	private static void solution(String word) {
		String resultWord = "";
		for (int i = 0; i < word.length(); i++) {
			char letter = word.charAt(i);
			if (!alphabetCheck(letter)) {
				resultWord += letter;
				continue;
			}
			resultWord += convertLetter(letter);
		}
		System.out.println(resultWord);
	}


	private static boolean alphabetCheck(char letter) {
		boolean isAlphabet = true;
		if (letter > 90 && letter < 97) {
			isAlphabet = false;
		}
		if (letter < 65 || letter > 122) {
			isAlphabet = false;
		}
		
		return isAlphabet;
	}
	
	private static char convertLetter(char letter) {
		if (letter >= 65 && letter <= 90) {
			letter = (char) ('A' + ('Z' - letter));
		}
		if (letter >= 97 && letter <= 122) {
			letter = (char) ('a' + ('z' - letter));
		}
		
		return letter;
	}

	

}
