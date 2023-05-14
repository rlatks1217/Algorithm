package 알고리즘개념;

import java.util.Arrays;

public class 그리디_4 {

	public static void main(String[] args) {
		
		int N = 8;
		String mohomga = "1 2 2 2 3 3 3 3";
		String[] num = mohomga.split(" ");
		Arrays.sort(num);
		int people = 0;
		int result = 0;
		
		for (int i = 0; i < N; i++) {
			int a = Integer.parseInt(num[i]);
			people++;
			//현재 인덱스까지의 인원수가 현재 인덱스의 공포도(현재 인덱스의 공포도는 이제까지 나온 한 그룹의 공포도 중 가장 큼)와 비교했을 때 같거나 크면 한 그룹 형성
			if (people >= a) { 
				people = 0;
				result++;
			}
		}
		
		System.out.println(result);
		
	}

}
