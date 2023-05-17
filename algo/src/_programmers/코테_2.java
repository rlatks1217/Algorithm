package _programmers;

import java.util.HashSet;
import java.util.Set;

public class 코테_2 {

	static Set<Integer> set = new HashSet<Integer>();
	
	public static void main(String[] args) {

		int[] arr = {5,3,9,13};
		System.out.println(solution(arr));
	}

	private static boolean solution(int[] arr) {
		
		int r = 2;
		int n = 7;
		combination(0, 0, r, arr);
		
		for (int i : set) {
			if (i == n) {
				return true;
			}
		}
		return false;
	}
	
    private static void combination(int case_, int start, int endCount, int[] numberList) {
        if (endCount == 0) {
        	set.add(case_);
            return;
        }

        
        for (int i = start; i <= numberList.length - endCount; i++) { 
            combination(case_ + numberList[i], i + 1, endCount - 1, numberList); 
        }
    }

}
