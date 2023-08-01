package 시간복잡도;

import java.util.Scanner;

public class Ex24313 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a1 = sc.nextInt();
		int a0 = sc.nextInt();
		int c = sc.nextInt();
		int n0 = sc.nextInt();
		
		sc.close();
		//g(n) = n임 -> 문제에서 O(g(n))을 O(n)라고 바꿔썼기 때문에 같다고 볼 수 있음 
		if (a1*n0 + a0 <= c*n0) {
			System.out.println(1);
		} else {
			System.out.println(0);			
		}
		
	}

}
//존재하기만 하면 됨 -> 하나라도 있으면 됨 
// -> 최소값인 n0을 넣었을 때 만족하지 않으면 모든 수가 만족하지 않음을 이용해서 풀면 됨

