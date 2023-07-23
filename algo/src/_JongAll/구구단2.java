package _JongAll;

import java.util.Scanner;

public class 구구단2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int s = sc.nextInt();
		int e = sc.nextInt();

		int gap = (s - e) > 0 ? s - e : (-1) * (s - e);

		int[] arr;

		if (gap > 1) {
			arr = new int[gap + 1];

			if (s - e < 0) {
				arr[0] = s;
				for (int i = 1; i <= gap; i++) {
					arr[i] = s + i;
				}
			} else {
				arr[0] = s;
				for (int i = 1; i <= gap; i++) {
					arr[i] = s - i;
				}
			}
		} else {
			if (s - e == 0) {
				arr = new int[1];
				arr[0] = s;
			} else {
				arr = new int[2];
				arr[0] = s;
				arr[1] = e;
			}
			
		}
		int cnt = 0;
		
		for (int k = 0; k < arr.length; k++) {
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					if (arr[k]*(cnt+1) > 9) {
						System.out.print(arr[k] + " * " + (cnt+1) + " = " + arr[k]*(cnt+1) + "   ");
					} else {
						System.out.print(arr[k] + " * " + (cnt+1) + " =  " + arr[k]*(cnt+1) + "   ");
					}
					cnt++;
				}
				System.out.println();
			}
			System.out.println(); //각 구구단마다 칸 띄기
			cnt = 0; 
		}
		
		sc.close();
	}

}
//3 3 과 같이 같은 수만 입력으로 들어오는 경우 생각했어야 됨
//배열은 gap + 1이어야 함
