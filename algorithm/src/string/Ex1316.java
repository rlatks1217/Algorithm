package string;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;

public class Ex1316 {
	
	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			int N = Integer.parseInt(br.readLine());
			
			
			int count = 0;
			
			for (int j = 0; j < N; j++) {
				HashSet<String> set = new HashSet<String>();
				
				boolean group = true;
				
				String[] groupWords = br.readLine().split("");
				
				for (int i = 0; i < groupWords.length; i++) {
					if (i > 0) {	

						if (groupWords[i].equals(groupWords[i-1])) {
							set.add(groupWords[i]);					
						} else {
							
							for (String word : set) {
								if (groupWords[i].equals(word)) {
									group = false;
									break;
								} 
							}
							
							if (group) {
								set.add(groupWords[i]);													
							}
							
						}
						
					} else {
						set.add(groupWords[i]);	
					}
					
				}
				
				if (group) {
					count++;
				}
				
				set.clear();
				
			}
			
			bw.write(count + "");
			bw.flush();
		
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
}
