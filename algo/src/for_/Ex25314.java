package for_;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Ex25314 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			int n = Integer.parseInt(br.readLine());
			
			int cnt = (n%4 == 0) ? n/4 : n/4+1; 
			String dataType = "int";
			
			for (int i = 0; i < cnt; i++) {
				dataType = "long " + dataType;
			}
			
			bw.write(dataType);
			bw.flush();
			
			br.close();
			bw.close();
			
		} catch(IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
