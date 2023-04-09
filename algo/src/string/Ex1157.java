package string;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Ex1157 {

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String input;
		try {
			input = br.readLine();
			String word = input.toUpperCase();
			int[] alpa = new int[26];
			int max = 0;
			char ch = '?';
			for (int i = 0; i < word.length(); i++) {
				alpa[word.charAt(i) - 'A']++; 
				//문자열의 길이만큼 반복문을 도는데 아스키코드의 성질(해당문자열을 char타입으로 변환 후 'A'를 빼주면 알파벳을 순서대로 나열했을 때 해당알파벳의 위치가 나오게 됨)
				//을 이용하여 그 위치의 배열의 숫자(횟수)를 증가시켜준다. 
			}

			for (int i = 0; i < alpa.length; i++) {
				if (max < alpa[i]) {
					max = alpa[i]; //최대값보다 큰 횟수가 나왔을 경우 업데이트
					ch = (char)(i + 'A'); //대문자로 찍을 것이므로 마찬가지로 아스키 코드의 성질을 활용하여 더해주고 int값을 char타입으로 형변환해준다.
				} else if (max == alpa[i]) {
					ch = '?'; //횟수가 같은 경우엔 물음표를 저장한다.
				}
			}
			
			bw.write(ch);
			bw.flush();
			
			//2중 for문으로 한 문자열에 대하여 모든 문자열을 비교하는 것이 아니라 새로운 알파벳 갯수만큼의 배열을 만들어 해당 알파벳이 반복적으로 나올 때마다 횟수를 증가시켜주는 것으로 해결한다.
			//2중 for문 사용 시 시간초과가 발생함!
			//그러니 아스키코드의 성질 활용을 하여 문제 푸는 것도 할 줄 알아야 함
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
