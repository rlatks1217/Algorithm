package _5문자열;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Ex2941 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		try {
			String word = br.readLine();

			int count = 0;
			for (int i = 0; i < word.length(); i++) {

					if (word.charAt(i) == 'c') {
						if (i < word.length() - 1) {							
							if (word.charAt(i + 1) == '=') {
								i++;
							} else if (word.charAt(i + 1) == '-') {
								i++;
							}
						}
					} 
					
					else if (word.charAt(i) == 'd') {
						if (i < word.length() - 1) {
							if (word.charAt(i + 1) == 'z') {
								if (i < word.length() - 2) {
									if (word.charAt(i + 2) == '=') {
										i += 2;
									}
								}
							}
							
							else if (word.charAt(i + 1) == '-') {
								i++;
							}
						}
					} 
					
					else if (word.charAt(i) == 'l') {
						if (i < word.length() - 1) {
							if (word.charAt(i + 1) == 'j') {
								i++;
							}
						}
					} 
					
					else if (word.charAt(i) == 'n') {
						if (i < word.length() - 1) {
							if (word.charAt(i + 1) == 'j') {
								i++;
							}
						}
					} 
					
					else if (word.charAt(i) == 's') {
						if (i < word.length() - 1) {
							if (word.charAt(i + 1) == '=') {
								i++;
							}
						}
					} 
					
					else if (word.charAt(i) == 'z') {
						if (i < word.length() - 1) {
							if (word.charAt(i + 1) == '=') {
								i++;
							}
						}
					}
				count++;
			}

			bw.write(count + "");
			bw.flush();
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}

//크로아티아 알파벳(2글자이상)을 카운트할 때 dz=의 경우 해당 인덱스(i)가 뒤에서 2번째 인덱스보다는 작아야 하고
//나머지 크로아티아 알파벳을 셀 때는 해당 인덱스가 맨 뒤에 인덱스보다는 작아야 뒤에 인덱스의 글자를 판단할 수 있다.
//그렇지 않을 경우 인덱스를 벗어났다는 오류를 만나게 됨
