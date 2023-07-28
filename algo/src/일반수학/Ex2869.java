package 일반수학;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Ex2869 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] arr = br.readLine().split(" ");
		
		int A = Integer.parseInt(arr[0]);
		int B = Integer.parseInt(arr[1]);
		int V = Integer.parseInt(arr[2]);
		
	
		int result = (V - B)/(A - B);
//마지막 날은 미끄러지는지 안 미끄러지는지 모르니까 일단 상쇄시키기 위해 B를 빼줌(정상에 도달했다면 미끄러지지 않아도 되니까)
		
		
		if ((V - B)%(A - B) > 0) {
//나눴을 때 나머지가 있다는 말은 아직 꼭대기가 아니라는 의미임
//근데 (A - B)로 나눴기 때문에 나머지는 분명 A보다는 작을 것임
//그래서 나머지가 있을 경우에는 하루를 추가해주면 며칠이 걸리는지를 구할 수 있음
			result++;
		}
		
		bw.write(result+ "");
		bw.flush();
		
		br.close();
		bw.close();
		
	}

}
//시간 초과로 인해 반복문으로 풀면 안 됨!