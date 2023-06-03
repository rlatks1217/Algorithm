package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex11718 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			String a;				
			while ((a = br.readLine()) != null) {
			    System.out.println(a);
			}
			
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
//무한 루프에 빠져도 상관없음 그냥 입력받은 내용을 모두 출력할 수 있기만 하면 됨
//br.readLine으로 아무 입력값을 받지 못한 경우 a는 당연히 null