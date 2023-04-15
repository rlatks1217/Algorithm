package _programers;


import java.util.ArrayList;
import java.util.List;

public class 소수만들기 {

	public static void main(String[] args) {
		
		int[] nums = {1,2,7,6,4};
		
		List<Integer> sums = new ArrayList<>();
		
		for (int i = 0; i < nums.length; i++) {
			int sum = nums[i];
			for (int j = i+1; j < nums.length; j++) {
				sum += nums[j];
				for (int j2 = j+1; j2 < nums.length; j2++) {
					sum += nums[j2];
					sums.add(sum);
					sum -= nums[j2];
				}
				sum -= nums[j];
			}
		}
		
		
		int max = 0;
		for (int i = 0; i < nums.length; i++) {
			if (max <= nums[i]) {
				max = nums[i];
			}
		}
		
		//소수찾기
		boolean[] sosoo = new boolean[max*3+1];
		
		//일단 다 소수인 것처럼 초기화(2,3은 무조건 소수인 것을 이용할 것)
		for (int i = 2; i < sosoo.length; i++) {
			sosoo[i] = true;
		}
		
		//소수의 배수들 제거
		for (int i = 2; i*i <= max*3; i++) {
			if (sosoo[i]) {
				for (int j = i*i; j <= max*3; j+= i) {
					sosoo[j] = false;
				}
			}
		}
		
		int count = 0;
		
		for (int sum : sums) {
			boolean checkSosoo = true;
			for (int i = 2; i < sosoo.length; i++) {
				if (sosoo[i] && i != sum) {
					double cal = sum%i;
					if (cal == 0) {
						checkSosoo = false;
					}
				}
			}
			if (checkSosoo) {
				count++;
			}
		}
		
		System.out.println(count);
		
		//오답 이유 : 처음에 합산할 때 1,5,7와 1,4,8과 같이 다른 숫자조합이 다른 경우에도 같은 합이 나올 수 있다는 것을 간과함 
		//=> 두 케이스 모두 합이 소수가 될 때(13) count가 2번 올라가야 하는데 Set 자료구조를 이용하므로써 1번만 올라가게끔 구현한 것
		//해결 : 조합 개념을 활용하여 해결
		//(1번째 요소 선택했을 때 첫 요소 빼고 나머지중에 2번째 요소 선택하고 2번째 요소까지 선택했을 때 1,2번째 요소를 빼고 선택하게 하는 것을 코드로 구현)
		
	}

}
