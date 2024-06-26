package 알고리즘개념;

public class 그리디_1 {

	public static void main(String[] args) {
		//거스름돈 구현
		int N = 1260;
		int[] coin = {500, 100, 50, 10};
		int sum = 0;
		for (int co : coin) {
			sum += N/co;
			N = N%co;
		}
		
		System.out.println(sum);
	}
	//가장 큰 단위의 화폐부터 거슬러 주는 것이 최적의 해를 보장하는 이유
	//큰 단위가 항상 작은 단위의 배수이기 때문임
	//즉, 800원을 거슬러줘야 할 때 500, 400, 100이 배열로 주어진다면 그리디 알고리즘으로 해결할 수 없는 것임
	//(5100은 400의 배수가 아님)
}
