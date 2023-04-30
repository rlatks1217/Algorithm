package _programers;

import java.util.Arrays;

public class 로또의최고순위와최저순위 {

	public static void main(String[] args) {
		
		int lottos[] = {1,1,1,1,1,1};
		int win_nums[] = {20, 9, 3, 45, 4, 35};
		
		int zeroCount = 0;
		int absolute = 0;
		
		for (int i = 0; i < 6; i++) {
			if (lottos[i] == 0) {
				zeroCount++;
				continue;
			}
			
			for (int j = 0; j < 6; j++) {
				if (lottos[i] == win_nums[j]) {
					absolute++;
				}
			}
		}
		
		int[] result = {zeroCount+absolute, absolute};
		
		if (absolute == 0) {
			if (zeroCount == 6) {
				result[0] = 1;
				result[1] = 6;								
			}else if (zeroCount == 0) {
				result[0] = 6;
				result[1] = 6;
			}
		} else {
			for (int i = 0; i < result.length; i++) {
				switch (result[i]) {
				case 6:
					result[i] = 1;
					break;
				case 5:
					result[i] = 2;
					break;
				case 4:
					result[i] = 3;
					break;
				case 3:
					result[i] = 4;
					break;
				case 2:
					result[i] = 5;
					break;
				default:
					result[i] = 6;
					break;
				}
			}
		}
		
		
		System.out.println(Arrays.toString(result));
		
		
	}

}
//continue를 사용하면 그 코드의 아랫부분들을 생략하고 다음 loop로 넘긴다. 
//모르는 숫자가 없으면서 하나도 못 맞추는 경우는 생각하지 않았음 => 모르는 숫자가 없다면 무조건 최대가 1이 된다고 생각함 x