package 약수_배수와소수2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;

public class Ex2485 {

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		try {
			int N = Integer.parseInt(br.readLine());

			long[] arr = new long[N - 1];
			Set<Long> set = new HashSet<Long>();
			long beforeLocation = 0L;
			for (int i = 0; i < N; i++) {
				long location = Long.parseLong(br.readLine());
				if (i > 0) {
					arr[i - 1] = location - beforeLocation;
					set.add(location - beforeLocation);
				}
				beforeLocation = location;
			}

			Object[] distance = set.toArray(); // 오름차순으로 정렬된 배열로 바꿔줌

			long gcd = (Long) distance[0];
			if (distance.length > 1) {
				for (int i = 1; i < distance.length; i++) {
					long bigger = (Long) distance[i];
					long rest = 0;
					while (true) {
						rest = bigger % gcd;
						if (rest > 0) {
							bigger = gcd;
							gcd = rest;
						} else {
							break;
						}
					}
				}
			} else {
				gcd = (Long) distance[0];
			}
			
			long result = 0L;
			for (int i = 0; i < arr.length; i++) {
				result += arr[i]/gcd - 1;
			}
			
			bw.write(Long.toString(result));
			bw.flush();

			bw.close();
			br.close();

		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}

	}

}
//정렬한 후에 최대 공약수를 맨 앞에 나오는 두 개의 숫자만 고려해서 구하면 안 됨
//거리가 8, 12, 18이 나왔을 경우 이 모든 거리에서 최대 공약수는 맨 앞에 2개만을 고려하여 구한 4가 아니라 2임
//즉, 모든 숫자를 고려했을 때 최대공약수를 구해야 함