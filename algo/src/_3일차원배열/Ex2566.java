package _3일차원배열;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Ex2566 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int max = 0;
		int row = 1;
		int col = 1;
		try {
			for (int i = 0; i < 9; i++) {
					String[] a = br.readLine().split(" ");
				for (int j = 0; j < 9; j++) {
					int num = Integer.parseInt(a[j]);
					if (max < num) {
						max = num;
						row = i%9+1;
						col = j%9+1;
					}
				}
			}
			
			bw.write(max + "\n");
			bw.write(row + " " + col);
			
			bw.flush();
			
			br.close();
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
