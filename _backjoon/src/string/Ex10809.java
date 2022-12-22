package string;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Ex10809 {

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		try {
			String s = br.readLine();
			String al = "abcdefghijklmnopqrstuvwxyz";
			String[] result = new String[26];

			for (int i = 0; i < al.length(); i++) {
				for (int j = 0; j < s.length(); j++) {
					if (al.charAt(i) == s.charAt(j)) {
						result[i] = j+"";
						break;
					}
				}

				if (result[i] == null) {
					result[i] = "-1";
				}
			}

			for (int i = 0; i < result.length; i++) {
				bw.write(result[i] + " ");
			}

			bw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
