package 기본수학1;

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