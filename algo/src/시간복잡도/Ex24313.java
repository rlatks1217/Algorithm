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
			if (a1*n0 + a0 <= c*n0 && c >= a1) {
				System.out.println(1);
			} else {
				System.out.println(0);			
			}
		
	}

}
//'모든' 이란 말이 있으므로 전부 만족해야 함

//a0가 음수인 경우도 생각해줘야 함 c >= a1라는 조건이 들어가야 함
//because n0이 주어졌을 때 n0부터 시작해서 모든 n에 대하여 만족해야 하는데 n0일 때는 만족하는데 1씩 n을 늘려봤을 때 만족하지 않는 경우가 생겨버림 -> 이것 때문에 c가 a1보다 같거나 크다는 조건이 필요함(작게 되면 n0 <= n이라는 범위 안에서 안 되는 경우가 생겨버리기 때문임)