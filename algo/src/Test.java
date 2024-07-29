import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.StringTokenizer;

public class Test {// 2초
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int s = Integer.parseInt(st.nextToken());
		int p = Integer.parseInt(st.nextToken());
		
		char[] dna = br.readLine().toCharArray();
		
		st = new StringTokenizer(br.readLine());
		int[] arr = new int[4];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int[] dnaArr = new int[s];
		for (int i = 0; i < s; i++) {
			
			switch (dna[i]) {
			case 'A':
				dnaArr[i] = 0;
				break;
			case 'C':
				dnaArr[i] = 1;
				break;
			case 'G':
				dnaArr[i] = 2;
				break;
			case 'T':
				dnaArr[i] = 3;
				break;
			}
		}
		
		
		for (int i = 0; i < p; i++) {
			
		}
		
		
		
	}

}
