package 일반수학;

import java.util.Scanner;

public class Ex2292_diff {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int roomNumber = 1;
		int roomCnt = 1;
		
		while (N > roomNumber) { 
// 둘러싸고 있는 방 번호 중 가장 큰 방 번호인 roomNumber보다 크면 지나야 되는 최소 방 갯수와 함께 최대 방 번호 증가시킴
			roomNumber += 6*roomCnt;
			roomCnt++;
		}
		
		System.out.println(roomCnt);
		
		sc.close();
	}

}
