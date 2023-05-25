package _programmers;

import java.util.Arrays;

public class 모의고사 {

	public static void main(String[] args) {
		int[] answer = {1,2,3,4,5,1,2};
		int[] result = solution(answer);
		
		System.out.println(Arrays.toString(result));
	}

	private static int[] solution(int[] answer) {
		//1번 수포
		int[] arr1 = {1,2,3,4,5};
		int count1 = 0;
		
		
		//2번 수포
		int[] arr2 = {1,3,4,5}; 
		int count2 = 0;
		int cnt = 0;
		//3번 수포
		int[] arr3 = {3,1,2,4,5}; 
		int count3 = 0;
		int idx = 0;
		
		for (int i = 0; i < answer.length; i++) {
			
			if(answer[i] == arr1[i%arr1.length]) { 
				count1++;
			}
			
			if (i==0 || i%2 == 0) {//짝수번째에는
				if(answer[i] == 2) {
					count2++;
				}
				if (answer[i] == arr3[idx]) {
					count3++;
				}				
			}else {
				if (answer[i] == arr2[cnt]) {
					count2++;
				}
				if (answer[i] == arr3[idx]) {
					count3++;
				}
				
				if (cnt == arr2.length -1) {
					cnt = 0;
				}else {
					cnt++;
				}
				
				if (idx == arr3.length -1) {
					idx = 0;
				}else {
					idx++;					
				}
			}
			
		}
		
		if (count1 < count2) {//2가 더 큼
			if(count2 > count3) {//2가 제일 큼
				int[] result = {2};
				return result;
			}else if (count2 == count3) {
				int[] result = {2,3};
				return result;				
			}else {
				int[] result = {3};
				return result;				
			}
		}else if (count1 == count2){
			if (count2 < count3) {
				int[] result = {3};
				return result;	
			}else if (count2 == count3){
				int[] result = {1,2,3};
				return result;
			}else {
				int[] result = {1,2};
				return result;	
			}
		} else {//1이 더 큰 경우
			if(count1 > count3) {
				int[] result = {1};
				return result;
			}else if (count1 == count3) {
				int[] result = {1,3};
				return result;				
			}else {
				int[] result = {3};
				return result;				
			}
		}
		
	}

}
