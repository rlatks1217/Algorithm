package _programmers;

public class 푸드파이트대회 {

	public static void main(String[] args) {
		int[] food = {1, 3, 4, 6};
		System.out.println(solution(food));
	}

	private static String solution(int[] food) {
		String answer = "";
		
		for (int i = 1; i < food.length; i++) {
			if (food[i] == 1) {
				continue;
			}
			for (int j = 0; j < food[i]/2; j++) {
				answer += i;
			} 
		}
		
		answer += "0";
		
		for (int i = food.length-1; i >= 1; i--) {
			if (food[i] == 1) {
				continue;
			}
			for (int j = 0; j < food[i]/2; j++) {
				answer += i;
			} 
		}
		
		return answer;
	}
	
	
}
