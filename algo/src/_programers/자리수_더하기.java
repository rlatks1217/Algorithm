package _programers;

public class 자리수_더하기 {

	public static void main(String[] args) {
		
		
		System.out.println();
		
	}
	
	public static int solution(int n) {
		
		String[] number = (n + "").split("");
		
		int sum = 0;
		
		for (int i = 0; i < number.length; i++) {
			sum += Integer.parseInt(number[i]);
		}
		
		return sum;
	}

}
