package if_switch;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;

public class Ex19637 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] firstRow = br.readLine().split(" ");
		int N = Integer.parseInt(firstRow[0]);
		int M = Integer.parseInt(firstRow[1]);
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		int[] powerArray = new int[N];
		
		for (int i = 0; i < N; i++) {
			String[] nRow = br.readLine().split(" ");
			String title = nRow[0];
			int power = Integer.parseInt(nRow[1]);
			
			if (map.get(power) == null) {
				map.put(power, title);
				powerArray[i] = power;
				
			}
		}
		
		int[] arr = new int[M];
		for (int i = 0; i < M; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(powerArray);
		Arrays.sort(arr);

		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] <= powerArray[cnt]) {
				bw.write(map.get(powerArray[cnt]) + "\n");
			}else {
				cnt++;
				i--;
			}
		}
		
		bw.flush();
		
		br.close();
		bw.close();
	}

}
//3개의 칭호인 경우만 봐도 기존 로직에서는 cnt만 하나 +해서 버퍼에 집어넣음 => 정작 그 다음 요소값과의 비교는 안 함