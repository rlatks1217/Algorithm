package _programmers;


public class 키패드누르기 {

	public static void main(String[] args) {
		
		int[] numbers = {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
		System.out.println(solution(numbers, "left").equals("LRLLRRLLLRR"));
	}

	private static String solution(int[] numbers, String hand) {
		StringBuilder answer = new StringBuilder();
		
		int[][] keypad = {{1,0},   {0, 3}, {1 ,3}, {2 ,3},   {0, 2}, {1, 2}, {2, 2},   {0, 1}, {1, 1}, {2, 1}};
		
		int[] left = {0, 0};
		int[] right = {2, 0};
		
		for (int number : numbers) {
			if (number == 3 || number == 6 || number == 9) {
				answer.append("R");
				right = keypad[number];
				continue;
			}else if (number == 1 || number == 4 || number == 7) {
				answer.append("L");
				left = keypad[number];
				continue;
			}
			
			//거리 계산
			int Lwidth = (keypad[number][0] - left[0] < 0) ? (keypad[number][0] - left[0])*(-1): keypad[number][0] - left[0];
			int Lheight = (keypad[number][1] - left[1] < 0) ? (keypad[number][1] - left[1])*(-1): keypad[number][1] - left[1];
			int Ldistance = Lwidth + Lheight;
			
			int Rwidth = ( keypad[number][0] - right[0] < 0 ) ? (keypad[number][0] - right[0])*(-1): keypad[number][0] - right[0];
			int Rheight = ( keypad[number][1] - right[1] < 0 ) ? (keypad[number][1] - right[1])*(-1): keypad[number][1] - right[1];
			int Rdistance = Rwidth + Rheight;
			
			//왼손이 더 가까우면
			if (Ldistance < Rdistance) {
				answer.append("L");
				left = keypad[number];
			} else if (Ldistance > Rdistance) {
				answer.append("R");
				right = keypad[number];
			}else {
				//같을 때
				if (hand.equals("right")) {
					answer.append("R");
					right = keypad[number];
				} else {
					answer.append("L");
					left = keypad[number];
				}
			}
		}
		return answer.toString();
	}

}

//keypad[number][0] - left[0]*(-1) ==> 빼기 먼저 하고 싶으면 당연히 괄호 있어야 되는데..;
