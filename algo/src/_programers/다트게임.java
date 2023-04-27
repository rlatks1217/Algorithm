package _programers;

import java.util.Arrays;

public class 다트게임 {

	public static void main(String[] args) {
		
		String dartResult = "1S2D*3T";
		
		String[] changes = new String[3];
		int[] score = new int[3];
		
		int cnt = 0;
		for (int i = 0; i < dartResult.length(); i++) {
			try {
				
				if(i != 0) {
					score[cnt] = Integer.parseInt(dartResult.charAt(i)+ "");
					changes[cnt] = dartResult.substring(0, i);
					dartResult = dartResult.replace(changes[cnt], "");
					cnt++;
					if (cnt == 2) {
						changes[cnt] = dartResult;
					}
				}
			}catch(Exception e){
				continue;
			}
			
		}
		
		System.out.println(Arrays.toString(changes));
		System.out.println(Arrays.toString(score));
		
//		for (int i = 0; i < changes.length; i++) {
//			
//			if (i == 0) {
//				if (changes[i].contains("S")) {
//					
//				}else if (changes[i].contains("S")) {
//					
//				}else if (changes[i].contains("T")) {
//					
//				}
//				
//				
//			}else {
//				
//			}
//			
//		}
		
		
	}

}
//substring(시작인덱스, 끝인덱스) : (시작 인덱스)부터 (끝인덱스 -1) 까지를 자른다.