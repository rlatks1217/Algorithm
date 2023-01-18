package string;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Ex2908 {

	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			String[] twoNum = br.readLine().split(" ");

			int[] numList = new int[2];
			
			for (int i = 0; i < twoNum.length; i++) {
				String number = "";
				for (int j = twoNum[i].length()-1; j >= 0; j--) {
					number = number + twoNum[i].charAt(j); 
				}
				numList[i] = Integer.parseInt(number);
			}
			
			if (numList[0]>numList[1]) {
				bw.write(numList[0] + "");
			} else {
				bw.write(numList[1] + "");
			}
			
			bw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
//write는 반드시 문자열은 인자로 줘야 함
