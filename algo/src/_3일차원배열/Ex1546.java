package _3일차원배열;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex1546 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		sc.nextLine();
		String score = sc.nextLine();

		StringTokenizer st = new StringTokenizer(score, " ");
		int[] subjects = new int[N];
		for (int i = 0; i < N; i++) {
			subjects[i] = Integer.parseInt(st.nextToken());
		}

		int max = 0;
		for (int i = 0; i < subjects.length; i++) {
			if (subjects[i] >= max) {
				max = subjects[i];
			}
		}
		
		double[] naljo = new double[N];
		for (int i = 0; i < subjects.length; i++) {
			naljo[i] = (double)subjects[i]/max*100; 
			//int끼리 계산했으므로 계산 결과도 int타입일 것임-->하지만 계산 결과가 소수가 나오기 때문에 double로 바꾸지 않으면 0이하 수는 나오지 않을 것
		}
		
		double sum = 0;
		for (int i = 0; i < subjects.length; i++) {
			sum += naljo[i];
		}

		System.out.println(sum/N);
	}

}
