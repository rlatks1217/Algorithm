package 직사각형과삼각형;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;

public class Ex10101 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		
		if (a + b + c != 180) {
			bw.write("Error");
			bw.flush();
			return;
		}
		
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(a);
		set.add(b);
		set.add(c);
		
		if (set.size() == 1) {
			bw.write("Equilateral");
			bw.flush();
		} else if (set.size() == 2) {
			bw.write("Isosceles");
			bw.flush();			
		} else {
			bw.write("Scalene");
			bw.flush();						
		}
		
		br.close();
		bw.close();
	}

}
