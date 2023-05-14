package 알고리즘개념;

public class 그리디_3 {

	public static void main(String[] args) {

		String s = "02984";

		int result = s.charAt(0) - '0';

		for (int i = 1; i < s.length(); i++) {
			int num = s.charAt(i-1) - '0';
			if (num <= 1) {
				result += s.charAt(i) - '0';
			} else {
				result *= s.charAt(i) - '0';
			}
		}
		
		System.out.println(result);
	}
	//대부분 연산의 경우 곱을 하는 것이 더하기를 하는 것보다 더 큰 결과를 반환함(0이나 1은 제외)
	//전 자리 숫자가 0,1인지 아닌지만 체크하고 그것에 따라 연산을 수행함(바로 전만 확인하고 현재 연산할 수를 연산했을 때 최대값은 어떤 연산자를 이용했을 때인가만 체크해주는 것) 
}
