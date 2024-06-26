package 약수_배수와소수;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Ex9506 {

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		while(true) {
			try {
				int n = Integer.parseInt(br.readLine());
				
				if (n == -1) {
					break;
				}
				String sick = " 1";
				int sum = 1;
				
				for (int i = 2; i < n; i++) {
					if (n%i == 0) {
						sick += " + " + i;
						sum += i;
					}
				}
				
				if (n == sum) {
					bw.write(n+" ="+sick +"\n");
				}else {
					bw.write(n + " is NOT perfect." +"\n");
				}
				
				bw.flush();
				
				br.close();
				bw.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
		}
	}

}
