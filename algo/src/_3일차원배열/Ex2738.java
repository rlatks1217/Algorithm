package _3일차원배열;

import java.util.Arrays;
import java.util.Scanner;

public class Ex2738 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int row = sc.nextInt();
		int col = sc.nextInt();
		sc.nextLine();
		
		int[][] a = new int[row][col];
		int[][] result = new int[row][col];
		
		for (int i = 0; i < row; i++) {
			String[] arr = sc.nextLine().split(" ");
			for (int j = 0; j < arr.length; j++) {
				a[i][j] = Integer.parseInt(arr[j]);
			}
		}
		for (int i = 0; i < row; i++) {
			String[] arr = sc.nextLine().split(" ");
			for (int j = 0; j < arr.length; j++) {
				result[i][j] = a[i][j] + Integer.parseInt(arr[j]);
			}
		}
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(result[i][j] + " ");
			}
			
			System.out.println();
		}
		
		sc.close();
		
	}

}
