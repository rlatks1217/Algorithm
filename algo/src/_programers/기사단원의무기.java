package _programers;

public class 기사단원의무기 {

	public static void main(String[] args) {

		System.out.println(solution(5, 3, 2));
	}

	public static int solution(int number, int limit, int power) {

		int nums = 0;

		for (int i = 1; i <= number; i++) {
			int count = 0;
			for (int j = 1; j * j <= i; j++) {
				if (j * j == i) {
					count++;
				} else if (i % j == 0) {
					count += 2;
				}
				if (count > limit) {
					count = power;
					break;
				}
			}

			nums += count;

		}

		return nums;
	}
	
//해당 수의 제곱근까지만 약수의 여부를 체크하면 해당 수의 약수 및 약수의 갯수를 찾을 수 있음

}
