package 약수_배수와소수2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Ex4948 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		while(true) {
			int n = Integer.parseInt(br.readLine());
			
			if (n == 0) {
				break;
			}
			
			boolean[] checkPrime = new boolean[2*n+1];
			for (int i = n+1; i <= 2*n; i++) {
				
				if(checkPrime[i]) {
					continue;
				}
				
				for (int j = 2; j <= Math.sqrt(i); j++) {
					if (i != j && i % j == 0) {
						checkPrime[i] = true;
						break;
					}
				}
				
				if (!checkPrime[i]) {
					for (int j = i*2; j <= 2*n; j+=2) {
						checkPrime[j] = true;
					}
				}
			}
			
			int count = 0;
			for (int i = n+1; i < checkPrime.length; i++) {
				if (!checkPrime[i]) {
					count++;
				}
			}
			
			bw.write(count + "\n");
		}
		
		bw.flush();
		
		br.close();
		bw.close();
	}

}
//소수인지 굳이 확인하는 과정이 없어도 2부터 순회하면서 각 수의 배수만 다 소수가 아닌 걸로 표시해주면 결국 소수만 남음