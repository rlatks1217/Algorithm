package _3일차원배열;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Ex10798 {

	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[][] arr = new String[5][];
		int maxLength = 0;
		try {
			for (int i = 0; i < arr.length; i++) {
				String[] a = br.readLine().split("");
				arr[i] = a;
				if (maxLength < arr[i].length) {
					maxLength = arr[i].length;
				}
			}
			
			String result = "";
			for (int i = 0; i < maxLength; i++) {
				for (int j = 0; j < arr.length; j++) {
					if (i >= arr[j].length) {
						continue;
					}else {
						result += arr[j][i];					
					}
				}
			}
			
			bw.write(result);
			bw.flush();
			
			br.close();
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
