package _5문자열;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Ex3003 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String per = "112228";
		try {
			String[] input = br.readLine().split(" ");
			String answer = "";
			
			for (int i = 0; i < 6; i++) {
				int number = per.charAt(i) - '0';
				int current = Integer.parseInt(input[i]);
				int gap = (number - current);
				
				if(gap == 0) {
					answer += "0 ";
				} else {
					answer += gap + " ";					
				}
			}
			
			bw.write(answer);
			bw.flush();
		
			br.close();
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
