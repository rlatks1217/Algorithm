package string;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Ex1152 {

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String wordList;
		try {
			wordList = br.readLine();
			StringTokenizer st = new StringTokenizer(wordList, " ");
			
			int cnt = 0;
			while (st.hasMoreTokens()) {
				st.nextToken();
				cnt++;
			}
			
			bw.write(cnt +"");
			bw.flush();
			
			br.close();
			bw.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

	}

}
