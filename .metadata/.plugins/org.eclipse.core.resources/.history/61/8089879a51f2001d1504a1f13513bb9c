package _programers.알고리즘개념;

import java.util.ArrayList;

//DFS 이용
public class 순열구현 {

	public static ArrayList<String> list = new ArrayList<String>();
	public static void main(String[] args) {
		int[] numberList = {1,2,3,4,5};
		int r = 2;
		
		boolean[] visited = new boolean[numberList.length];
		
		permutation("", r, numberList, visited);
		
		System.out.println(list);
		
		
	}

	   private static void permutation(String case_, int endCount, int[] numberList, boolean[] visited) {
	        if (case_.length() == endCount) {
	            list.add(case_);
	            return;
	        } else {
	            for (int i = 0; i < numberList.length; i++) {
	                if (!visited[i]) {
	                    visited[i] = true;
	                    permutation(case_ + numberList[i], endCount, numberList, visited);
	                    visited[i] = false; //가장 안쪽의 pernumtaion 안에서부터 차근차근 다 false로 바뀔 것임
	                }
	            }
	        }
	    }

}
