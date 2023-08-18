package 브루트포스;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Ex1436 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		int cnt = 666;
		String result = "";
		while (N > 0) {
			String a = Integer.toString(cnt);
			if (a.contains("666")) {
				N--;
				result = a;
			}
			cnt++;
		}
		
		bw.write(result);
		bw.flush();
		
		br.close();
		bw.close();
	}

}
//틀려도 테스트 케이스 돌려서 맞게 나오면 채점해보자..
//백준 제한 시간은 이내가 아니라 해당 시간 초에만 들어오면 되는 것임..