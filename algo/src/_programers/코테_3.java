package _programers;

import java.util.Arrays;

public class 코테_3 {

	public static void main(String[] args) {
		System.out.println(solution("hellopython", "abcdefghijk", 3));
		
		char z = 'z';
		String b = Character.toString(z - 25);
//		System.out.println(b);
//		System.out.println(b);
		
	}

	private static String solution(String encrypted_text, String key, int rotation) {
		
		
		String[] changeWord = new String[encrypted_text.length()];
		for (int i = 0; i < encrypted_text.length(); i++) { //text 매개변수에 맞게 수정 필요
			int location = (key.charAt(i) - 'a') + 1; //플러스할 자리수
			int changeResult = encrypted_text.charAt(i) + location; //플러스한 결과
			if (changeResult > 'z') {
				changeWord[i] = Character.toString(changeResult - 26); //text 매개변수에 맞게 수정 필요				
			} else {
				changeWord[i] = Character.toString(changeResult);							
			}
		}
		
		//회전
		String answer = "";
		for (int i = 0; i < rotation; i++) {
			answer = "";
			String word = "";
			for (int j = 0; j < changeWord.length; j++) {
				word += changeWord[j];
				if (j == 0) { //처음 index면
					changeWord[0] = changeWord[changeWord.length-1];
				} else {
					changeWord[j] = word.charAt(j-1) + "";
				}
				answer += changeWord[j];
			}
		}
		
		return answer;
	}

}
