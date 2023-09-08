package 약수_배수와소수2;

import java.util.Scanner;

public class Ex17103 {
	static boolean num[];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		num = new boolean[1000001];
		num[0] = num[1] = true;
		for (int i = 2; i * i <= 1000000; i++) {
			if (!num[i]) {
				for (int j = i + i; j <= 1000000; j += i) {
					num[j] = true;
				}
			}
		}
		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int temp = (tc+1)*2;
			int ans = 0;

			for (int j = 2; j <= temp / 2; j++) {
				if (!num[j] && !num[temp - j])
					ans++;
			}

			System.out.print(ans);
		}
		
		sc.close();
	}

}
//중괄호 없이 if문을 사용할 경우 if문 바로 밑에 한줄만 인식함 => 그 밑줄부터는 if문 블럭 밖에 있는 것으로 인식함