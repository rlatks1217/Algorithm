package 집합과맵;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;

public class Ex11478 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] arr = br.readLine().split("");
		Set<String> set = new HashSet<String>();
		
		for (int i = 0; i < arr.length; i++) {
			String a= "";
			int idx = i;
			while(idx < arr.length) {
				a += arr[idx];
				set.add(a);
				idx++;
			}
		}
		
		bw.write(set.size() + "");
		bw.flush();
		
		br.close();
		bw.close();
	}

}
