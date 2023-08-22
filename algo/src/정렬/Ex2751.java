package 정렬;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.TreeSet;

public class Ex2751 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		TreeSet<Integer> set = new TreeSet<Integer>();
		for (int i = 0; i < N; i++) {
			set.add(Integer.parseInt(br.readLine()));
		}
		
		for (Integer num : set) {
			bw.write(num+"\n");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}

}
