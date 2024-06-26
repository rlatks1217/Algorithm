package 약수_배수와소수;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Ex11653 {
	//N이 1인 경우 아무것도 출력하지 않음
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		try {
			int n = Integer.parseInt(br.readLine());
			
			if (n == 1) {
				return;
			}
			
			ArrayList<Integer> list = new ArrayList<Integer>();
			
			for (int i = 2; i <= n; i++) {
				if(n%i == 0) {
					list.add(i);
				}
			}
			
			int number = n;
			int cnt = 0;
			while(number > 1) {
				if (number%list.get(cnt) == 0) { 
					number = number/list.get(cnt);
					bw.write(list.get(cnt) +"\n");
					bw.flush();
				}else {
					cnt++;
				}
			}
			
			br.close();
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
