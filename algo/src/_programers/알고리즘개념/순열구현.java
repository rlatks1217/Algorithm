package _programers.알고리즘개념;

import java.util.ArrayList;

//DFS 이용
public class 순열구현 {

	public static ArrayList<String> list = new ArrayList<String>();
	public static void main(String[] args) {
		int[] numberList = {1,2,3};
		int r = 2;
		
		boolean[] visited = new boolean[numberList.length];
		
		int count = 0;
		for (int i = 0; i < visited.length; i++) {
			permutation("" ,r, count, i, numberList, visited);
		}
		System.out.println(list);
		
		
	}

	private static void permutation(String case_, int endCount, int count, int numberIndex ,int[] numberList, boolean[] visited) {
		
		// 2개 뽑는 경우의 수를 모두 셌다면 해당 케이스를 list안에 저장
		if (count == endCount) {
			list.add(case_); 
			return;
		} else {
			visited[numberIndex] = true; //이 숫자는 썼다는 표시로 true처리
			count++; //고른 숫자의 개수 카운트
			
			//case_가 ""면 그냥 숫자 붙이고 아닐 경우 이미 붙어있는 숫자가 있다는 의미이므로 ,와 함께 숫자를 붙여준다.
			String a = "";
			if (!case_.equals("")) {
				a = case_+ "," + numberList[numberIndex];				
			} else {
				a = case_ + numberList[numberIndex];				
				
			}
			
			for (int i = 0; i < visited.length; i++) {
				// 안 썼던 숫자들의 경우 다시 재귀함수 호출해서 카운트
				if (!visited[i]) {
					permutation(a, endCount, count, i, numberList, visited);
				}
			}
			visited[numberIndex] = false; //1부터 2개 뽑는 경우의 수를 구했다면 2부터 2개 뽑는 경우의 수도 같은 visited 배열을 사용하므로 가장 마지막에 실앻된 permutation부터 차례로 다시 visited를 초기화해준다.
		}
		
	}

}
