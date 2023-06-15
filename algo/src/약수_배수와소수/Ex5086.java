package 약수_배수와소수;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Ex5086 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			
			while(true) {
				
				String[] numbers = br.readLine().split(" ");
				
				if (numbers[0].equals("0")) {
					break;
				}
				
				int a = Integer.parseInt(numbers[0]);
				int b = Integer.parseInt(numbers[1]);
				
				
				if (a > b) {
					if (a%b == 0) {
						bw.write("multiple" +"\n");
						bw.flush();
						continue;
					}
				}else {
					if (b%a == 0) {
						bw.write("factor" +"\n");
						bw.flush();
						continue;
					}
				}
				bw.write("neither" +"\n");
				bw.flush();
			}
			
			br.close();
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
