package 정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Ex1427 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String[] a = br.readLine().split("");
		
		br.close();
		
		Arrays.sort(a);
		
		for (int i = a.length-1; i >= 0; i--) {
			sb.append(a[i]);
		}
		
		System.out.println(sb);
	}

}
