package 약수_배수와소수2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Ex13909_new {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		int result = 0;
		for (int i = 1; i*i <= n; i++) {
//각 i마다 i*i가 n보다 작다면 i*i는 i를 제곱한 수이자 n보다는 작은 제곱수라는 의미이므로 카운트
			result++;
		}
		
		bw.write(result+"");
		bw.flush();
		
		bw.close();
		br.close();
	}

}
//창문이 열려 있으려면 창문에 손 댄 횟수(열고 닫고 한 횟수)가 홀수 번이어야 함
//즉, 해당 수의 약수가 홀수개여야 한다는 의미(약수는 자기 자신 포함)
//약수가 홀수개인 수는 제곱수밖에 없음(ex - 1, 5, 25)

//메모리 초과 : 할당된 메모리를 초과된 경우 배열을 선언할 때 각 요소값에 초기화가 진행된다는 것은 특정 숫자가 할당된다는 것임
//즉, 할당된 숫자들이 메모리 용량을 초과해버려서 오류가 나는 것