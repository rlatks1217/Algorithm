package _3일차원배열;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Ex1475 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String N = br.readLine();
		
		int[] arr = new int[10];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = 1;
		}
		int result = 1;
		
		for (int i = 0; i < N.length(); i++) {
			int a = N.charAt(i) - '0';
			
			if (a == 6) {
				if (arr[a] >= 1) {
					arr[a]--;
				} else if (arr[9] >= 1) {
					arr[9]--;
				} else {
					result++;
					for (int j = 0; j < arr.length; j++) {
						arr[j]++;
					}
					arr[a]--;
				}
				continue;
			} else if (a == 9){
				if (arr[a] >= 1) {
					arr[a]--;
				} else if (arr[6] >= 1) {
					arr[6]--;
				} else {
					result++;
					for (int j = 0; j < arr.length; j++) {
						arr[j]++;
					}
					arr[a]--;
				}
				continue;
			}
			if (arr[a] >= 1) {
				arr[a]--;
			}else {
				result++;
				for (int j = 0; j < arr.length; j++) {
					arr[j]++;
				}
				arr[a]--;
			}
		}
		
		bw.write(result + "");
		bw.flush();
		
		br.close();
		bw.close();
	}

}
//안쪽에 있는 arr의 인덱스가 j여야 되는데 왜 자꾸 i로 쓰고 있음. 이런 거 실수 x
//12312345646 일 때 2세트로도 충분한데 이상하게 출력됐었음
//세트 하나 추가한 후에 해당 인덱스에서 하나 쓰는 것이니까 제거했어야 하는데 빠뜨림
//사실 배열의 각 요소값을 숫자가 들어올 때마다 센 다음 최댓값을 구하면 그게 답이 됨(처음 접근 방식)
//단, 6이나 9는 둘 중 하나의 숫자로 통일해야 함