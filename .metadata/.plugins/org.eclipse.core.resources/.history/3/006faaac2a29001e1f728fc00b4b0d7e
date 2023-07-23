package _programmers;

import java.util.Arrays;

public class 최소직사각형 {

	public static void main(String[] args) {
		int[][] sizes = { { 60, 50 }, { 30, 70 }, { 60, 30 }, { 80, 40 } };
//		solution(sizes);
	}

	private static int solution(int[][] sizes) {
		int answer = 0;

		int[] shortLength = new int[sizes.length];

		//1. 가로 세로를 모두 포함한 모든 길이에서 가장 긴 값 찾기 => 최종너비가 될 것
		//가로 세로 중 상대적으로 긴 값이 이 너비보다만 작으면 되니까
		int max = 0;
		for (int i = 0; i < sizes.length; i++) {
			int weight = sizes[i][0];
			int height = sizes[i][1];

			int maxLength = Math.max(weight, height);
			max = Math.max(max, maxLength);

			//각 가로 세로 중 비교적 작은 값 배열로 만듬
			if (weight >= height) {
				shortLength[i] = height;
			} else {
				shortLength[i] = weight;
			}
		}

		Arrays.sort(shortLength);
		
		//비교적 작은 값들 중 가장 큰 값이 높이가 된다면 해당 높이X최종너비 안에 들어가게 될 것
		int finalLength = shortLength[sizes.length-1];
		
		System.out.println(max);
		System.out.println(finalLength);
		return answer;
	}

}
//가로 세로 중 긴 것은 최종너비 안에 들어가게끔 하고 비교적 짧은 부분 중에 가장 긴 것이 들어갈 정도의 크기만 되면 된다는 것을 아는 게 중요