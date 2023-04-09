package array_;

import java.util.Scanner;

public class Ex5597 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int students[] = new int[30];
		
		//입력값 중복 판단하고 배열에 저장
		for (int i = 0; i < 28; i++) {

			int input = sc.nextInt();
			boolean success = true;

			for (int j = 0; j < 28; j++) {
				if (students[j] == input) {
					success = false;
					break;
				}
			}
			
			if (success) {
				students[i] = input;
			} else {
				i--;
			}
		}
		
		//1부터 30까지 확인해서 students[] 즉, 체출한 학생하고 일치하는 순번일 경우 그냥 넘어가고 일치하는 수가 없을 경우 그 수를 x[]에 저장
		int[] x = new int[2]; 
		
		for (int i = 1; i <= 30; i++) {
			
			boolean success = false;
			
			for (int j = 0; j < 28; j++) {
				if (i == students[j]) {
					success = true;
					break;
				}
			}
			
			if (success != true) {
				if (x[0] != 0) {
					x[1] = i;
				}else {
					x[0] = i;
				}
			}
		}
		
		if (x[0]> x[1]) {			
			System.out.println(x[1]);
			System.out.println(x[0]);
		} else {
			System.out.println(x[0]);
			System.out.println(x[1]);
		}
			

	}

}
