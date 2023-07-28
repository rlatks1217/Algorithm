package 일반수학;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Ex1193 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		int X = Integer.parseInt(br.readLine());
		
		int first = 1;
		int second = 1;
		
		boolean start = true;
		for (int i = 1; i < X; i++) {
			if (start) {
				if (first == 1) {
					second++;
					start = false;
					continue;
				}
				first--;
				second++;
			}else {
				if (second == 1) {
					first++;
					start = true;
					continue;
				}
				first++;
				second--;
			}
		}
		
		bw.write(first + "/" + second);
		bw.flush();
		br.close();
		bw.close();
	}

}
