package _3배열;

import java.util.Scanner;

public class Ex8958 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// 케이스 수
		int cases = sc.nextInt();
		//퀴즈 담은 배열
		String[] quiz = new String[cases];
		for (int i = 0; i < cases; i++) {
			String result = sc.next();
			quiz[i] = result;
		}
		
		int score[] = new int[cases];
		char c = 'O';
		for (int i = 0; i < quiz.length; i++) {
			for (int j = 0; j < quiz[i].length(); j++) { //문자열의 길이만큼 돌면서 O인지 체크
				if (quiz[i].charAt(j) == c) { 
					int cnt = 0;
					for (int k = j; k >= 0; k--) { //O가 나온 데부터 처음까지 돌면서 연속으로 O면 갯수 셈
						if (quiz[i].charAt(k) == 'O') {
							cnt++;
						} else {
							break;
						}
					}
					score[i] += cnt;
				}
				
			}
		}
		
		for (int i = 0; i < score.length; i++) {
			System.out.println(score[i]);
		}
	}//main
	
	//문자열의 길이만큼 도는 걸로 설정한 것이 아니라 case의 갯수만큼 돌리니까 답이 이상하게 나왔던 것
}
