package 약수_배수와소수2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;

public class Ex17103 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		
		int[] numbers = new int[T];
		for (int i = 0; i < T; i++) {
			numbers[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(numbers);
		
		boolean[] checkPrime = new boolean[numbers[numbers.length-1]+1];
		for (int i = 2; i <= Math.sqrt(numbers[numbers.length-1]); i++) {
			if (checkPrime[i]) {
				continue;
			}
			
			for (int j = i+i; j <= numbers[numbers.length-1]; j += i) {
				checkPrime[j] = true;
			}
		}
		
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 2; j < numbers[i]; j++) {
				
			}
		}
	}
}
