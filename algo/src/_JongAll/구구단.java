package _JongAll;

import java.util.ArrayList;
import java.util.Scanner;

public class 구구단 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		
		while(true) {
			//Input Error가 날 때마다 체크해줘야 함
			if (!(a > 1 && a < 10 && b > 1 && b < 10)) { 
				System.out.println("INPUT ERROR!");
				a = sc.nextInt();
				b = sc.nextInt();
			}else {
				break;
			}
		}

		int gap = a-b > 0 ? a-b : (-1)*(a-b);
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		if (gap == 0) {
			list.add(a);
		}else {
			if (gap > 1) {
				list.add(a);
				if (a < b) {
					for (int i = 1; i < gap; i++) {
						a++;
						list.add(a);
					}
				} else {
					for (int i = 1; i < gap; i++) { //a가 b가 클 때 고려 안 함
						a--;
						list.add(a);
					}
				}
				list.add(b);
			} else {
				list.add(a);
				list.add(b);
			}
		}
		
		for (int i = 1; i <= 9; i++) {
			for (int number : list) {
				if (number*i > 9) {
					System.out.print(number+ " * " + i + " = " + number*i + "   ");
				}else {
					System.out.print(number+ " * " + i + " =  " + number*i + "   ");
				}
			}
			System.out.println();
		}
		
		sc.close();
		
	}

}
