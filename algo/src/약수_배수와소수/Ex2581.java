package 약수_배수와소수;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Ex2581 {

	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			int M = Integer.parseInt(br.readLine());
			int N = Integer.parseInt(br.readLine());
			ArrayList<Integer> list = new ArrayList<>();
			
			int sum = 0;
			for (int i = M; i <= N; i++) {
				if (i == 1) {
					continue;
				}
				boolean primary = true;
				for (int j = 2; j <= Math.sqrt(i); j++) {
					if(i%j == 0) {
						primary = false;
						break;
					}
				}
				
				if(primary) {
					sum += i;
					list.add(i);
				}
			}
			
			if (sum != 0) {
				bw.write(sum + "\n" + list.get(0));
			}else {
				bw.write("-1");
			}
			bw.flush();				
			
			br.close();
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
