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

	//if (arr[ch - 'a'] == -1) { arr(배열)을 처음에 모두 -1로 초기화 한 후 아스키코드를 연산한 결과로 나온 인덱스가 -1이면 그 자리에 단어의 순번(i)을 저장하도록 풀 수도 있음
	//	arr[ch - 'a'] = i;		소문자 알파벳에서 'a'를 뺐을 때 알파벳 순서가 나옴을 이용한 것
	//}
