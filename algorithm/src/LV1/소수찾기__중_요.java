package LV1;

import java.util.Scanner;

public class 소수찾기__중_요 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int answer = 0;

		boolean[] isPrime = new boolean[n+1]; // 0~n까지 소수 여부를 저장할 배열

        // 2~n까지 모든 수를 소수로 초기화
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }

        // 에라토스테네스의 체 알고리즘을 이용하여 소수 찾기 / 에라토스테네스의 체 : 'N제곱근까지의 소수의 배수들을 제거해주게 되면 남은 수들은 모두 소수가 된다' 
        for (int i = 2; i*i <= n; i++) {
        // N제곱근보다 i가 크다면 소수라고 할지라도 N보다 클 것임 N보다 작은 수들 중 소수를 구하는 것이기 때문에 i*i <= n 라고 작성
            
        	if (isPrime[i]) { // i가 소수인 경우
                for (int j = i*i; j <= n; j += i) { // i의 배수들을 소수에서 제외(i의 첫번째 배수부터 시작하려고 int j = i*i로 작성)
                    isPrime[j] = false;
                }
            }
        }
        //j += i 는 j를 i만큼 계속 증가시키겠단 얘기 즉, index가 i의 배수가 되는 것임
        
        //정리하면 n=10이라고 했을 때 2의 배수와 3의 배수만 제거하게 되고(5는 10의 제곱근보다 크니까 해당 안됨)
        //결국 남은 수들이 2,3,5,7이 될 것임
        
        // 소수 개수 계산
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
            	answer++;
            	
            }
        }
		
		
	}

}
