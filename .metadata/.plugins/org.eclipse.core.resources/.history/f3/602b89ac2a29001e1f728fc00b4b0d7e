package _programmers;

public class 최댓값과최솟값 {

	public static void main(String[] args) {
		String s = "-1 -2 -3 -4";
		
		System.out.println(solution(s));
	}

	private static String solution(String s) {
		
		String[] arr = s.split(" ");
		
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
			int a = Integer.parseInt(arr[i]);
			min = Math.min(min, a);
			max = Math.max(max, a);
		}
		
		
		return min + " " + max;
	}

}
