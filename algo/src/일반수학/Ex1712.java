package 일반수학;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Ex1712 {

	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			String[] input = br.readLine().split(" ");
			
			int fixedPay = Integer.parseInt(input[0]);
			int manufacturePay = Integer.parseInt(input[1]);
			int price = Integer.parseInt(input[2]);
			
			long breakEvenPoint = 1;
			
			if (manufacturePay < price) { 
				breakEvenPoint += fixedPay/(price-manufacturePay);
			}else {
				breakEvenPoint = -1;
			}
			
			bw.write(breakEvenPoint + "");
			bw.flush();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
//판매가격 - 생산비용 = 순이익 --> 순이익의 합이 고정비용보다 커지는 시점을 구하면 되므로 고정비용/순이익을 해줌
//단, 처음부터 순이익이 더 클 경우를 생각해서 1을 default값으로 설정!

//long a = 2147483648;
//2147483648 이상은 L식별자를 넣어줘야 한다. 
//왜? 2147483648이라는 값은 변수 a에 저장하기 전에 임시로 메모리에 저장되는데 이때 임시로 저장하기 위해 사용하는 기본 데이터 타입이 int(4byte 데이터타입)라서이다.
//2147483647까지만 이 메모리에 저장할 수 있고 그 이상부터는 더 큰 공간에 저장해야 한다. --> 그 더 큰 공간에 할당하는 동작이 L식별자를 인식했을 때 이뤄지는 것이다