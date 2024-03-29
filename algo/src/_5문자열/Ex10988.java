package _5문자열;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Ex10988 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			String pelindrop = br.readLine();
			
			int result = 1;
			while (pelindrop.length() > 1) {
				char a = pelindrop.charAt(0);
				char b = pelindrop.charAt(pelindrop.length()-1);
				
				if(a == b) {
					pelindrop = pelindrop.substring(1, pelindrop.length()-1);
				}else {
					result = 0;
					break;
				}
			}
			bw.write(result + "");
			bw.flush();
			
			br.close();
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
