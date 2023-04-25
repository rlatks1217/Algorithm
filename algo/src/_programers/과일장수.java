package _programers;

import java.util.Arrays;

public class 과일장수 {

	public static void main(String[] args) {
		
		int[] appleScore = {4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2};
		int m = 3;
		
		int boxCount = appleScore.length/m;
		Arrays.sort(appleScore);
		int startIndex = appleScore.length-1;
		
		int answer = 0;
		
//1번 풀이
//		for (int j = 0; j < boxCount; j++) {
//			int min = appleScore[startIndex];
//			for (int i = startIndex; i > startIndex-m; i--) {
//				if (min > appleScore[i]) {
//					min = appleScore[i];
//				}
//			}
//			startIndex = startIndex-m;
//			answer += min*m;
//		}

//2번 풀이
//		for (int j = 0; j < boxCount; j++) {
//			answer += appleScore[startIndex-(m-1)]*m;
//			startIndex = startIndex-m;
//		}
		
		System.out.println(answer);
	}

}
