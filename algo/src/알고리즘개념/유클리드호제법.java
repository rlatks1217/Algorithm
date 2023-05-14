package 알고리즘개념;

public class 유클리드호제법 {

	public static void main(String[] args) {
		
		int answer = gcd(192, 162);
		System.out.println(answer);
	}

	//재귀함수 이용
	private static int gcd(int i, int j) {
		
		if (i%j == 0) {
			System.out.println(i+" / "+j+" = "+i%j);
			return j;
		}else {
			return gcd(j, i%j);
		}
	}

}
