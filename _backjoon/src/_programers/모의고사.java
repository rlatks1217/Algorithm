package _programers;

import java.util.HashSet;

public class 모의고사 {

	public static void main(String[] args) {
		
		int[] answer = {};
		
		HashSet<Integer> maxPoint = new HashSet<>();
		int answers[] = {1,2,3,4,5};
		
		int[] giveupMath1 = {1,2,3,4,5};
		int[] giveupMath2 = {1,3,4,5};
		int[] giveupMath3 = {3,1,2,4,5};
		
		int count1 = 0;
		int index1 = 0;
		
		int count2 = 0;
		int index2 = 0;
		
		int count3 = 0;
		int index3 = 0;
		boolean checkIndex = false;
		
		for (int i = 0; i < answers.length; i++) {
			
			//수포자 1
			if(giveupMath1[index1] == answers[i]) {
				count1++;
			}
			
			if (index1 == 4) {
				index1 = 0;
			}else {
				index1++;					
			}
			
			//수포자 2
			if(i == 0 || i%2 == 0) {
				if (2 == answers[i]) {
					count2++;
				}
			}else {
				if (giveupMath2[index2] == answers[i]) {
					count2++;
				}
				if (index2 == 3) {
					index2 = 0;
				}else {
					index2++;
				}
			}
			
			//수포자 3
			if(checkIndex) {
				if(giveupMath3[index3] == answers[i]) {
					count3++;
				}
				checkIndex = false;
				
				if(index3 == 4) {
					index3 = 0;
				}else {
					index3++;					
				}
				
			}else {
				if(giveupMath3[index3] == answers[i]) {
					count3++;
				}
				checkIndex = true;
			}
			
		}//end for
		
		if (count1 > count2) {
			if(count1 > count3) {
				maxPoint.add(1);
			}else if (count1 == count3) {
				maxPoint.add(1);
				maxPoint.add(3);
			}else {
				maxPoint.add(3);
			}
		} else if (count1 == count2) {
			if(count2 == count3) {
				maxPoint.add(1);
				maxPoint.add(2);
				maxPoint.add(3);
			}else if (count2 < count3) {
				maxPoint.add(3);
			}else {
				maxPoint.add(1);
				maxPoint.add(2);
			}
		}else { //count2가 더 큰 경우
			if(count2 > count3) {
				maxPoint.add(2);
			}else if (count2 == count3){
				maxPoint.add(2);
				maxPoint.add(3);
			}else {
				maxPoint.add(3);
			}
		}
		
		
		Object[] arr = maxPoint.toArray();
		int[] result = new int[maxPoint.size()];
		
		for (int i = 0; i < result.length; i++) {
			result[i] = Integer.parseInt(arr[i].toString());
//Object Type을 parseInt()를 통해 형변환하기 위해서는 toString으로 String으로 바꿔준 후 가능하다.
		}
		
		answer = result;
		
		for (int i : answer) {
			System.out.println(i);
		}
		
		
	}//end Main

}
