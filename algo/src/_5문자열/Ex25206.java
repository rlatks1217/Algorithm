package _5문자열;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Ex25206 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			double multipleSum = 0;
			double scoreSum = 0;
			for (int i = 0; i < 20; i++) {
				String[] a = br.readLine().split(" ");
				double score = 0;
				if (!a[2].equals("P")) {
					score = Double.parseDouble(a[1]);					
				}
				scoreSum += score;
				switch (a[2]) {
				case "A+":
					multipleSum += 4.5*score;
					break;
				case "A0":
					multipleSum += 4.0*score;
					break;
				case "B+":
					multipleSum += 3.5*score;
					break;
				case "B0":
					multipleSum += 3.0*score;
					break;
				case "C+":
					multipleSum += 2.5*score;
					break;
				case "C0":
					multipleSum += 2.0*score;
					break;
				case "D+":
					multipleSum += 1.5*score;
					break;
				case "D0":
					multipleSum += 1.0*score;
					break;
				case "F":
					multipleSum += 0;
					break;
				}
				
			}
			
			double result = multipleSum/scoreSum;
			bw.write(""+result);
			bw.flush();
			
			br.close();
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
