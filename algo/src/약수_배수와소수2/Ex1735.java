package 약수_배수와소수2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Ex1735 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int c1 = Integer.parseInt(st.nextToken());
		int p1 = Integer.parseInt(st.nextToken());
				
		st = new StringTokenizer(br.readLine());
		
		int c2 = Integer.parseInt(st.nextToken());
		int p2 = Integer.parseInt(st.nextToken());
		
		int bigger = Math.max(p1, p2);
		int smaller = Math.min(p1, p2);
		int rest = 0;
		int gcd = 0;
		while(true) {
			rest = bigger%smaller;
			if(rest > 0) {
				bigger = smaller;
				smaller = rest;
			} else {
				gcd = smaller;
				break;
			}
		}

		int pResult = p1*p2/gcd;
		int cResult = c1*(pResult/p1) + c2*(pResult/p2);
		bigger = Math.max(pResult, cResult);
		smaller = Math.min(pResult, cResult);
		rest = 0;
		gcd = 0;
		while(true) {
			rest = bigger%smaller;
			if(rest > 0) {
				bigger = smaller;
				smaller = rest;
			} else {
				gcd = smaller;
				break;
			}
		}
		
		bw.write(cResult/gcd + " " + pResult/gcd);
		bw.flush();
		
		br.close();
		bw.close();
	}

}
