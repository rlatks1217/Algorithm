package 일반수학;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Ex2822 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] score = new int[8];
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < 8; i++) {
			score[i] = Integer.parseInt(br.readLine());
			map.put(score[i], i+1);
		}
		
		Arrays.sort(score);
		
		int sum = 0;
		int[] result = new int[5];
		for (int i = 3; i < score.length; i++) {
			sum += score[i];
			result[i-3] = map.get(score[i]);
		}
		
		Arrays.sort(result);
		bw.write(sum + "\n");
		
		for (int idx : result) {
			bw.write(idx + " ");
		}
		
		bw.flush();
		
		br.close();
		bw.close();
	}

}
