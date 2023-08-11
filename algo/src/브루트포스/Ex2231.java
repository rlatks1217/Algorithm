package 브루트포스;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Ex2231 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			String N = br.readLine();
			int maxPlus = N.length()*9; 
			//n의 각 자리수를 다 더한다고 했을 때 각 자리수의 최대는 각각 9니까 더할 수 있는 최댓값은 (9*자리수)가 됨
			int n = Integer.parseInt(N);
			int startNum = n - maxPlus > 0 ? n - maxPlus : 1; 
			//최대로 더할 수 있는 숫자보다 작은 숫자가 n으로 주어진 경우 그냥 1부터 시작

			boolean constructor = false; 
			//1이 n으로 주어진 경우에는 while문이 실행되지 않음 -> else로 빠질 수 있게끔(0을 출력할 수 있게끔) 조건을 걸 boolean값이 필요함
			while (startNum < n) {
				String[] a = Integer.toString(startNum).split("");
				int sum = startNum;
				for (int i = 0; i < a.length; i++) {
					sum += Integer.parseInt(a[i]);
				}
				
				if (sum == n) {
					constructor = true;
					break;
				}else {
					constructor = false;
					startNum++;
				}
			}
			
			if (constructor) {
				bw.write(startNum + "");
			} else {
				bw.write("0");
			}
			bw.flush();
			
			br.close();
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
//각 자리수 구해서 더하는 것은 이렇게 써도 될 듯
//while(number != 0) {
//	sum += number % 10;	// 각 자릿수 더하기
//	number /= 10;
//}