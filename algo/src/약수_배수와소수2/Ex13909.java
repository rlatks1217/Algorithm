package 약수_배수와소수2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Ex13909 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		boolean[] nArr = new boolean[n+1];
		
		//true 열림
		//false 닫힘
		//1없이 다 true인 상태에서 진행
		for (int i = 2; i <= Math.sqrt(n); i++) {
			for (int j = i; j <= n; j+= i) {
				if (nArr[j]) {
					nArr[j] = false;
				} else {
					nArr[j] = true;
				}
			}
		}
		
		int result = 0;
		for (int i = 0; i < nArr.length; i++) {
			if (nArr[i]) {
				
			}
		}
		
		System.out.println(result);
	}

}
